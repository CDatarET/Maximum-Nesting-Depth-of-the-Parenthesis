class Solution {
    public int maxDepth(String s) {
        int top = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                top++;
            }
            else if(s.charAt(i) == ')'){
                top--;
            }

            if(top >= max){
                max = top;
            }
        }

        return(max);
    }
}
