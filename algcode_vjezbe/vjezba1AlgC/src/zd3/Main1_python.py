import random
import timeit
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
    start_timer = timeit.default_timer()
    for c in range(len(arr)):
        for i in range(len(arr)):
            if arr[c] > arr[i]:
                temp = arr[c]
                arr[c] = arr[i]
                arr[i] = temp
    end_timer = timeit.default_timer()
    print("The time it took for Python to sort the list in descending order: ", end_timer - start_timer)
    return arr


def sort_array_in_ascending_order(arr: List):
    start_timer = timeit.default_timer()
    for c in range(len(arr)):
        for i in range(len(arr)):
            if arr[c] < arr[i]:
                temp = arr[c]
                arr[c] = arr[i]
                arr[i] = temp
    end_timer = timeit.default_timer()
    print("Time it took for Python sort the list in ascending order: ", end_timer - start_timer)
    return arr


if __name__ == '__main__':
    print("This list is randomly generated:")
    lst = generate_rnd_arr(10)
    print(lst)
    find_max_in_arr(lst)
    print("-" * 50)
    print("The list sorted in descending order:")
    print(sort_array_in_descening_order(lst))
    print("-" * 50)
    print("The list sorted in ascending order:")
    print(sort_array_in_ascending_order(lst))
