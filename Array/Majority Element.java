
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int flag = nums.length/3;
        List<Integer> list= new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > flag){
                list.add(key);
            }
        }
        return list;
    }
    
}