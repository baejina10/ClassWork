package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("oracle");
        list.add("servlet");
        list.add("jsp");
        list.add("spring");

        //List -> Set으로 변환
        //HashSet<String> set = new HashSet<>(list);

        //List -> Map으로 변환
        // => map의 key : "mymap"+i
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i=0;i<list.size();i++) {
        	String data = list.get(i);
        	map.put(("mymap"+i), data);
        }
        //map의 데이터 출력하기 => 출력값이 순서대로 잘 안나온다고 함. 
        Set<String> keyList = map.keySet();
        for(String key:keyList) {
        	System.out.println("key=> "+key+" ,valaue=> "+map.get(key));
        }
    }
}
