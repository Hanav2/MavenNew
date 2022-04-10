package com.craft.calculator;

//import static org.junit.Assert.fail;
//
//import org.junit.Test;

//Notes

/* when we do test case using maven we don't have to download the jar file like we did yesterday using java 
 * go to mvn repository on google
 *  search for junit click the version 
 * copy the dependency that is written in the box
 * go to pom.xml ---->  click on top of  </project> enter to make space then write  <dependencies> paste what you copied in here  </dependencies> 
 * 
 * search for hamcrest version --> copy the dependency that is in the box 
 * go to pom.xml  ---> paste it right under the dependency you pasted for j unit.
 * 
 * when you save it ( ctrl + s ) it will download the jar file by it self and it create maven depndencies and save it there.
 * when you click Maven Dependencies, you might see more than two jar files
 *  it is because maven by it self will save all the dependencies it might think is important for the project
 *  
 *  Go to src/test/java --> creat a package (the normal way) 
 *  right click on your package --> New --> Junit test case -->
 *  Once you click Junit test case, all you have to do is  on top click on New Junit 4 test if it wasn't already clicked
 *  and write the name of your class on the name section
 *  
 *  once it opens the test case 
 *  
 * comment or delete this  @Test
	public void test() {
		fail("Not yet implemented");
	}
	* 
	* create an object using your command code name --> don't forget to import it! and then the        $  rest is same as what we did yesterday 
 */


/* To write code we use src/main/java
 * To write testcase use src/test/java
 * 
 */

public class CalculatorM {
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

		CalculatorM cal = new CalculatorM();
		
		System.out.println(cal.addition(12, 10));
		System.out.println(cal.subtraction(12, 8));
		System.out.println(cal.multiplication(8, 10));
		System.out.println(cal.division(20, 5));
	

	}	

}
