package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 *	ObjectOutputStream 예제
 *	 1. 객체를 외부로 전송할 수 있는 스트림
 *	 2. 전송이 되는 객체는 반드시 Serializable 인터페이스 객체여야 함 => 직렬화라고 함. (객체를 외부로 전송할 수 있냐)
 *		=> Serializable 인터페이스를 구현하지 않은 객체를 직렬화 할 경우, NotSerializableException 예외 발생
 *	 3. ObjdectInputSTream 객체로 읽을 수 있음 
 */
class Customer implements Serializable {
	private String name;
	private transient int age;			// transient: 직렬화(전송)대상에서 제외되는 변수 
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("[%s:%d]",name,age);
	}
}
public class ObjectOutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동",20);
		Customer c2 = new Customer("김삿갓",30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println(c1+","+c2);
		oos.close();
		fos.close();
	}
}
