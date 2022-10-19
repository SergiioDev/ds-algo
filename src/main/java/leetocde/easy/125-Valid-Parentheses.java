package leetocde.easy;

import java.util.ArrayDeque;
import java.util.Deque;

class Valid {

    public boolean isValid(String s) {

        if (s.length() == 1){
            return false;
        }

        Deque<Character> stack = new ArrayDeque();

        for(Character d: s.toCharArray()){
            if (d == '(' || d == '{' || d == '['  ){
                stack.push(d);
            } else {
                if (d == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if(d == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (d == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
