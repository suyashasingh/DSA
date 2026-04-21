class Solution {
    public static void reverseStack(Stack<Integer> st) {
        
        if(st.isEmpty()) return;
        
        int top = st.pop();
        
        reverseStack(st);
        
        insertToBottom(st, top);
        // code here
        
    }
    
    public static void insertToBottom(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        
        int top = st.pop();
        
        insertToBottom(st, element);
        
        st.push(top);
    }
}
