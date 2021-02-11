package com.anoop.java8_example.lambdaexpression;

public class LambdaExpresssionExample1 {

	public static void main(String[] args) {
 
		//Example 1
		FunctInterface1 functInterface1=()->System.out.println("Test Labmda expression");
		
		functInterface1.m1();
		
		//Example 2
		FunctInterface2 functInterface2=(a,b)-> System.out.println((a+b));
		functInterface2.m2(1, 3);
		
		//Example 3
		FunctInterface3 functInterface3=(a,b)->a+b;
		int sum=functInterface3.m3(3, 4);
		System.out.println(sum);
		
		//Example 4
		FunctInterface3 functInterface4=(a,b)->a*b;
		int multiplication=functInterface4.m3(3, 4);
		System.out.println(multiplication);
		
		
	}

}
