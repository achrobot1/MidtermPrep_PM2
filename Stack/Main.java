package Stack;

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		s.printStack();
		System.out.println("removed: "+ s.pop());
		s.printStack();

	}

}
