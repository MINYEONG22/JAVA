package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 *	상속 관계에서의 직렬화 
 */
class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String toString() {
		return String.format("[%s,%s]",name, password);
	}
}
class User extends UserInfo implements Serializable {
	private int age;
	public User (String name, String password, int age) {
		super(name,password);
		this.age = age;
	}
	public String toString() {
		return String.format("[%s,%s,%d]",name, password,age);
	}
	// 부모 객체의 멤버를 직렬화하기. => writeObject()
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);		//writeUTF 하나하나, 전체x : String 객체를 직렬화 할 때 사용.
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
		
	}
}
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동","1234",20);
		User u2 = new User("김삿갓","5678",30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println(u1+":"+u2);
	}
}
