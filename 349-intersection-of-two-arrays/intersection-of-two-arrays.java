class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> iS = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                iS.add(num);
            }
        }
        int[] r = new int[iS.size()];
        int i = 0;
        for (int num : iS) {
            r[i] = num;
            i++;
        }

        return r;
           
        
        
    }
}