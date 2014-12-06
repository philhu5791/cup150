package data;

public class gNode<T> implements Comparable<gNode<T>> {
    
    protected T data;
    protected boolean visited;
    public Integer index = null;
    public Integer lowlink = null;
    public double distance = Double.POSITIVE_INFINITY;
    public gNode<T> predecessor = null;
     
    public gNode(T data) {
        this.data = data;
    }
     
    public gNode() {
         
    }
     
    public boolean isVisited() {
        return visited;
    }
     
    public void visit() {
        visited = true;
    }
     
    public void unvisit() {
        visited = false;
    }
     
    public int compareTo(gNode<T> ob) {
        String tempA = this.toString();
        String tempB = ob.toString();
         
        return tempA.compareTo(tempB);
    }
     
    public String toString() {
        return data.toString();
    }
     
}
