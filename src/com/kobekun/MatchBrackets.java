package com.kobekun;

import java.util.Stack;

/**
 * 通过栈的思想
 *
 * 匹配字符串类型的括号 使其正确的闭合
 *
 * 比如 ()[]{} 符合要求  ([)] 不符合要求
 */
public class MatchBrackets {

    public static void main(String[] args) {

        MatchBrackets matchBrackets = new MatchBrackets();

        System.out.println(matchBrackets.isValid("()[]{}"));

        System.out.println(matchBrackets.isValid("([)]"));

        System.out.println(matchBrackets.isValid("([}]"));

    }

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if(stack.isEmpty())
                    return false;
                else {
                    char topChar = stack.pop();
                    if(c == ')' && topChar != '(')
                        return false;
                    if(c == ']' && topChar != '[')
                        return false;
                    if(c == '}' && topChar != '{')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
