package com.maven.calc1;



public class Calculator_1 {
	


		public int addition (int a, int b) {
			return a+b;
		}
		
		public int subtraction (int a, int b) {
			return a-b;
		}
		
		public int multiplication(int a, int b) {
			return a*b;
		}
		
		public double division(double a, double b) {
			return a/b;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Calculator_1 cal = new Calculator_1();
			
			System.out.println(cal.addition(12, 10));
			System.out.println(cal.subtraction(12, 8));
			System.out.println(cal.multiplication(8, 10));
			System.out.println(cal.division(20, 5));
		

		}	

	

}
