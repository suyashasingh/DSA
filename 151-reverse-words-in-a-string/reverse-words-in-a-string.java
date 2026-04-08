class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        int idx = 0;
        char[] arr = s.toCharArray();

        for (int i = 0;i <n; i++){
            if(arr[i]!=' '){
                if(idx != 0)arr[idx++] = ' ';
                while(i<n && arr[i]!=' '){
                    arr[idx++] = arr[i++];
                }
            }
        }

        //reverse string
        reverse(arr, 0, idx-1);

        //reverse word

        int start = 0;
        for(int end = 0; end<=idx; end++){
            if(end == idx || arr[end]==' '){
                reverse(arr, start, end-1);
                start = end+1;
            }
        }

        return new String(arr, 0, idx);
        
    }
     //helper function

    public void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}