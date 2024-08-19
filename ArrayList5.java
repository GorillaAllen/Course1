import java.util.*;

class ArrayList5 {
	public static void main(String args[]) {
		// Creating user-defined class objects
		SchoolKid s1 = new SchoolKid(101, "Sonoo", 23);
		SchoolKid s2 = new SchoolKid(102, "Ravi", 21);
		SchoolKid s3 = new SchoolKid(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<SchoolKid> al = new ArrayList<SchoolKid>();
		al.add(s1);// adding SchoolKid class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			SchoolKid st = (SchoolKid) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class SchoolKid {
	int rollno;
	String name;
	int age;

	SchoolKid(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}