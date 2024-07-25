package practice;

public class HeartRateCalculator {
	
	public float returnRestingHeartRate(String str) {
		String[] parts=str.split("-");
//		for(String a:parts) {
//		System.out.println(a);
//		}
//		String[] parts1 = str.split("@");
//		for(String a:parts1) {
//			System.out.println(a);
//			}
//		String ageStr=parts[1];
		String restingHeartRateStr=parts[0].replace('@', '.');
		return Float.parseFloat(restingHeartRateStr);
	}
	
	public int returnAge(String str) {
		String[] parts = str.split("@");
		String ageStr=parts[1];
		return Integer.parseInt(ageStr);
	}
	
	public int calculateMaxHeartRate(int age) {
		return 220-age;
	}
	
	public float calculateTargetHeartRate(float restingHeartRate, int maxHeartRate ) {
		return (float) (((maxHeartRate-restingHeartRate)*0.7)+restingHeartRate);
		
	}
	public String checkFitnessLevel(float targetHeartRate) {
		if(targetHeartRate>=120 && targetHeartRate<=160) {
			return "Fit";
		}else {
			return "unfit";
		}
	}
	

	public static void main(String[] args) {
		HeartRateCalculator hrCalculator = new HeartRateCalculator();
		String str = "72-5@25";
		
		float restingHeartRate=hrCalculator.returnRestingHeartRate(str);
		int age = hrCalculator.returnAge(str);
		int maxHeartRate=hrCalculator.calculateMaxHeartRate(age);
		float targetHeartRate=hrCalculator.calculateTargetHeartRate(restingHeartRate, maxHeartRate);
		String fitnessLevel = hrCalculator.checkFitnessLevel(targetHeartRate);
		
		System.out.println("Resting Heart Rate: "+ restingHeartRate);
		System.out.println("Age: "+ age);
		System.out.println("Max Heart Rate: "+ maxHeartRate);
		System.out.println("Target Heart Rate: "+ targetHeartRate);
		System.out.println("Fitness Level: "+ fitnessLevel);
		
	}

}
