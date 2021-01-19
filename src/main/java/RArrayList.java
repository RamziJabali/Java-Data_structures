public final class RArrayList<T> {
    private Node head;
    private int listSize = 0;

    public RArrayList() {
        head = null;
    }

    public int getListSize() {
        return listSize;
    }

    public RArrayList getReverseArrayList() {
        Node node = head;
        if (listSize == 1) {
            return this;
        }
        RArrayList<T> reverseArrayList = new RArrayList<T>();
        for (int i = listSize - 1; i >= 0; i--) {
            reverseArrayList.add(getAtIndex(i));
        }
        return reverseArrayList;
    }

    public void removeAll() {
        head = null;
        listSize = 0;
    }

    public T removeAtIndex(int index) {
        if (getListSize() < index) {
            return null;
        }
        listSize--;
        Node toBeRemoved = null;
        Node node = head;
        if (index == 0) {
            toBeRemoved = head;
            head = head.next;
            return toBeRemoved.data;
        }
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        toBeRemoved = node.next;
        node.next = node.next.next;
        return toBeRemoved.data;
    }

    public T removeData(T data) {
        Node toBeRemoved = null;
        if (head.equals(data)) {
            toBeRemoved = head;
            head = head.next;
            listSize--;
            return toBeRemoved.data;
        }
        if (getLastNode().equals(data)) {
            return removeAtIndex(listSize - 1);
        }
        Node previous = null;
        Node node = head.next;
        for (int i = 0; i < getListSize(); i++) {
            previous = head;
            if (node.equals(data)) {
                break;
            }
            previous = previous.next;
            node = node.next;
        }
        if (previous == null) {
            return null;
        }
        toBeRemoved = node;
        System.out.println("Previous node: " + previous);
        previous.next = previous.next.next;
        listSize--;
        return toBeRemoved.data;
    }

    public void add(T data) {
        listSize++;
        final Node nodeToAdd = new Node(data);
        if (isEmpty()) {
            head = nodeToAdd;
            return;
        }
        getLastNode().next = nodeToAdd;
    }

    public T getLast(){
        return getLastNode().data;
    }
    private Node getLastNode() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public T getFirst() {
        return head.data;
    }

    public T getAtIndex(int index) {
        if (getListSize() < index) {
            return null;
        }
        Node node = head;
        if (index == 0) {
            return node.data;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public boolean equals(Object obj) {
        if (((RArrayList) obj).getListSize() != getListSize()) {
            return false;
        }
        Node nodeThis = head;
        Node nodeAway = ((RArrayList) obj).head;
        for (int i = 0; i < getListSize(); i++) {
            if (!(nodeThis.data.equals(nodeAway.data))) {
                return false;
            }
            nodeAway = nodeAway.next;
            nodeThis = nodeThis.next;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (isEmpty()) {
            return 0;
        }
        int linkedListHashCode = 0;
        Node node = head;
        while (node != null) {
            linkedListHashCode += node.data.hashCode();
            node = node.next;
        }
        return linkedListHashCode;
    }

    @Override
    public String toString() {
        String linkedList = "[";
        Node node = head;
        while (node != null) {
            linkedList += node.toString();
            linkedList += ",";
            node = node.next;
        }
        int lastComma = linkedList.lastIndexOf(",");
        if (lastComma != -1) {
            linkedList = linkedList.substring(0, linkedList.length() - 1);
        }
        linkedList += ']';
        return linkedList;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        @Override
        public boolean equals(Object obj) {
            return obj.equals(data);
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}