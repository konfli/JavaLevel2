package HomeWork7;


public class TwoDirectionalList implements DirectionalList {


    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(String val) {
        Node f = first;
        Node newNode = new Node(val, null, f);
        first = newNode;
        if (f == null)
            setLast(newNode);
        else
            f.setPrev(newNode);
        size++;
        
    }

    private void addLast(String val) {
        Node l = last;
        Node newNode = new Node(val, l, null);
        last = newNode;
        if (l == null)
            setFirst(newNode);
        else
            l.setNext(newNode);
        size++;
    }
    public boolean add(String val) {
        addLast(val);
        return true;
    }

    @Override
    public boolean remove(String val) {
        if (first.getVal().equals(val)) {
            if (first.getNext() == null) {
                first = null;
            } else {
                first = first.getNext();
            }
            size--;
            return true;
        }

        Node current = first.getNext();
        Node prev = first;

        while (current != null) {
            if (current.getVal().equals(val)) {
                prev.setNext(current.getNext());
                size--;
                return true;
            } else {
                prev = current;
                current = current.getNext();
            }
        }

        return false;
    }
    @Override
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getLast() {
        return last;
    }

    @Override
    public int size() {
        return size;
    }

    public class Node {
        private String val;
        private Node next;
        private Node prev;

        public Node(String val, Node prev, Node next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public String getVal() {
            return val;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}