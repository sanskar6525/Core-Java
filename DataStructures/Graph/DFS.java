package DataStructures.Graph;
import java.util.*;

import DataStructures.Graph.DijkstraAlgo.Edge;
public class DFS {
	
	static class Edges
	{
		int src;
		int dest;
		int wt;
		
		Edges(int s,int d,int w)
		{
			src=s;
			dest=d;
			wt=w;
		}
	}
	public static void DFS(ArrayList<Edges>[] a,int curr, boolean vis[])
	{
		System.out.print(curr+" -> ");
		vis[curr]=true;
		
		for(int i=0;i<a[curr].size();i++)
		{
			Edges e=a[curr].get(i);
			if(vis[e.dest]==false)
				DFS(a,e.dest,vis);
		}
		
	}
	public static void CreateGraph(ArrayList<Edges> graph[])
	{
		for(int i=0;i<graph.length;i++)
			graph[i]=new ArrayList<>();
		
		graph[0].add(new Edges(0,1,2));
		graph[0].add(new Edges(0,2,4));
		
		graph[1].add(new Edges(1,3,7));
		graph[1].add(new Edges(1,2,1));
		
		graph[2].add(new Edges(2,4,3));
		
		graph[3].add(new Edges(3,5,1));
		
		graph[4].add(new Edges(4,3,2));
		graph[4].add(new Edges(4,5,5));
	}

	public static void main(String[] args) {
		ArrayList<Edges> graph[]=new ArrayList[6];
		
		CreateGraph(graph);
		boolean vis[]=new boolean[6];
		DFS(graph,0,vis);
		
		
		

	}

}
