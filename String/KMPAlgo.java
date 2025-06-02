
class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // brute force approach
        ArrayList<Integer> list = new ArrayList<>();
        int index = txt.indexOf(pat);
        
        while(index != -1){
            list.add(index);
            index = txt.indexOf(pat, index+1);
        }
        return list;
    }
}