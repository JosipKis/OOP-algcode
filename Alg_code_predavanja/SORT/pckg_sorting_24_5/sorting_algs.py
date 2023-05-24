import random
from typing import List, Tuple, Callable
from timeit import default_timer as timer


def execution_time(funk: Callable):
    def wrapper(*args, **kwargs):
        start = timer()
        result = funk(*args, **kwargs)
        end = timer()
        elst = end - start
        print(f"{funk.__name__} - Elapsed time: {elst}")
        return elst
    return wrapper


@execution_time
def selection_sort(ar: List, sort_type: str = "asc"):
    assert sort_type in ["asc", "desc"]
    print(f"Unsorted: {ar}")
    if sort_type == "asc":
        for k in range(len(ar) - 1):
            for q in range(k + 1, len(ar)):
                if ar[q] < ar[k]:
                    ar[k], ar[q] = ar[q], ar[k]
    else:
        for k in range(len(ar) - 1):
            for q in range(k + 1, len(ar)):
                if ar[q] > ar[k]:
                    ar[k], ar[q] = ar[q], ar[k]
    print(f"Sorted: {ar}")


@execution_time
def bubble_sort(ar: List, sort_type: str = "asc"):
    assert sort_type in ["asc", "desc"]
    print(f"Unsorted array: {ar}")
    while True:
        action = 0
        for k in range(len(ar) - 1):
            if ar[k] > ar[k + 1]:
                ar[k], ar[k + 1] = ar[k + 1], ar[k]
                action += 1
        if action == 0:
            print(f"Sorted array: {ar}")
            break


def generate_rnd_arr(lng: int = 5, num: int = 100) -> List:
    all_arr = []
    MINV = -3000
    MAXV = 3000
    for k in range(num):
        lst = []
        for q in range(lng):
            lst.append(random.randint(MINV, MAXV))
        all_arr.append(lst)
    return all_arr


def execution_time_lab(arr: List, algs: List):
    num_times = len(algs)
    tms = []
    for k in range(num_times):
        tms.append([])
    for lst in arr:
        for k in range(len(tms)):
            tms[k].append(algs[k](lst))
    return tms


def avg_calculate(tms: List):
    for el in tms:
        avg = sum(el)/len(el)
        print("Avg elapsed time: {}".format(avg))


if __name__ == '__main__':
    algs = [bubble_sort, selection_sort]
    all_arr = generate_rnd_arr(1000, 200)
    tms = execution_time_lab(all_arr, algs)
    # print("----------------------------------")
    # for tim in tms:
    #     print(tim)
    avg_calculate(tms)
     # ar1 = [2, 3, 1, 4]
     # avg1 = sum(ar1)/len(ar1)
     # print(avg1)
     # ar2 = ar1.copy()
     # _, tm1 = bubble_sort(ar1)
     # print(f"time bubble: {tm1}")
     # _, tm2 = selection_sort(ar2)
     # print(f"time selection: {tm2}")
    # arr_all = generate_rnd_arr(3, 5)
    # print(arr_all)
