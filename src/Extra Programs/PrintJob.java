class PrintJob {

    int[] job;
    int newJob, capacity, front, rear;

    PrintJob() {
        capacity = 20;
        front = -1;
        rear = -1;
    }

    void createJob() {
        job = new int[capacity];
    }

    void addJob() {
        if (rear != front) {
            rear = (rear + 1)%capacity;
            job[rear] = newJob;
        } else
            System.out.println("PrintJob is full, cannot add anymore.");
    }

    void removeJob() {
        if (rear == front && rear == -1)
            System.out.println("PrintJob is empty");
        else {
            rear = (rear - 1)%capacity;
            if (rear == front) {
                rear = -1;
                front = -1;
            }
        }
    }
}
