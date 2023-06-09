import random
from typing import List


def gen_arr(min: int, max: int, num_el: int):
    arr = []
    for i in range(num_el):
        arr.append(random.randint(min, max))
    return arr


def recursive_sort(nums):
    if len(nums) <= 1:
        return nums
    pivot = nums[0]
    smaller = [x for x in nums[1:] if x % 2 != 0]
    larger = [x for x in nums[1:] if x % 2 == 0]
    return recursive_sort(smaller) + [pivot] + recursive_sort(larger)


if __name__ == '__main__':
    arr = gen_arr(1, 100, 10)
    print(arr)
    print(recursive_sort(arr))