class Solution:
    def isGood(self, nums: List[int]) -> bool:
        return Counter(nums) == Counter([n:=max(nums)] + list(range(1,n+1)))