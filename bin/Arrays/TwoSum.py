# Find indices of 2 elements whose sum is equal to a given target
# Initial soln --> Time complexity O(nlogn); Space Complexity O(n) ; Using sorting and binary search and
# finding element index in original array

# Better soln
# Use hashmap to check if complement already exists and if not add the element into the hashmap.


def binary_search(a, target):
    low = 0
    high = len(a) - 1
    # print(low, high)
    mid = (low + high) // 2
    while low <= high:
        # print('***', mid)
        mid = (low + high) // 2
        if a[mid] == target:
            return mid
        elif a[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


def find_element_ar(self, nums, ele, flag=-1):
    n = len(nums)
    for i in range(n):
        if i != flag and nums[i] == ele:
            return i


def twoSum(self, nums, target):
    temp = sorted(nums)
    num1 = float('inf')
    num2 = float('inf')
    n = len(nums)
    for i in range(n - 1):
        ele = binary_search(temp[i + 1:], target - temp[i])
        # print(temp[i], ele)
        num1 = temp[i]
        if ele != -1:
            num2 = temp[i + ele + 1]
            break

    if num1 != float('inf') and num2 != float('inf'):
        # print(num1, num2)
        ind1 = find_element_ar(nums, num1)
        ind2 = find_element_ar(nums, num2, ind1)
        return [ind1, ind2]


def modified_two_sum(self, nums, target):
    dic = {}
    n = len(nums)
    for i in range(n):
        complement = target - nums[i]
        # print(complement, dic)
        if complement in dic:
            return [dic[complement], i]
        else:
            dic[nums[i]] = i

