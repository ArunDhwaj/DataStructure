package GraphLib;

import GraphLib.Graph; 

public class GraphRepresentation 
{
	// Driver program to test above functions
	public static void main(String args[])
	{
		System.out.println("Graph AdjancyList Representation: \n");
		
		// create the graph given in above figure
		int V = 6;
		Graph graph = new Graph(V);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(0, 5);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		

		// print the adjacency list representation of 
		// the above graph
		graph.printGraph();
	}	
}
