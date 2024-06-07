package BreadthFirstSearch;

import java.util.*;

public class bfsGraph {
	public static void bfs(ArrayList<Integer> graph[])
	{
		int n=graph.length;
		boolean[] visit=new boolean[n];
		Queue<Integer> q=new LinkedList<>();
		for( int j=0;j<graph.length;j++)
		{
			if(visit[j]==false)
			{
				
				q.add(j);
				
				while(!q.isEmpty())
				{
					int v=q.poll();
					if(visit[v]!=true)
					{
						System.out.print(v+"\t");
						visit[v]=true;
						for(int i=0;i<graph[v].size();i++)
						{
							q.add(graph[v].get(i));
						}
					}	
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Graph G1=new Graph(4);
		G1.createGraph(G1.graph);
		bfs(G1.graph);
		
	}
	
	

}
