class Solution {
    public boolean isValid(String s) {
        // Initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the input string
        for (char i : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (i == '(' || i == '[' || i == '{') {
                stack.push(i);
            } else {
                // If the stack is empty when encountering a closing bracket, return false
                if (stack.isEmpty()) return false;
                
                // Pop the top element from the stack and check if it matches the current closing bracket
                char top = stack.pop();
                if (i == ')' && top != '(' || 
                    i == ']' && top != '[' || 
                    i == '}' && top != '{') {
                    return false; // Mismatch found, return false
                }
            }
        }
        
        // If the stack is empty after processing all characters, the string is valid
        return stack.isEmpty();
    }
}
