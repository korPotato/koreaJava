package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : 배열을 좀 더 쉽게 사용하기 위해 자바에서 제공해주는 클래스 (자바에서 만든 배열)
		// List, Set, Map
		// List : 삭제 및 삽입이 쉽고 순서를 갖고 있음
		// Set : 중복 안됌, 순서 없음, Iterator
		// Map : 키와 값으로 이루어짐, 순서가 아닌 키로 관리
		
		__List lst = new __List();
//		lst.go();
		__Set st = new __Set();
//		st.go();
		__Map m = new __Map();
		m.go();
	}
}

class __List{
	ArrayList<String> arr =new ArrayList<>();		// 추가, 수정, 삭제가 쉬운 배열
	public void go() {
		// 추가 add
		arr.add("한개");
		arr.add("두개");
		arr.add("세개");
		arr.add("네개");
		
		// 삽입 add
		arr.add(0,"영개");
		
		// 조회 get
		System.out.println(arr.get(1));
		
		// 삭제 remove
		arr.remove(0);
		arr.remove("네개");
		
		// 수정 set
		arr.set(0, "첫번쨰");
		System.out.println("=============");
		// 전체 조회 size + get
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}

class __Set{
	Set<String> hs = new HashSet<>(); 		// 다형성 : 자식클래스를 객체화할 때 부모클래스를 자료형으로 사용해도 됨
	public void go() {
		// 추가 add (중복X)
		hs.add("한개");
		hs.add("한개");
		hs.add("한개");
		hs.add("두개");
		
		// 전체 조회 Iterator
		// 이터레이터는 화살표 같은 역할을 한다, 맨앞을지정하다, 헤쉬이터스를 하면 다음것을 지정한다.
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {		// 다음 것이 있니?
			 String str = iter.next();		// 현재 것를 반환(다음 것을 지정)
			 System.out.println(str);
			 
		}
	}
}

class __Map{
	HashMap<Integer, String> hm = new HashMap<>();		// 웹에서 자주 사용, 순서가 아닌 내가 지정한 키워드로 보관
	public void go() {
		// 추가 put
		hm.put(100, "백");
		hm.put(90, "구십");
		hm.put(200, "이백");
		hm.put(150, "백오십");
		hm.put(150, "key는 중복이안됩니다");
		hm.put(150, "key가 같으면 덮어씁니다.");
		
		// 조회 get
		System.out.println(hm.get(150));
		System.out.println(hm.keySet());
		
		// 전체 조회 Set
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key+":"+hm.get(key));  		// 키 : 값
			
			// set은 순서가 없어 출력이 뒤죽박죽으로 나온다
		}
		// Map 자체를 보기
		System.out.println(hm);
		
	}
}
