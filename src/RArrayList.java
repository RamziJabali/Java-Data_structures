public final class RArrayList<T> {
    private Node head;
    private int listSize = 0;

    public RArrayList() {
        head = null;
    }

    public int getListSize() {
        return listSize;
    }

    public void add(T data) {
        listSize++;
        final Node nodeToAdd = new Node(data);
        if (isEmpty()) {
            head = nodeToAdd;
            return;
        }
        Node lastNode = getLastNode();
        lastNode.next = nodeToAdd;
    }

    public Node getLastNode() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return head == null;
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

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}
