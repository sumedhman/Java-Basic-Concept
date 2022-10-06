package edubridge.com;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
	static ArrayList<Integer> arrayList =new ArrayList<Integer>();
	public static void main(String[] args) {
		int number =3;
		System.out.println(number);
	    Scanner obj = new Scanner(System.in);
	    System.out.println("While loop:");
	    int i=0;
		while(i<3) {
		arrayList.add(obj.nextInt());
		i++;
		}
		System.out.println("Advance for loop:");
			for(int temp:arrayList){
			System.out.println(temp);
	}
			System.out.println("for loop:");
			for(int k=0;k<3;k++) {
				System.out.println(arrayList.get(k));
			}
			
	}
}
