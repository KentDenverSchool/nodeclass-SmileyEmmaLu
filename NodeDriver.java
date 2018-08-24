public class NodeDriver {
    public static void main(String[] args) {

        Node x = new Node (10, null);
        Node n = new Node (15, x);

        System.out.println(n.getData());
        System.out.println(n.getPointer());

        System.out.println("Mutators:");

        Node y = new Node (25, null);
        n.setData(20);
        n.setPointer(y);

        System.out.println(n.getData());
        System.out.println(n.getPointer().getData());

    }
}
