package lesson2;

public class MainStack {

	public static void main(String[] args) {

		Stack1 stack = new Stack1();

		stack.push(25);
		stack.push(28);
		stack.push(29);
		stack.push(40);

		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (NoValuesException e) {
			System.out.println(e.getMessage());			
			e.printStackTrace();
		}

		System.out.println();

		Queue1 q = new Queue1();

		q.push(2);
		q.push(3);
		q.push(4);

		try {
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
		} catch (NoValuesException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
