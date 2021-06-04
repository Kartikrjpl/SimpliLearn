package June4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial_example  {
	public static void main(String[] args) throws IOException {
		Student obj = new Student("Kartik",101,"Delhi",4);
		FileOutputStream fos = null  ;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C://Users//Kartik//Documents//Fast Retailing//Technical Training//SimpliLearn//simply//src//June4//Student.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("serialized!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			oos.close();
			fos.close();
		}
		
	
	
	Student o = null;
	try {
		FileInputStream fis = new FileInputStream("C://Users//Kartik//Documents//Fast Retailing//Technical Training//SimpliLearn//simply//src//June4//Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		o = (Student) ois.readObject();
		ois.close();
		fis.close();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	System.out.println("Deserialized Student name"+o.getName());
	

}
}

class Student implements Serializable {
	private String Name;
	private int sec;
	
	private String city;
	private int frnds;
	
	public Student(String name, int sec, String city, int frnds) {
		
		Name = name;
		this.sec = sec;
		this.city = city;
		this.frnds = frnds;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFrnds() {
		return frnds;
	}

	public void setFrnds(int frnds) {
		this.frnds = frnds;
	}
	
	

}
