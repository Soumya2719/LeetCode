class Solution(object):
    def twoOutOfThree(self, nums1, nums2, nums3):
        set1=set()
        list1=[]
        set1.update(nums1)
        set1.update(nums2)
        set1.update(nums3)
        for i in set1:
                 if((i in nums1 and i in nums2) or (i in nums2 and i in nums3) or (i in nums3 and i in nums1)):
                          list1.append(i)
       
        return list1