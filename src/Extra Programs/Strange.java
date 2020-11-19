class Strange {

    int[] elements;
    int capacity;
    int top;

    Strange(int capacity) {
        elements = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    void pushItem(int value) {
        if (top != capacity -1) {
            elements[++top] = value;
        } else {
            System.out.println("Strange is full. Cannot push item");
        }
    }

    int popItem() {
        if (top != -1)
            return elements[top--];
        else {
            System.out.println("Strange is empty. Returning -9999");
            return -9999;
        }
    }
}
