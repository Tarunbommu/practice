package day5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, String> map = new HashMap<>();
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(101, "Tarun");
		map.put(102, "Loki");
		map.put(103, "sowj");
		map.put(104, "vinee");
		map.put(104, "nik");
		map.put(106, "Sowmya");
		map.put(107, "harani");
		map.put(108, "Keerthna");
//		map.put(null, null);
		
		System.out.println(map);
//		map.remove(null);
//		map.remove(109);
		
		for(Map.Entry<Integer, String> mp: map.entrySet()) {
			System.out.println(mp.getKey()+":"+mp.getValue());
		}

	}

}
