package Lesson13_JavaCollectionFramework;

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Phương thức chèn một node mới
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Hàm đệ quy để chèn node
    private Node insertRec(Node root, int data) {
        // Nếu cây rỗng, trả về node mới
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Nếu không, duyệt xuống cây
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        // Trả về tham chiếu node
        return root;
    }

    // Phương thức tìm kiếm một node
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // Hàm đệ quy để tìm kiếm node
    private boolean searchRec(Node root, int data) {
        // Base case: nếu root là null hoặc data được tìm thấy
        if (root == null)
            return false;
        if (root.data == data)
            return true;

        // Nếu data nhỏ hơn root, tìm trong cây con bên trái
        if (data < root.data)
            return searchRec(root.left, data);

        // Nếu data lớn hơn root, tìm trong cây con bên phải
        return searchRec(root.right, data);
    }

    // Duyệt in-order (trái-gốc-phải)
    public void inOrder() {
        inOrderRec(root);
    }

    // Hàm đệ quy duyệt in-order
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Duyệt pre-order (gốc-trái-phải)
    public void preOrder() {
        preOrderRec(root);
    }

    // Hàm đệ quy duyệt pre-order
    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Duyệt post-order (trái-phải-gốc)
    public void postOrder() {
        postOrderRec(root);
    }

    // Hàm đệ quy duyệt post-order
    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}