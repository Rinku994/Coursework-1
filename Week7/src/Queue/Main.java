package Queue;

public class Main {
	
	public static void main(String[] args) {
		CircularQueue soft= new CircularQueue();
		soft.enqueue(20);
		soft.enqueue(40);
		soft.enqueue(50);
		soft.enqueue(70);
		soft.enqueue(80);
		soft.enqueue(90);
		soft.dequeue();
		soft.display();
	}

}

