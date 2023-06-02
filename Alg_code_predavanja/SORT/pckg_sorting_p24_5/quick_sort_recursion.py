from typing import List, Tuple


def quick_sort(arl: List, left: int, right: int):
    if left < right:
        pointer = position(arl, left, right)
        quick_sort(arl, left, pointer-1)
        quick_sort(arl, pointer+1, right)
    return arl


def position(arl: List, left: int, right: int):
    pivot = right
    pointer = left # first larger from pivot
    slider = left # sliding index position
    while slider < pivot:
        print(f"Slider: {slider} | Pointer: {pointer} | Pivot: {pivot}")
        if arl[slider] > arl[pivot]:
            slider += 1
        else:
            arl[pointer], arl[slider] = arl[slider], arl[pointer]
            slider += 1
            pointer += 1
    arl[pointer], arl[pivot] = arl[pivot], arl[pointer]
    print(f"After one pass trough a list:\n {arl}")
    input("Enter to continue...")
    return pointer


if __name__ == '__main__':
    arl = [34, 5, 67, 890, 0, -23, 90, 1, 58]
    quick_sort(arl, 0, len(arl)-1)
