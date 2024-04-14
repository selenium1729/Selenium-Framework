
public class ArrayDecalaration {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("Print array" + arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
		int[] arr1= {1,2,3,4,5,6,7};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		String[] str= {"Manu","Tanu","let"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		for(String s:str) {
			System.out.println(s);
		}
	}
}
