	public class Switch_case {
		   public static void main(String args[]){
			  int score= 95 ;
			  char grade = 'A';
			  if(score >= 90) {
				  grade = 'A';
		      switch(grade) {
		         case 'A' :
		            System.out.println("Grade A"); 
		            break;
		         case 'B' :
		        	System.out.println("Grade B");
		        	break;
		         case 'C' :
		            System.out.println("Grade C");
		            break;
		         case 'D' :
		            System.out.println("Grade D");
		            break;
		         case 'F' :
		            System.out.println("Failure");
		            break;
		         default :
		            System.out.println("未符合判斷");
		      }
		      System.out.println("你的成績是 " + grade);
		   }
		}
	}
