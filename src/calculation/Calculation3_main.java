package calculation;

import java.util.Scanner;

public class Calculation3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number m >");
		int m = Integer.parseInt(scan.next());
		
		System.out.print("Input Number n >");
		int n = Integer.parseInt(scan.next());
		
		Calculation3_lib clib = new Calculation3_lib(m,n);
		System.out.println("m * n= "+clib.getProduct());
	}

}
