class BuildingDesign{
	String Name = "Building A design";
	int Size = 30;
	int Price = 3000000;
	int Quantity = 20;
}

public class Excercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildingDesign A1 = new BuildingDesign();
		A1.Name = "A1 Building";
		A1.Price = 3500000;
		
		BuildingDesign A2 = new BuildingDesign();
		A2.Name = "A2 Building";
		A2.Quantity = 30;
		
		System.out.println(A1.Name);
		System.out.printf("size: %d\n", A1.Size);
		System.out.printf("Price: %d\n", A1.Price);
		System.out.printf("Quantity: %d\n", A1.Quantity);
		System.out.println();
		System.out.println(A2.Name);
		System.out.printf("size: %d\n", A2.Size);
		System.out.printf("Price: %d\n", A2.Price);
		System.out.printf("Quantity: %d\n", A2.Quantity);
		
	}

}
