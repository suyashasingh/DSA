class Solution {
    public void sortStack(Stack<Integer> st) {
        
        if(st.isEmpty()) return;
        
        int top = st.pop();
        
        sortStack(st);
        
        insertStack(st, top);
        // code here
        
    }
    
    public void insertStack(Stack<Integer> st, int element){
        if(st.isEmpty() || st.peek() <= element){
            st.push(element);
            return;
        }
        
        int top = st.pop();
        
        insertStack(st, element);
        st.push(top);
    }
}