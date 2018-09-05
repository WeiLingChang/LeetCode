class Solution {
    public int firstUniqChar(String s) {
        int pos =-1;
        int[] temp = new int[26];
        // 計算s中字母出現的次數
        for(int i=0; i<s.length();i++) {
          char str = s.charAt(i);
          temp[str-'a']++;  
        }
        //找出第一個次數為一
        for(int j=0; j<s.length();j++) {
            char str = s.charAt(j);
            if(temp[str-'a']==1)
            {
                pos=j;
                break;
            }
        }
        return pos;
    }
}