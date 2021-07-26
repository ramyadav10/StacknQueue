package com.LinkedList.Java;

public class QueueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList s=new QueueList();
		
		s.enQueue(56);
		s.enQueue(30);
		s.enQueue(70);
		
		s.display();
		
	}
	
	int queue[]=new int[3];
	int rear;
	public void enQueue(int d) {
		queue[rear]=d;
		rear++;
}
	
	public void display() {
		for(int n: queue) {
			System.out.println(n);
		}
	}
}
