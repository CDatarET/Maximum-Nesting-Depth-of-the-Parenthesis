public class Solution {
    public int MaxDepth(string s) {
        int top = 0;
        int max = 0;

        for(int i = 0; i < s.Length; i++){
            if(s[i] == '('){
                top++;
            }
            else if(s[i] == ')'){
                top--;
            }

            if(top >= max){
                max = top;
            }
        }

        return(max);
    }
}
