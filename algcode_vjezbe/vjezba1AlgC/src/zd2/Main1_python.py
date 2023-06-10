import random
from typing import List

MAX = 300
MIN = 0


def generate_rnd_arr(size: int):
    rnd_arr = []
    for i in range(size):
        rnd_arr.append(random.randint(MIN, MAX))
    return rnd_arr


def find_max_in_arr(arr: List):
    max = 0
    for i in arr:
        if i > max:
            max = i
    print("Maximum number in the list is: ", max)


def sort_array_in_descening_order(arr: List):
    for c in range(len(arr)):
        for i in range(len(arr)):
            if arr[c] > arr[i]:
                temp = arr[c]
                arr[c] = arr[i]
                arr[i] = temp
    return arr


if __name__ == '__main__':
    print("This list is randomly generated:")
    lst = generate_rnd_arr(10)
    print(lst)
    find_max_in_arr(lst)
    print("-" * 50)
    print("The list sorted in descending order:")
    print(sort_array_in_descening_order(lst))
