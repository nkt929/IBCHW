import java.util.Arrays;


public class List {

    int length;
    Node head;
    Node tail;

    void add(int value) {
        if (tail == null) {
            tail = new Node(value);
            head = tail;

        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
        length++;

    }

    public List() {
        head = null;
        tail = null;
        length = 0;
    }

    void RemoveAfter(Node n) {
        int i = 0;
        Node a = head;
        while (i < length - 1) {
            if (a.next == n) {
                a = a.next.next;
                length--;
                return;
            } else {
                i++;
                a = a.next;
            }
        }


    }

    void addAfter(Node n, int value) {
        int i = 0;
        Node a = head;
        while (i < length) {
            if (a == n) {
                Node newNode = new Node(value);
                newNode.next = a.next;
                a.next = newNode;
                length++;
                return;
            } else {
                i++;
                a = a.next;
            }
        }


    }

    Node find(int n) {
        int i = 0;
        Node a = head;
        while (i < length) {
            if (a.value == n)
                return a;
            else
                i++;

        }
        return null;
    }

    void findAndRemove(int n) {
        int i = 0;
        Node a = head;
        while (i < length - 1) {
            if (a.next.value == n) {
                a.next = a.next.next;
                length--;
                return;
            } else {
                i++;
                a = a.next;
            }
        }


    }

    void sortAscending() {
        Node a = head;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = a.value;
            a = a.next;
        }
        Arrays.sort(arr);
        tail = null;
        head = null;
        length = 0;
        for (int i = 0; i < arr.length; i++)
            add(arr[i]);
    }

    void sortDescending() {
        Node a = head;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = a.value;
            a = a.next;
        }
        Arrays.sort(arr);
        tail = null;
        head = null;
        length = 0;
        for (int i = arr.length - 1; i >= 0; i--)
            add(arr[i]);
    }
    void inverse() {
        Node a = head;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = a.value;
            a = a.next;
        }
        tail = null;
        head = null;
        length = 0;
        for (int i = arr.length - 1; i >= 0; i--)
            add(arr[i]);
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int get() {
            return this.value;
        }

        public Node next() {
            return this.next;
        }

    }
}