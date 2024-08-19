import java.util.Scanner;

class Stu_data_1{
	String name;
	int set_num,lucky_num;
	static int class_num=109;
	
	
	//Stu_data s1=new Stu_data("louis",1);
	//Stu_data s2=new Stu_data("eric",2);
	
	Stu_data_1(String name1,int set_num1 ){
       this.name=name1;
       this.set_num=set_num1;
        
        
		this.lucky_num=(int)(Math.random()*100);
		System.out.println("亂數"+ lucky_num);
		
		if (lucky_num==0)
			lucky_num=1;	
		
	}
	
	//s1.show_stu_profile();
	
	//s2.show_stu_profile();
	void show_stu_profile()
	
	{
		System.out.println("***** stu_的名字為 : *****  "+name);
		System.out.println("***** stu_的class_num為 : *****  "+class_num);
		System.out.println("***** stu_的set_num為 : *****  "+set_num);
		System.out.println("***** stu_的lucky_num為 : *****  "+lucky_num);
			
	}	
	
}
public class Stu_profile_class_1{

	public static void main(String[] args) {
		String tmp_name;
		int tmp_set_num;
		// TODO Auto-generated method stub

		Stu_data_1 s1=new Stu_data_1("louis",1);
		
		s1.show_stu_profile();
		
		Stu_data_1 s2=new Stu_data_1("eric",2);
		
		s2.show_stu_profile();
		
		Stu_data_1 s3=new Stu_data_1("nick",3);
		
		s3.show_stu_profile();
				
		
		System.out.println();
		System.out.println("*********************************************  ");	
		System.out.println("***** object array format  : *****  ");	
		System.out.println("*********************************************  ");	
		System.out.println();
	
	
		
		
		// object array format 固定大小，且依序輸入	
//		
//		int         x[] = new int[5];
//		x[0]=10;
//				x[1]=20;
//						x[2]=30;
//								x[3]=40;
//										x[4]=50;
//				
		//Stu_data_1 s1=new Stu_data_1("louis",1);	
										
//		
//		Stu_data_1 s22[]= new Stu_data_1[3];	
//		s22[0]=new Stu_data_1("alex",11);
//		s22[1]=new Stu_data_1("alvin",21);
//		s22[2]=new Stu_data_1("howard",31);
//		
//	
//		s22[0].show_stu_profile();
//		s22[1].show_stu_profile();
//		s22[2].show_stu_profile();
//		
//		
		// object array format 固定大小，且依序輸入			
		

		
		
		
		
		// object array format 固定大小，且迴圈輸入	
		
		Stu_data_1 s22[]= new Stu_data_1[3];
		Scanner s=new Scanner(System.in);
		
		for (int i=0;i<=2;i++)
		{	
			System.out.println("請輸入姓名");
			tmp_name=s.next();
			System.out.println("請輸入座號");
		    tmp_set_num=s.nextInt();	   
		    s22[i]=new Stu_data_1(tmp_name,tmp_set_num);
		}
		
		for (int i=0;i<=2;i++)
		{		
		   s22[i].show_stu_profile();
		}
		
		s.close();
		// object array format 固定大小，且迴圈輸入		
	
	
	}

}
