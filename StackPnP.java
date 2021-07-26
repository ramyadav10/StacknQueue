package com.LinkedList.Java;

public class StackPnP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackPnP s1=new StackPnP();
		s1.push(70);
		s1.push(30);
		s1.push(56);
		s1.peek();
		s1.display();
		System.out.println("----------");
		s1.pop();
		System.out.println("----------");
		s1.display(); 
		System.out.println("----------");
		s1.peek();
		s1.display();
	}
	
	int stack[]=new int[3];
	int top=0;

	public void push(int d) {
		stack[top]=d;
		top++;
}
	
	public void peek() {
			int data=stack[top-1]; 
			System.out.println(data);
	}
	public void pop() {
		for(int i=top-1;i>=0;--i) {
			int data=stack[i]; 
			stack[i]=0; 
			System.out.println(data);
		}
	}
	public void display() {
		for(int n: stack) {
			System.out.println(n);
		}
	}

}
