package day3;

class TransactionParty{
			String seller;
			 String buyer;
		TransactionParty(String seller, String buyer) {
					this.seller=seller;
					this.buyer=buyer;
					
				}
			
		}

class Receipt {
		TransactionParty transactionParty;
		String productsQR;
			
			Receipt( TransactionParty transactionParty, String productQR){
				this.transactionParty =transactionParty;
				this.productsQR= productQR;
			}
public	class GenerateReceipt{
		public String calcGst(Receipt r) {
			String productQR=r.productsQR;
			
			String[] products = productsQR.split("@");
			
			int[] rates = new int[3];
			int[] quantities = new int[3];
			
			for(int i=0; i<products.length && i<3;i++) {
				String[] rateAndQuantity = products[i].split(",");
				rates[i]=Integer.parseInt(rateAndQuantity[0]);
				quantities[i]=Integer.parseInt(rateAndQuantity[0]);
				
			}
			double GST_Rate=0.12;
			double Gst=((rates[0]*quantities[0]) + (rates[1]*quantities[1])+(rates[2]*quantities[2]))*GST_Rate;
			
			String formatedGst= String.format("%.2f",Gst);
			return formatedGst;
		}
		
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionParty transactionParty=new TransactionParty("Tarun", "Kumar");
		
		String productsQR="250, 10@100, 3@50, 7";
		Receipt receipt = new Receipt(transactionParty, productsQR);
		
		GenerateReceipt generateReceipt= new GenerateReceipt();
		
		String gst=generateReceipt.calcGst(receipt);
		System.out.println("Calculated Gst: "+gst+" /-");
		

	}

}
