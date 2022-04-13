package africa.semicolon.algo;

import java.util.Stack;

public class WordFormation {
    Stack<Integer> stack = new Stack<>();
    public int solution(String[] ops) {
        for (String op: ops) {
            switch (op){
                case "DUP" ->{
                    if (stack.isEmpty()) return -1;
                    stack.push(stack.peek());
                }
                case "-" ->{
                    if (stack.size() > 1) stack.push(stack.pop() - stack.pop());
                    else return -1;
                }
                case "+" ->{
                    if (stack.size() > 1) stack.push(stack.pop() + stack.pop());
                    else return -1;
                }
                case "POP" ->{
                    if (stack.size() > 0) stack.pop();
                    else return -1;
                }
                default -> stack.push(Integer.parseInt(op));
            }
        }
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
