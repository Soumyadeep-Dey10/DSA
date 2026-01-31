class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int val : nums) set.add(val);

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}