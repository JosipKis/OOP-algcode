from typing import List


def insert_at_bottom(arr: List, temp: List):
    if len(arr) == 0:
        arr.append(temp)
        return
    temp2 = arr.pop()
    insert_at_bottom(arr, temp)
    arr.append(temp2)


def invert_stack(arr: List):
    if len(arr) == 0:
        return
    temp = arr.pop()
    invert_stack(arr)
    insert_at_bottom(arr, temp)


if __name__ == '__main__':
    arr = [1, 2, 3, 4, 5]
    invert_stack(arr)
    print(arr)
