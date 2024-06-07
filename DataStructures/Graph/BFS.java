package DataStructures.Graph;
import java.util.*;
public class BFS {
	
	public static void Bfs(ArrayList<Integer>[] a)
	{
		Queue<Integer> q=new LinkedList<>();
		boolean[] visit=new boolean[a.length];
		
		for( int j=0;j<a.length;j++)
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
						for(int i=0;i<a[v].size();i++)
						{
							q.add(a[v].get(i));
						}
					}	
				}
			}
		}
	}
}
