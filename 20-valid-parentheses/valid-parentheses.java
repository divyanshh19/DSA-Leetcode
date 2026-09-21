class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char str : s.toCharArray()){
            if(str == '(' || str == '[' || str == '{'){
                st.push(str);
            }
            else{
                if(st.isEmpty()){
                return false;
                }

                char top = st.peek();

                if(str == ')' && top == '('  || str == ']' && top == '['  || str == '}' && top == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}