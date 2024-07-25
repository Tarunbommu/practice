package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servers {
	
	public static void findError(int n, List<String> logs) {
		Map<String, Integer> errorCounts = new HashMap<>();
		
		for(String log: logs) {
			String[] parts = log.split(" ");
			String server = parts[0];
			String status=parts[1];
			
			if(status.equals("error")) {
				errorCounts.put(server, errorCounts.getOrDefault(server,0)+1);
			}
		}
		System.out.println(errorCounts);
		
		int faultyServers=0;
		for(int count:errorCounts.values()) {
			if(count>=n) {
				faultyServers+=(count/n);
			}
		}
		System.out.println(faultyServers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li= Arrays.asList("s1 error","s1 error","s1 error","s2 success","s1 error",
				"s1 error","s3 error","s3 error","s3 error","s4 error","s3 error","s4 error");
		findError(2,li);

	}

}
