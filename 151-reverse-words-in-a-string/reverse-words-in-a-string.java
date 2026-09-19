class Solution {
    public String reverseWords(String s) {
        //reverse whole string, then reverse each word

        char words[] = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i] != ' ') {
                if (idx != 0) words[idx++] = ' ';
                while (i < words.length && words[i] != ' ') {
                    words[idx++] = words[i++];
                }
            }
        }
        reverse(words, 0, idx-1);

        int start = 0;
        for(int end = 0 ; end <=idx; end++){
            if(end == idx || words[end] == ' '){
                reverse(words, start, end-1);
                start = end+1;
            }
        }

        return new String(words, 0, idx);
    }

    public void reverse(char[] ch, int start, int end) {
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
    }
}