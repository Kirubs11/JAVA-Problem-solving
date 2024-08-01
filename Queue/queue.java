class queue {

    int a[] = new int[9];
    int front = -1;
    int rear = -1;
  
    void enqueue(int data) {
      if (rear == 9) {
        System.out.printf("Queue is full");
      } else {
        a[++rear] = data;
      }
    }
  
    void dequeue() {
      if (front == rear) {
        System.out.printf("Queue is empty");
      } else {
        System.out.printf("Element dequeued is %d", a[++front]);
      }
    }
  
    void display() {
      for (int i = front + 1; i <= rear; i++) {
        System.out.printf("%d ", a[i]);
      }
    }
  
    void peek() {
      if (front == rear) {
        System.out.printf("Queue is empty");
      } else {
        System.out.printf("Element at front is %d", a[front + 1]);
      }
    }
  
    public static void main(String[] args) {
      queue q = new queue();
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);
      q.enqueue(6);
      q.enqueue(7);
  
      System.out.println("Queue is:");
      q.display();
  
      System.out.println();
      q.dequeue();
      q.dequeue();
      q.dequeue();
      q.display();
  
    }
  }