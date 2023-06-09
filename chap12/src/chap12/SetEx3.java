package chap12;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 *	TreeSet : 중복불가, 정렬 됨 
 *	Set 인터페이스의 하위 인터페이스인 SortedSet의 구현 클래스
 *	
 */
public class SetEx3 {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);	// 정렬해줌. 대문자가 소문자보다 앞.
		for(String s : set) {
			System.out.print(s+",");
		}
		System.out.println();
		System.out.println("from: "+ from +", to: "+to);
		System.out.println(set.subSet(from, to));
		// subSet : 부분집합. bat부터, d까지. d 앞까지 
		System.out.println("from: "+ from +", to: "+to+"zzzz");
		// bat 부터, dzzzz 앞까지 -> dzzzz 전까지.
		// from 부터, to 사이(앞까지)의 부분집합. 
		System.out.println(set.subSet(from, to+"zzzz"));
		
		System.out.println("역순으로 정렬하기");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
		
		System.out.println("대소문자 구분없이 정렬하기");
		set = new TreeSet<>(new Comparator<String>()  {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});		// 대소문자 구분 없이 정렬하니까 중복 불가 - Car, dZZZZ 사라짐.
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
	}
	
}
