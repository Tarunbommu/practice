package labbook;
import java.util.*;
class Person {
	private String firstName;
	private String lastName;
	private String gender;
	
	public Person(String firstName, String lastName, String gender ) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void  display() {
		System.out.println("Person Details");
		System.out.println("---------------------");
		System.out.println("First Name: "+this.getFirstName());
		System.out.println("Last Name: "+this.getLastName());
		System.out.println("Gender: "+this.getGender());
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name:");
		String firstName=sc.nextLine();
		if(firstName.length() == 0 ){
			try {
				throw new BlankException ("The field is  blank please enter the first name");
			}catch(BlankException e){
			System.out.println(e.getMessage());
			}
		}else {

			System.out.println("Enter the last name:");
			String lastName=sc.nextLine();
			
			if(lastName.length() == 0) {
				
				 try{
					throw new BlankException ("The field is  blank please enter the first name");
				}catch(BlankException e){
				System.out.println(e.getMessage());
				}
			}
			
			System.out.println("Enter the gender:");
			String gender=sc.nextLine();
			
			Person p=new Person(firstName, lastName, gender);
			p.display();
		}
		sc.close();
		}
}