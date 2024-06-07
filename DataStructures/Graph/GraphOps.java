package DataStructures.Graph;
import java.util.*;
public class GraphOps 
{ 
	
	ArrayList<Integer> graph[];
	int vertex;
	
	GraphOps(int v)
	{
		vertex=v;
		graph=new ArrayList[vertex];
	}
	
	public static void createGraph(ArrayList<Integer> g[])
	{
		for(int i=0;i<g.length;i++)
			g[i]=new ArrayList<Integer>();
		
		g[0].add(2);
		
		g[1].add(2);
		g[1].add(3);
		
		g[2].add(1);
		g[2].add(0);
		g[2].add(3);
		
		g[3].add(2);
		g[3].add(1);
		
		for(int i=0;i<g.length;i++)
		{
			for(Integer t:g[i])
				System.out.print(i+"->"+t+"\t");
			System.out.println();
		}
		
	}
			
			
		//System.out.println(Arrays.toString(g));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphOps G1=new GraphOps(4);
		
		createGraph(G1.graph);
		
		BFS.Bfs(G1.graph);
 		
	}

}


