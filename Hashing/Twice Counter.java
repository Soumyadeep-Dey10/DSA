https://www.geeksforgeeks.org/problems/twice-counter4236/1?page=1&category=Map&difficulty=Easy&sortBy=submissions

class Solution
{
    public int countWords(String list[], int n)
    {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : list){
            map.put(str, map.getOrDefault(str,0) +1);
        }
        for(String key: map.keySet()){
            if(map.get(key) == 2) count += 1;
        }
        return count;
    }
}