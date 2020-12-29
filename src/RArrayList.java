import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NoFixedFacet;

public class RArrayList<T> {
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
        Node node = new Node(data);
        if (isEmpty(head)) {
            head = node;
            return;
        }
        if (isEmpty(head.next)) {
            head.next = node;
            return;
        }
        Node newNode = add(head.next);
        newNode.next = node;
    }

    private Node add(Node nextNode) {
        Node previousNode = null;
        while (!isEmpty(nextNode)) {
            previousNode = nextNode;
            nextNode = nextNode.next;
        }
        return previousNode;
    }

    private boolean isEmpty(Node node) {
        return node == null;
    }

    @Override
    public String toString() {
        String linkedList = "[";
        Node node = head;
        while (node != null) {
            linkedList += (node);
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
            return "" + data;
        }
    }

}
