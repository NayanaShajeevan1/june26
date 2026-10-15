package collection;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new  Stack<Integer>();
		ob.push(11);
		ob.push(20);
		ob.push(1);
		ob.push(2);
		System.out.println(ob);
		ob.push(20);
		System.out.println("Element:"+ob);
		
		//TOP ELEMENT
		System.out.println("Top element is:"+ob.peek());
		
		
		//Remove element
		System.out.println(ob.pop());


	}

}
