package DataStructures.Heap;

import java.util.ArrayList;

class Heap<T extends Comparable<T>>
{
	  private ArrayList<T> list;

	  public Heap() {
	    list = new ArrayList<>();
	  }
	  
	  private void swap(int first,int second)
	  {
		  T r=list.get(second);
		  list.set(second, list.get(first));
		  list.set(first, r);
	  }
	  
	  private int parent(int i)
	  {
		  return (i-1)/2;
	  }
	  
	  private int left(int i)
	  {
		  return (2*i)+1;
	  }
	  
	  private int right(int i)
	  {
		  return (2*i)+2;
	  }
	  
	  public void insert(T val)
	  {
		  list.add(val);
		  upheap(list.size()-1);
	  }
	  
	  private void upheap(int i)
	  {
		  if(i==0)
			  return;
		  int pa=parent(i);
		  if(list.get(pa).compareTo(list.get(i))>0)
		  {
			  swap(pa,i);
			  upheap(pa);
		  }
	  }
	  public T remove() throws Exception {
		    if (list.isEmpty()) {
		      throw new Exception("Removing from an empty heap!");
		    }

		    T temp = list.get(0);

		    T last = list.remove(list.size() - 1);
		    if (!list.isEmpty()) {
		      list.set(0, last);
		      downheap(0);
		    }
		    
		    return temp;
		  }
		  private void downheap(int index) {
		    int min = index;
		    int left = left(index);
		    int right = right(index);

		    if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
		      min = left;
		    }

		    if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
		      min = right;
		    }

		    if(min != index) {
		      swap(min, index);
		      downheap(min);
		    }
		  }
	  
	  public ArrayList<T> heapSort() throws Exception {
		    ArrayList<T> data = new ArrayList<>();
		    while(!list.isEmpty()) {
		      data.add(this.remove());
		    }
		    return data;
		  }
	  public static void main(String[] args) throws Exception
	  {
		  Heap<Integer> heap = new Heap<>();

		    heap.insert(34);
		    heap.insert(45);
		    heap.insert(22);
		    heap.insert(89);
		    heap.insert(76);
		    System.out.println(heap.list.get(0));
			/*
			 * ArrayList list = heap.heapSort(); System.out.println(list);
			 */

		  
	  }
}
