package com.LinkedList.Java;

public class StackCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackCreate s1=new StackCreate();
		s1.push(70);
		s1.push(30);
		s1.push(56);
	
		s1.display();
	}
	
	int stack[]=new int[3];
	int top=0;

	public void push(int d) {
		stack[top]=d;
		top++;
}
	
	public void display() {
		for(int n: stack) {
		System.out.println(n);
		}
	}

}
