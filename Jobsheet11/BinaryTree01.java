package Jobsheet11;

public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if(isEmpty()) {
            root = new Node01(data);
        } else {
            Node01 current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node01(data);
                        break;
                    }
                } else if(data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node01(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean found = false;
        Node01 current = root;
        while(current != null) {
            if(current.data == data) {
                found = true;
                break;
            } else if(current.data > data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    return found;
    }

    public void traversePreOrder(Node01 node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node01 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public void traverseInOrder(Node01 node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
    if(isEmpty()) {
        System.out.println("Tree masih kosong!");
        return;
    }
    Node01 parent = root;
    Node01 current = root;
    boolean isLeftChild = false;
    while(current != null) {
        if(current.data == data) {
            break;
        } else if(current.data > data) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }
    if(current==null) {
        System.out.println("Data tidak ditemukan!");
        return;
    } else {
        if(current.left==null && current.right==null) {
            if(current==root) {
                root = null;
            } else {
                if(isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if(current.left==null) {
            if(current==root) {
                root = current.right;
            } else {
                if(isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if(current.right==null) {
            if(current==root) {
                root = current.left;
            } else {
                if(isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {    
            Node01 successor = getSuccessor(current);
            if(current==root) {
                root = successor;
            } else {
                if(isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
}
}
