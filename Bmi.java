
public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// String name="apple";		
//     double Hei=170,Wei=68;
//     
//     double Hei_m=Hei/100;
     
    // double Hei_m=170/100.;
          
//     System.out.println("(static value)Hei_m is  = " +Hei_m);
//	 //double bmi=Wei/(Hei/100)*(Hei/100);
//     
//	 double bmi=Wei/(Hei_m*Hei_m);
//	// System.out.println("(static value)Your name is  = " +name);
	 
	 
//     System.out.println("(static value)Your Bmi is  = " +bmi);
     
   
     String name2=args[0];
     
     double height = Double.parseDouble(args[1]);
     double weight = Double.parseDouble(args[2]);
     
     double bmi2=weight/((height /100)*(height /100));	
     
     System.out.println("(input value)Your name is  = " +name2);
     System.out.println("(input value) Your Bmi is  = " +bmi2);
		
	}

}
