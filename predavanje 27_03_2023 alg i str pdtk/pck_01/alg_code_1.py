from typing import List, Dict, Tuple,Callable
from random import *
from timeit import timeit as timer

def find_maximum(lst: list) -> int:
    k = 1
    maximum = lst[k]
    while k < len(lst):
        if lst[k] > maximum:
            maximum = lst[k]
        k += 1
    return maximum

def find_max_idx(lst: List) -> Tuple:
    k = 1
    maximum = lst[0]
    idx = 0
    while k < len(lst):
        if lst[k] > maximum:
            maximum = lst[k]
            idx = k
        k += 1
    return maximum, idx

def find_min_idx(lst: List) -> Tuple:
    k = 1
    minimum = lst[0]
    idx = 0
    while k < len(lst):
        if lst[k] < minimum:
            minimum = lst[k]
            idx = k
        k += 1
    return minimum, idx

def swap_two(left: int, indx: int, lst: List) -> List:
    """
    Function that swaps two elements in the list,
    """
    temp = lst[left]
    lst[left] = lst[indx]
    lst[indx] = temp
    return lst

def sort_swap(lst: List) -> List:
    """
    Function that sorts in descending order using simple swapping procedure by identifying max value and its position
    Args:
        lst (List): unsorted list
    Returns:
        List: sorted list
    """    
    for i in range(len(lst)):
        for j in range(i+1, len(lst)):
            if lst[i] < lst[j]:
                lst[i], lst[j] = lst[j], lst[i]

    print("Sorted descending...")
    print(lst)

    return lst

def sort_swap1(lst: List) -> List:
    """
    Function that sorts in ascending order using simple swapping procedure by identifying min value and its position
    Args:
        lst (List): unsorted list
    Returns:
        List: sorted list
    """    
    for i in range(len(lst)):
        for j in range(i+1, len(lst)):
            if lst[i] > lst[j]:
                lst[i], lst[j] = lst[j], lst[i]

    print("Ascending...")
    print(lst)

    return lst

def sort_swap_2(lst: List, sort_type: str = "descending"):
    if sort_type != "ascending":
        sort_swap(lst)
    elif sort_type == "ascending":
        sort_swap1(lst)


def genarete_rnd_list(num_elements: int, mini: int=-10, maxi=100) -> List:
    lst = []
    for i in range(num_elements):
        rndint = randint(mini, maxi)
        lst.append(rndint)
    return lst

def elapsed_time(alg: callable, lst: List) -> float:
    start = timer()
    alg(lst)
    end = timer()
    return (end - start)

if __name__ == '__main__':
    lst = genarete_rnd_list(7)
    print(lst)
    #mx = find_maximum(lst)
    #print(f"Maximum is: {mx}")
    #python standard library
    #print(type(lst))
    #lst2 = [-11, 34, 0, 56, 7, 89]
    #lst2.remove(56)
    #print(lst2)
    #a = (23, 4, -111, 0, 90)
    #mx, indx = find_max_idx(lst)
    #print(f"Maxi {mx} | indx {indx}")
    #lst = swap_two(0, indx, lst)
    #print(lst)
    #print(lst[3:])
    #lst = sort_swap(lst)
    #print("Sorted: ")
    #print(lst)
    #elapsed = elapsed_time(sort_swap, lst)
    #print(f'Elapsed time {elapsed}')
    #mini = find_min_idx(lst)
    #print(lst)
    lst = sort_swap_2(lst, "ascending")
    print(lst)