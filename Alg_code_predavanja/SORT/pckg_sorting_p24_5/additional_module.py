from typing import List, Callable
from timeit import  default_timer as timer

def binary_search(arr: List[int], item: int) -> bool:
    print(item)
    print(arr)


def execution_time(funk: Callable):
    def wrapper(*args, **kwargs):
        start = timer()
        result = funk(*args, **kwargs)
        end = timer()
        elst = end - start
        print(f"{funk.__name__} - Elapsed time: {elst}")
        return elst
    return wrapper
