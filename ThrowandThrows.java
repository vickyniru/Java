package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowandThrows {
	public static void main(String[] args) {
		ThrowandThrows tt =new ThrowandThrows();
		tt.m1();
		
	}

	public void m1()throws ArithmeticException,InputMismatchException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Result : " + n1/n2);
		System.out.println();
	}
}
