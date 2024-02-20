class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String b="";
        for(int i=a.length-1;i>=0;i--)
        {
            b+=a[i];
            if(i!=0 && a[i]!="")
            {
                b+=" ";
            }
        }
        return b.trim();
    }
}