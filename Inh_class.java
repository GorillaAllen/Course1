
class  P_class{
	
	String name;	
	P_class(String name)
	{
	
		this.name=name;
			
	}
	
	
	P_class(String name,int id)
	{
	
		this.name=name;
			
	}
	
	
	
}


class S_class extends P_class{
	
	
	
	S_class(String name)
	{
		super(name);	
		//this.name=name;
	}
	
	
}

class  P2_class{
	String name;	
//	P2_class(String name)
//	{
//	
//		this.name=name;
//			
//	}

	
}

class S2_class extends P2_class{
	S2_class()
	{
	
	};
	S2_class(String name)
	{
		//super(name);	
		this.name=name;
	}
	
	
}
public class Inh_class {

	public static void main(String[] args) {
	//	S_class s1 = new S_class("apple");
		S2_class s2 = new S2_class("apple");
		P2_class P1 = new P2_class();
		S2_class s3 = new S2_class();
		s3.name="apple";
		System.out.println("The s1.name is "+s3.name);
		//System.out.println("The s1.name is "+s1.name);
		// TODO Auto-generated method stub

	}

}
