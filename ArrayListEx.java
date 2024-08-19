import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java程式設計");
		list.add("SCJP認證手冊");
		list.add(2, "VB2008程式設計");
		list.set(0, "SCWCD認證手冊");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}