package BFSLib;
import BFSLib.BFSTraversal;

public class GraphTraversalBFS 
{
	public static void main(String[] args) 
	{
		BFSTraversal g = new BFSTraversal(5);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 3);
        g.addEdge(4, 2);
        g.addEdge(4, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 4");
 
        g.BFS_BySource(4);
	}
}
