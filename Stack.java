import java.util.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> objects = new LinkedList<T>();
	
	public void insert(T t) {
		objects.add(t);
	}
	
	public T remove() {
		return objects.remove(objects.size() - 1);
	}
	
	public boolean empty() {
		return objects.size() == 0;
	}
	
}