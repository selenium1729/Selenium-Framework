import java.util.ArrayList;

public class ArrayListJava {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Rahul");
		arr.add("Shetty");
		arr.add("Acacdemy");
//		arr.remove(1);
		System.out.println(arr.get(1));
		System.out.println(arr);
		System.out.println("______________________");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("__________________________");
		for (String s : arr) {
			System.out.println(s);
		}

		System.out.println(arr.contains("Acacdemy"));

	}
}
