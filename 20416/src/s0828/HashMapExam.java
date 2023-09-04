package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> map = new HashMap<>();
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		System.out.println("총학생수"+map.size());
		System.out.println("*******************");
		System.out.println("유재석의 점수:"+map.get("유재석"));
		System.out.println("박명수의 점수:"+map.get("박명수"));
		System.out.println("김종국의 점수:"+map.get("김종국"));
		System.out.println("*******************");
		if(map.containsKey("서장훈")) {
			int point = map.get("서장훈");
			map.put("서장훈", ++point);
			System.out.println("서장훈의점수:" + map.get("서장훈"));
		}
		else {
			map.put("서장훈", 1);
			System.out.println("새로들어온서장훈점수1");
		}
		System.out.println("*******************");
		
		
		map.remove("유재석");
		System.out.println(map.get("유재석"));
		System.out.println("*******************");
		map.clear();
		if(map.isEmpty())
			System.out.println("학생수" + map.size());
		System.out.println("*******************");
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		System.out.println("*******************");
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		for (int value: map.values()) {
			System.out.println(value);
		}
		System.out.println("*******************");
		for(String key:map.keySet()){
			System.out.println("고객이름:"+key + "포인트" + map.get(key));
		}
	}

}
