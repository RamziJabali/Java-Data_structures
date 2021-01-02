public final class RArrayList<T> {
    private Node head;
    private int listSize = 0;

    public RArrayList() {
        head = null;
    }

    public int getListSize() {
        return listSize;
    }

    public void clearArrayList() {
        head = null;
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

    public Node getFirstNode() {
        return head;
    }

    public Node getNodeAt(int index) {
        if (getListSize() < index) {
            return null;
        }
        Node node = head;
        if (index == 0) {
            return node;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
        public String toString() {
            return data.toString();
        }
    }

}
