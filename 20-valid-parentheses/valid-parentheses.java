class Solution {
    public boolean isValid(String s) {
        // Stack<Character> st = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(c == '(' || c == '[' || c == '{'){
        //         st.push(c);
        //     }
        //     else{
        //         if(st.isEmpty()){
        //             return false;
        //         }
        //         char top = st.peek();
        //         if(c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{'){
        //             st.pop();
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }
        // return st.isEmpty(); // return true if all the parantheses are matched and popped out
        Stack<Character> st = new Stack<>();
        for(char t : s.toCharArray()){
            if(t == '(' || t == '[' || t == '{'){
                st.push(t);  //sare opening bracket stack mein
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if(t == ')' && top == '(' || t == ']' && top == '[' || t == '}' && top == '{'){
                    st.pop(); //compare bracket with stack bracket is same then pop it
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty(); //if stack is empty it's true
    }
}