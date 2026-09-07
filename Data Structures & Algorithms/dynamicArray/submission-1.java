class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        length = 0;
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }

        arr[length] = n;
        length++;
    }

    public int popback() {
        int e = arr[length-1];
        if (length > 0) {
            length--;
            arr[length] = 0;
        } 
        
        return e;
    }

    private void resize() {
        capacity *= 2;
        int[] arr2 = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
