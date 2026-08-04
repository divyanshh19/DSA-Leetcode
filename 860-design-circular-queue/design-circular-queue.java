class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int count;
    int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
        count = 0;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(size == count){
            return false;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count == 0){
            return false;
        }
        int value = arr[front];
        front = (front + 1) % size;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size ==  count){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */