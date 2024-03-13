class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++)
        {
            int sl=0;
            int sr=0;
            for(int j=1;j<=i;j++)
            {
                sl+=j;
            }
            for(int k=i;k<=n;k++)
            {
                sr+=k;
            }
            if(sl==sr)
            {
                return i;
            }
        }
        return -1;
    }
}