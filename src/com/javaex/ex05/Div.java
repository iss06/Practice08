package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	if (b == 0) {
    		System.out.println("0으로 나눌 수 없습니다.");
    		return 0;
    	}
    	return a / b;
    }

}
