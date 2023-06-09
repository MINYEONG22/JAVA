package chap12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 	Stack: LIFO (Last in First out)
 * 		Stack 클래스: Vector 클래스의 하위 클래스. (List 객체)
 * 		push(Object o)	: 객체를 stack에 추가
 * 		Object pop() 	: stack에서 객체를 꺼내 리턴 (객체 제거)
 * 		Object peek()	: stack에서 객체를 꺼내 리턴 (객체 조회)
 * 	Queue: FIFO (First in First out)
 * 		Queue 인터페이스 	: LinkedList 가 구현 클래스. (List 객체)
 * 		offer(Object o)	: 객체를 Queue에 추가.
 * 		Object poll		: 객체를 Queue에서 꺼내 리턴 (객체 제거)
 * 		Object peek()	: 객체를 Queue에서 꺼내 리턴 (객체 조회)
 * 		
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나타","그랜저","SM5","K9"};					// {1,2,3,4} 순으로 들어감
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			stack.push(s);		// cars 배열에 있는 걸 stack List에 넣어줌
			queue.offer(s);		// cars 배열에 있는 걸 queue List에 넣어줌
		}	
		System.out.println("스택에 저장 된 객체의 갯수: "+stack.size());	// 4개
		System.out.println(stack);			// stack에 들어간 객체
		System.out.println(stack.peek());	// 마지막 조회만
		System.out.println(stack);			// stack 조회
		System.out.println(stack.pop());	// 마지막 거 꺼내서 가지고 와서 제거됨
		System.out.println(stack);			// stack 조회
		System.out.println("스택에 저장 된 객체의 갯수: "+stack.size());	// 3개
		System.out.println();
		System.out.println("큐에 저장 된 객체의 갯수: "+queue.size());		// 4개
		System.out.println(queue);			// queue에 들어간 객체
		System.out.println(queue.peek());	// 처음 거 조회만
		System.out.println(queue);			// queue 조회
		System.out.println(queue.poll());	// 처음 거 꺼내서 가지고 와서 제거됨
		System.out.println(queue);			// queue 조회
		System.out.println("큐에 저장 된 객체의 갯수: "+queue.size());		// 3개
	}
}
