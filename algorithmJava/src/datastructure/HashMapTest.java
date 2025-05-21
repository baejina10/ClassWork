package datastructure;

import java.util.HashMap;
import java.util.Set;

//Map
//key와 value를 저장하기 위해서 사용
//key와 value에 대한 모든 타입을 정의하고 작업
//servlet과 jsp내부에서 사용하는 데이터 저장구조가 모두 Map구조
public class HashMapTest {

	public static void main(String[] args) {
		//1. HashMap의 생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//2. 데이터를 저장하기
		// => Map은 순서가 없는 자료구조, key의 값으로 Map상에 저장될 위치를 계산해서 저장하므로 데이터를
		//    추출해서 순서대로 나오지 않는다.
		// => key는 중복되면 안된다. 동일한 키를 이용해서 요소를 저장하면 해당 키의 데이터가 업데이트된다.
		map.put("a01", 1000);
		map.put("a02", 2000);
		map.put("a03", 3000);
		map.put("a04", 4000);
		map.put("a05", 5000);
		map.put("a06", 6000);
		map.put("a06", 7000);
		
		//3. 사이즈 확인
		System.out.println("map에 저장된 요소의 갯수:"+map.size());
		//4. Map에 저장된 요소를 꺼내기 - key와 value
		System.out.println("a03키의 값=> "+map.get("a03"));
		System.out.println("a03키의 값=> "+map.get("a06"));
		//5. Map에 저장된 모든 데이터를 한 번에 꺼내기
		// => 1) 모든 키를 추출
		Set<String> keylist = map.keySet();
		// => 2) 모든 키를 순회하며 키에 대한 값을 가져오기
		for(String key:keylist) {
			System.out.println("key=> "+key+", value=-> "+map.get(key));
		}
		
		
	}

}
