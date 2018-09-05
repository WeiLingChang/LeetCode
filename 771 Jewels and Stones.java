class Solution {
    public int numJewelsInStones(String J, String S) {
        int account = 0;
        char[] strChar = S.toCharArray();
        for(char str : strChar) {
            if(J.contains(Character.toString(str))){
                account++;
            }
        }
        return account;
    }
}