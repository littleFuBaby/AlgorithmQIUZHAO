package com.ruoyi.grokking.algorithms.string;

import org.apache.commons.lang.StringUtils;

import java.util.Stack;

public class IsValidBrackets {

    public boolean isValid(String s) {
        if (StringUtils.isEmpty(s)) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                char p = stack.empty() ? '\0' : stack.pop();
                if ((c == '}' && p != '{') || (c == ']' && p != '[')
                        || (c == ')' && p != '(')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
