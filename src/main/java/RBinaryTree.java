public class RBinaryTree<T extends Comparable<T>> {

    private Node root;
    private String text = "";
    private boolean aBoolean;

    public RBinaryTree() {
        root = null;
    }

    public void insert(T data) {
        Node nodeToBeAdded = new Node(data);
        if (root == null) {
            root = nodeToBeAdded;
            return;
        }
        if (nodeToBeAdded.compareTo(root) == -1 || root.compareTo(nodeToBeAdded) == 0) {
            if (root.left == null) {
                root.left = nodeToBeAdded;
                return;
            }
            insertHelper(nextNodeLeft(root), nodeToBeAdded);
        }
        if (nodeToBeAdded.compareTo(root) == 1) {
            if (root.right == null) {
                root.right = nodeToBeAdded;
                return;
            }
            insertHelper(nextNodeRight(root), nodeToBeAdded);
        }

    }

    public boolean doesContain(T data) {
        findNode(root, new Node(data));
        return aBoolean;
    }
    public Node removeData(T data) { 
        if (!doesContain(data)) {
            return null;
        }
        Node toBeRemoved = new Node(data);
        if (root.equals(toBeRemoved)) {
            if (root.left == null && root.right == null) {
                root = null;
                return toBeRemoved;
            }
            if(root.right == null){
                root = root.left;
                return toBeRemoved;
            }
            root = root.right;
            return toBeRemoved;
        }
        return removeDataHelper(new Node(data), root);
    }

    private Node removeDataHelper(Node toBeRemoved, Node currentNode) {
        Node placeHolder = root;
        if (toBeRemoved.equals(currentNode)) {

        }
        return toBeRemoved;
    }


    private void findNode(Node currentNode, Node toBeFound) {
        if (currentNode == null) {
            aBoolean = false;
            return;
        }
        if (currentNode.compareTo(toBeFound) == 0) {
            aBoolean = true;
            return;
        }
        if (toBeFound.compareTo(currentNode) == 1) {
            if (nextNodeRight(currentNode) == null) {
                aBoolean = false;
                return;
            }
            findNode(currentNode.right, toBeFound);
        }
        if (toBeFound.compareTo(currentNode) == -1) {
            if (nextNodeLeft(currentNode) == null) {
                aBoolean = false;
                return;
            }
            findNode(currentNode.left, toBeFound);
        }
    }


    private void insertHelper(Node currentNode, Node nodeToBeAdded) {
        if (nodeToBeAdded.compareTo(currentNode) == 1) {
            if (nextNodeRight(currentNode) == null) {
                currentNode.right = nodeToBeAdded;
                return;
            }
            insertHelper(currentNode.right, nodeToBeAdded);
        }
        if (nodeToBeAdded.compareTo(currentNode) == -1 || currentNode.compareTo(nodeToBeAdded) == 0) {
            if (nextNodeLeft(currentNode) == null) {
                currentNode.left = nodeToBeAdded;
                return;
            }
            insertHelper(currentNode.left, nodeToBeAdded);
        }
    }

    private Node nextNodeLeft(Node node) {
        if (node.left == null) {
            return null;
        }
        return node.left;
    }

    private Node nextNodeRight(Node node) {
        if (node.right == null) {
            return null;
        }
        return node.right;
    }

    @Override
    public String toString() {
        text = "";
        printInOrderTraversal(root);
        return text;
    }

    private void printInOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            printInOrderTraversal(focusNode.left);
            text += focusNode.data + "\n";
            printInOrderTraversal(focusNode.right);
        }
    }

    public void showTree() {
        printTree(root, 0);
    }

    private void printTree(Node root, int space) {
        if (root == null) {
            return;
        }
        int count = 10;
        space += count;
        printTree(root.right, space);
        System.out.print("\n");
        for (int i = count; i < space; i++) {
            System.out.print(" ");//printing space
        }
        System.out.print(root.data + "\n");
        printTree(root.left, space);
    }


    private class Node implements Comparable<Node> {
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        @Override
        public int compareTo(Node o) {
            return this.data.compareTo(o.data);
        }
    }
}