public class Loop_Label{
	public static void main(String[] args){
		int athClass = 5;
		boolean isFaint = true;

		labelA:
		for(int i=1; i<=8; i++){
			System.out.println("開始上第" + i + "堂課");
			if(i==athClass){
				for(int d=0; d<1000;d++){
					if(isFaint){
						System.out.println("昏倒了，送醫院");
						break labelA;
					}
				System.out.println("跑了" + d + "公尺");
				}
			}
		}
	}
}