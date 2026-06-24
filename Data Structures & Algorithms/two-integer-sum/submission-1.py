class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for i in range(len(nums)):
            rm=target-nums[i]
            if rm in map:
                return [map[rm],i]
            map[nums[i]]=i