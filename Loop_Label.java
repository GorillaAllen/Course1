public class Loop_Label{
	public static void main(String[] args){
		int athClass = 5;
		boolean isFaint = true;

		labelA:
		for(int i=1; i<=8; i++){
			System.out.println("�}�l�W��" + i + "���");
			if(i==athClass){
				for(int d=0; d<1000;d++){
					if(isFaint){
						System.out.println("���ˤF�A�e��|");
						break labelA;
					}
				System.out.println("�]�F" + d + "����");
				}
			}
		}
	}
}