package GraphLib;

import java.util.LinkedList;

/*
 * @author: Arun Dhwaj
 * @date: 12th Jul'18,
 * @purpose: Adjacency List representation of Graph
 */
class Graph
{
	//Number of Vertices of the graph is static.
    int V;
    
    //Declaring adjListArray of linkedList
    LinkedList<Integer> adjListArray[];
     
    //Constructor 
    Graph(int V)
    {
    	this.V = V;
         
    	//Defining adjListArray of linkedList
        adjListArray = new LinkedList[V];
         
        //Creating a linked list for each of the vertices to store its adjacent nodes.
        for(int i = 0; i < V ; i++)
        {
            adjListArray[i] = new LinkedList<>();
        }
    }
 
    //Adds an edge to an undirected graph
    void addEdge(int src, int dest)
    {
    	//We will add the new edge( From: src-to-dest) at the first node, then addition time complexity is: O(1).
    	this.adjListArray[src].addFirst(dest);
    	
    	//We will add the new edge( From: src-to-dest) at the last node, then addition time complexity is: O(n). 
    	//As linkedlist traversal will take O(n) from head to reach the last node. 
    	//this.adjListArray[src].addLast(dest);
    	
    	//Since its undirected graph, add an edge from dest to src also.
    	this.adjListArray[dest].addLast(src);
    }
  
    //Printing the adjList representation of the Graph.
    void printGraph()
    {       
    	for(int v = 0; v < this.V; v++)
    	{
    		System.out.println("Adjacency list of vertex: "+ v);
    		System.out.print("head");
    		
    		for(Integer pCrawl: this.adjListArray[v])
    		{
    			System.out.print(" -> "+pCrawl);
    		}
    		
    		System.out.println("\n");
    	}
    }
}