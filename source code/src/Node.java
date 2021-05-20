import java.util.*;

public class Node {
 
	private NodeAttribute data = null;
	
	private List<Node> children = new ArrayList<>();
 
	private Node parent = null;
	
 
	public Node(NodeAttribute data) {
		this.data = data;
	}
	
	public void addChild(Node child) {
		child.setParent(this);
		this.children.add(child);
	}
	
	public void addChildren(List<Node> children) {
		children.forEach(each -> each.setParent(this));
		this.children.addAll(children);
	}
 
	public NodeAttribute getData() {
		return data;
	}
 
	public void setData(NodeAttribute data) {
		this.data = data;
	}
 
	private void setParent(Node parent) {
		this.parent = parent;
	}
 
	public Node getParent() {
		return parent;
	}
 
}
