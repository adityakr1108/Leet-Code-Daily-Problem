import  java.util.*;

class LeetCode41 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String str : strs){
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String s1 = new String(arr);
            if(!mp.containsKey(s1)){
                mp.put(s1,new ArrayList<>());
            }
            mp.get(s1).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}