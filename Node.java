public class Node {

    Object data;
    Node x;

    public Node (Object data, Node x){
        this.data = data;
        this.x = x;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setPointer(Node x){
        this.x = x;
    }

    public Object getData(){
        return data;
    }

    public Node getPointer(){
        return x;
    }
}
