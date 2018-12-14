package blogsuanfa.list_tree;

public class NodeOfTree {  
    NodeOfTree left = null;  
    NodeOfTree right = null;  
    int value;  
  
    NodeOfTree(int value) {  
        this.value = value;  
    }  
  
    @Override  
    public String toString() {  
        return value + " ";  
    }  
}  