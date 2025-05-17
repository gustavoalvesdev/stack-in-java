public class Test {
	
	public static void main(String[] args) {
		
		Stack<Piece> stack = new Stack<Piece>();
		
		Piece piece = new Piece();
		stack.insert(piece);
		
		Piece pieceToRemove = stack.remove();	
		
		if (stack.empty()) {
			System.out.println("The stack is empty");
		}
		
		Stack<String> stack2 = new Stack<String>();
		stack2.insert("Albert");
		stack2.insert("Mary");
		
		String mary = stack2.remove();
		String albert = stack2.remove();
		
		System.out.println(mary);
		System.out.println(albert);
		
	}
	
}