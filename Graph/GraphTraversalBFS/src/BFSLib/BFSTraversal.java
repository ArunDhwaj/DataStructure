package BFSLib;

import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;

public class BFSTraversal 
{
	//Number of vertices in the Graph
	private int V;
	
	//Adjacency Lists
	private LinkedList<Integer> adjLists[]; 
	
	//Constructor
	public BFSTraversal(int v)
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
	
	//Prints BFS traversal from a given source s
    public void BFS_BySource(int s)
    {
        //Mark all the vertices as not visited by default 
    	boolean visited[] = new boolean[V];
 
        //Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        //Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> iterator = this.adjLists[s].listIterator();
            while ( iterator.hasNext() )
            {
                int cur = iterator.next();
                if (! visited[cur])
                {
                    visited[cur] = true;
                    queue.add(cur);
                }
            }
        }
    }
}
