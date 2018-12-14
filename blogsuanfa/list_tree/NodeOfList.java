package blogsuanfa.list_tree;

public class NodeOfList {  
    NodeOfList next = null;  
    int value;  
  
    NodeOfList(int value) {  
        this.value = value;  
    }  
  
    @Override  
    public String toString() {  
        return value + " ";  
    }  
}  
