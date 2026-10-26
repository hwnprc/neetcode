class Solution {
    public boolean isAnagram(String s, String t) {

        char[] s_string = s.toCharArray();
        Arrays.sort(s_string);
        
        char[] t_string = t.toCharArray();
        Arrays.sort(t_string);

        boolean result = Arrays.equals(s_string, t_string);
        return result;
    }
}
