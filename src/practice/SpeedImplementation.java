package practice;
import java.util.*;
public class SpeedImplementation {
	
	public String setSpeed(Speed s, int spd) {
	
			if(spd<30 || spd>90) {
				try {
				throw new SpeedInvalidException("SpeedInvalidException");
			}catch(SpeedInvalidException e){
				s.speed ="invalid speed";
				System.out.println(e.getMessage());
			}
		}else {
			s.speed="valid speed";
		}
			return s.speed;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Speed:");
		int spd=sc.nextInt();
		
		SpeedImplementation si = new SpeedImplementation();
		Speed s=new Speed();
		System.out.println(si.setSpeed(s, spd));
		
		sc.close();
	}

}
