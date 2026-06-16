public class MaxHeap {

    int arr[];
    int size;
    int capacity;

    // Constructor
    public MaxHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    // Insert element
    void insert(int x) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        int i = size;
        arr[size] = x;
        size++;

        // Heapify Up
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;

            i = parent(i);
        }
    }

    // Heapify Down
    void heapify(int i) {
        int largest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < size && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(largest);
        }
    }

    // Remove maximum element
    public int pop() {
        if (size == 0) {
            System.out.println("Heap is underflow");
            return -1;
        }

        int root = arr[0];

        arr[0] = arr[size - 1];
        size--;

        heapify(0);

        return root;
    }

    // Peek maximum element
    public int peek() {
        if (size == 0) {
            return -1;
        }
        return arr[0];
    }

    // Display heap
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(60);

        System.out.println("Heap:");
        h.display();

        System.out.println("Deleted: " + h.pop());

        System.out.println("After deletion:");
        h.display();
    }
}
