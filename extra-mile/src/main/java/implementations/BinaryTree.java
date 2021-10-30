package implementations;

public class BinaryTree {
    static class Node{
        Node left;
        Node right;
        int number;
        public Node(int number){
            this.number = number;
        }
        public Node(int number, Node left, Node right){
            this.number = number;
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    public BinaryTree(){

    }
    public BinaryTree(int number){
        root = new Node(number);
    }
    public void insert(int number){
        if (root == null) {
            root = new Node(number);
        }
        Node current = root;
        while (current != null){
            if (current.number > number){
                if (current.left == null){
                    current.left = new Node(number);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null){
                    current.right = new Node(number);
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public boolean contains(int number){
        Node current = root;
        while (current != null){
            if (current.number == number){
                return true;
            } else if (current.number > number){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public Node min(Node node){
        Node prev = null;
        while (node != null){
            prev = node;
            node = node.left;
        }
        return prev;
    }

    public Node max(Node node){
        Node prev = null;
        while (node != null){
            prev = node;
            node = node.right;
        }
        return prev;
    }

    public Node delete(Node current, int value){
        if (current == null){
            return null;
        }

        if (current.number == value){
            if (current.left == null){
                return current.right;
            }
            if (current.right == null){
                return current.left;
            }
            Node minNode = min(current.right);
            current.number = minNode.number;
            current.right = delete(current.right, current.number);
            return current;
        }
        if (current.number > value){
            current.left = delete(current.left,value);
        } else {
            current.right = delete(current.right,value);
        }
        return current;
    }

    public void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.number);
        inorder(node.right);
    }

    public void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.number);
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node){
        if (node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.number);
    }

}
