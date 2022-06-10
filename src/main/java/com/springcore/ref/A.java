package com.springcore.ref;

public class A {
	private int y;
	private B obj ;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [y=" + y + ", obj=" + obj + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int y, B obj) {
		super();
		this.y = y;
		this.obj = obj;
	}
	
	

}
