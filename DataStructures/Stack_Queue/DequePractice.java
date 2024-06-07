package DataStructures.Stack_Queue;
import java.util.*;
public class DequePractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> D=new ArrayDeque<>();
		D.offerFirst(9);
		D.offerFirst(19);
		System.out.println(D);
		
		Stack<Integer> S=new Stack<>();
		S.push(9);
		S.push(19);
		System.out.println(S);
		
		Queue<Integer> Q=new LinkedList<>();
		Q.offer(89);
		Q.offer(99);
		System.out.println(Q);
		
		

	}

}
