
public class Node2 
{
	private int payload;
	private Node2 leftNode;
	private Node2 rightNode;
	
	public Node2(int payload)
	{
		this.payload = payload;
		this.leftNode = null;
		this.rightNode = null;
	}

	public void addNode(Node2 n)
	{
		if(n.getPayload() <= this.payload)
		{
			if(this.leftNode == null)
			{
				this.leftNode = n;
			}
			else
			{
				this.leftNode.addNode(n);
			}
		}
		else
		{
			if(this.rightNode == null)
			{
				this.rightNode = n;
			}
			else
			{
				this.rightNode.addNode(n);
			}
		}
	}
	
	public Node2 getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node2 leftNode) {
		this.leftNode = leftNode;
	}

	public Node2 getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node2 rightNode) {
		this.rightNode = rightNode;
	}

	public int getPayload() {
		return payload;
	}
}
