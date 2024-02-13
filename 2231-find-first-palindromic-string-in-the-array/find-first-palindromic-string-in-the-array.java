class Solution {
    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++)
        {
            StringBuilder st=new StringBuilder();
            for(int j=words[i].length()-1;j>=0;j--)
            {
                st.append(words[i].charAt(j));
            }
            if (st.toString().equals(words[i])) 
            {
                 return words[i];
            }
        }
        return "";
    }
}