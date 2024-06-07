package DataStructures.Stack_Queue;
import java.util.*;
public class InBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		stack.push(4234);
		stack.push(99);
		
		/*
		 * List<Integer> L=new ArrayList<>(stack); System.out.println(L);
		 */
		System.out.println(stack.peek());
		
		Queue<Integer> Q=new LinkedList<>();
		Q.offer(90);
		Q.add(99);
		System.out.println(Q.peek());
	}

}
