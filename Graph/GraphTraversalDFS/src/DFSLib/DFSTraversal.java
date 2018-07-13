package DFSLib;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal 
{
	//Number of vertices in the Graph
	private int V;
	
	//Adjacency Lists
	private LinkedList<Integer> adjLists[]; 

	//Constructor
	public DFSTraversal(int v)
	{
		this.V = v;		
		this.adjLists = new LinkedList[v];
		
		// Initializing the adjLists array with linkedList
		for(int i = 0; i < v; i++ )
		{
			adjLists[i] = new LinkedList();
		}
	}

	//Function to add an edge into the graph
	public void addEdge(int vertex, int dest)
	{
		adjLists[vertex].add(dest);
	}
	
	// A function used by DFS
    private void DFSUtil(int s, boolean visited[] )
    {
    	visited[s] = true;
        
    	// Mark the current node as visited and print it
    	// Print the disconnected node in next line.
        if ( s == this.adjLists[s].peekLast() )	
        {
        	System.out.println(s);
        }
        else
        {
        	System.out.print(s);
        }
        
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> iterator = this.adjLists[s].listIterator();
        while ( iterator.hasNext() )
        {
            int cur = iterator.next();
            if (! visited[cur])
            {
            	System.out.print(" -> ");
            	DFSUtil(cur, visited);
            }
        }
    }
    
    // The function to do DFS traversal. It uses recursive DFSUtil()
    public void DFS_ByAll()
    { 
        //Mark all the vertices as not visited by default 
    	boolean visited[] = new boolean[this.V];

    	//Calling the DFSUtil for all the vertices one by one    
        for (int i= 0; i < this.V; ++i)
        {
            if (visited[i] == false)
            {
                DFSUtil(i, visited);
            }
        }
    }
    
}
