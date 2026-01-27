class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
        int i = 0;
        
        //adding till k
        for(i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        
        
        for(i = k; i < arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek(); 
    }
}
