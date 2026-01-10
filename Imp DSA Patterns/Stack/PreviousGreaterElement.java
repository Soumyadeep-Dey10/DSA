class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) list.add(-1);
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
}