package com.LinkedList.Java;

public class QueueDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDelete s=new QueueDelete();
		
		s.enQueue(56);
		s.enQueue(30);
		s.enQueue(70);
		
		s.display();
		System.out.println("------------");
		s.deQueue();
		
	}
	
	int queue[]=new int[3];
	int rear;
	
	public void enQueue(int d) {
		queue[rear]=d;
		rear++;
}
	public void deQueue() {
	for(int front=0;front<rear;front++) {
		int data=queue[front];
		System.out.println(data);
	}	
}
	public void display() {
		for(int n: queue) {
			System.out.println(n);
		}
	}
}