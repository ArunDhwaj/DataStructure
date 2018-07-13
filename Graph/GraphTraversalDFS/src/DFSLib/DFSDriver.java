package DFSLib;
import DFSLib.DFSTraversal;

public class DFSDriver 
{
	public static void main(String args[])
    {
		DFSTraversal g = new DFSTraversal(6);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.addEdge(4, 5);
        g.addEdge(5, 5);
        
        System.out.println("Following is Depth First Traversal");
 
        g.DFS_ByAll();
    }
}
