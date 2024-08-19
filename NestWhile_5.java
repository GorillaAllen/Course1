package ex04;
import java.util.Scanner;
public class NestWhile_5 {
	
	static String subject_name(int sub_num)
	{
		String sub_name="";
		if (sub_num==1)
		{
			sub_name="國文";
		    return sub_name;	
		}
			
		else if (sub_num==2)
		{
			sub_name="英文";
		    return sub_name;	
		}
		else if (sub_num==3)
		{
			sub_name="數學";
		    return sub_name;	
		}
		else if (sub_num==4)
		{
			sub_name="社會";
		    return sub_name;	
		}
		else if (sub_num==5)
		{
			sub_name="自然";
		    return sub_name;	
		}
		else
		{
			System.out.print("您輸入錯誤");
			return sub_name;
		}
					
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		//String msg = "座號\t計概\t程設\t總分\t平均\n";
		String msg = "座號\t國文\t英文\t數學\t社會\t自然\t總分\t平均\n";
		String score = "";        // 輸入的分數
		int sum = 0; int no = 1; int sub = 0;double avg=0;    // 總分、 座號、 科目
		
		
		
		
		while (no > 0) 
			{
					System.out.print("請輸入座號: (輸入0或負值即結束)");
					
					no = Integer.parseInt(scn.nextLine());  // 讀取座號
					
					if (no > 0) 
						{
							msg += no + "號\t";  //5號   
						}	
							
					sum = 0; sub = 0; avg=0;	        // 設總分、科目為0
			
					
					while (no > 0 && ++sub <= 5) 
					//while (no > 0 && ++sub <= 2) 
						{
						
						    System.out.printf("請輸入%d號%s分數:",no,subject_name(sub));
						  //System.out.printf("請輸入%d號%s分數:",no,(sub==1 ?"計概":"程設"));
							
							score = scn.nextLine();  // 讀取分數
							msg += score + "\t";     // 將分數加入msg字串 //95  80    
							sum += Integer.parseInt(score);  // 將分數轉成整數後加入sum //(1) sum=95 + 80 --> (2)sum==175 
						}

					// avg=sum/(sub-1);   //加入平均值，整數輸出
					   avg=(float)sum/(sub-1);   //加入平均值，浮點數輸出
					  
					
					if (no > 0) 
					//{msg += sum + "\n";}     // msg字串加入換行符號
					//	{msg += sum + "\t"+avg+"\n";}     // msg字串加入換行符號，加入平均值，但無指定小數點位數
					    {msg += sum + "\t"+String.format("%.2f",avg)+"\n";}     // msg字串加入換行符號，加入平均值，有指定小數點位數
			}
		
		
		System.out.println(msg);     // 顯示msg字串
		scn.close();
	}
}
