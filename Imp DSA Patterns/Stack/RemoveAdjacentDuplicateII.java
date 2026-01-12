class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charSt = new Stack<>();
        Stack<Integer> countSt = new Stack<>();

        for(char ch : s.toCharArray()){
            //check for duplicate char and not first char 
            if(charSt.size()>0 && charSt.peek() == ch)
                countSt.push(countSt.peek()+1);//increasing the value
            else{
                countSt.push(1); //for first time 
            }    
            charSt.push(ch);

            //when char equals k
            if(countSt.peek() == k){
                for(int i = 0; i < k; i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
            
            
        }
        StringBuilder sb = new StringBuilder();

        //filling the char in string
        while(charSt.size() > 0)sb.append(charSt.pop());
        return sb.reverse().toString();
    }
}