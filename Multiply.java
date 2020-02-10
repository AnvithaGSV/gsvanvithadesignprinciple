package com.design;

public class Multiply extends Calculator {
	private int num1,num2;
	
	public Multiply(int a,int b){
		num1=a;
		num2=b;
		Calculate(a,b);
	}
	float num3,num4;
	public Multiply(float a,float b){
		num3=a;
		num4=b;
		Calculate(a,b);
	}
	
	public void Calculate(int num1,int num2) {
		// TODO Auto-generated method stub
		super.Calculate("multiplication between "+num1+" and "+num2);
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
	public void Calculate(float num1,float num2) {
		// TODO Auto-generated method stub
		super.Calculate("multiplication between "+num1+" and "+num2);
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}

}
