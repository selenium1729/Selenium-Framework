import java.util.ArrayList;
import java.util.List;

public class StringIteration {
	public static void main(String[] args) {
		String str="Rahul shetty acacdemy";
		String[] strArr =str.split(" ");
		for(int i=0;i<strArr.length;i++) {
		System.out.println(strArr[i]);
		
		}
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
