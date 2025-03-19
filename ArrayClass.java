package day2.com;
    import java.util.Arrays;
	import java.util.Scanner;

	public class ArrayClass {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] obj = new String[5];
			for(int i=0;i<obj.length;i++) {
					obj[i] = scan.next();
			}
			System.out.println(Arrays.toString(obj));
		}
	}


