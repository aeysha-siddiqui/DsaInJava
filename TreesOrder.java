class TreesOrder{
    class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
        
    }
    class Tree{
        Node root;

        public Node insert_node(int data, Node root){
            if (root==null){
                  return new Node(data);
            }
            if(root.data<=data){
                root.left= insert_node(data, root.left);
            }
            if(root.data>data){
                root.right=insert_node(data, root.right);
            }
            return root;
        }
      
        public void print_inorder(Node root){
            if(root==null){
                return;
            }
            print_inorder(root.left);
            System.out.println(root.data);
            print_inorder(root.right);
        }

        public void print_preorder(Node root){
            if(root == null){
                return;
            }

            System.out.println(root.data);
            print_preorder(root.left);
            print_preorder(root.right);
        }

        public void print_postorder(Node root){
            if(root == null){
                return;
            }

            print_postorder(root.left);
            print_postorder(root.right);
            System.out.println(root.data);
        }

        public int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int heightt = Math.max(lh, rh);
            return(heightt+1);
        }
    }

    public static void main(String[] args){
        TreesOrder treesOrder = new TreesOrder();
        Tree tree = treesOrder.new Tree();
        tree.root= tree.insert_node(12, tree.root);
        tree.root= tree.insert_node(8, tree.root);
        tree.root= tree.insert_node(19, tree.root);
        tree.root= tree.insert_node(5, tree.root);
        tree.root= tree.insert_node(10, tree.root);
        tree.root= tree.insert_node(4, tree.root);
        System.out.println("****INORDER****");
        tree.print_inorder(tree.root);
        System.out.println("****PREORDER****");
        tree.print_preorder(tree.root);
        System.out.println("****POSTORDER****");
        tree.print_postorder(tree.root);
        int tree_height= tree.height(tree.root);
        System.out.println("height of the tree is" + tree_height);
    }
}
