from typing import List, Tuple


def merge_sort(arl: List, sort_type: str):
    assert sort_type in ["asc", "desc"] #Obvezno naglasiti u dokumentaciji da sort_type moze biti samo dva stringa da izbjegnemo error
    if len(arl) == 1:
        return arl
    else:
        left, right = split_in_middle(arl)
        left = merge_sort(left,sort_type)
        right = merge_sort(right, sort_type)
    return merge(left, right, sort_type)


def merge(left: List, right: List, sort_type: str):
    merged = []
    print(f"Left in merging part: {left}")
    print(f"Right in merging part: {right}")
    lip, rip = 0, 0
    while lip < len(left) and rip < len(right):
        if sort_type == "asc":
            if left[lip] < right[rip]:
                merged.append(left[lip])
                lip += 1
            else:
                merged.append(right[rip])
                rip += 1
        else:
            if left[lip] > right[rip]:
                merged.append(left[lip])
                lip += 1
            else:
                merged.append(right[rip])
                rip += 1
    merged.extend(left[lip:])
    merged.extend(right[rip:])
    print(f"Merged in this step:\n{merged}")
    # input("Enter to continue...")
    return merged


def split_in_middle(ar: List):
    middle = len(ar) // 2
    left = ar[:middle]
    right = ar[middle:]
    print(f"Left in split:\n{left}")
    print(f"Right in split:\n{right}")
    print("-"*75)
    return left, right


if __name__ == '__main__':
    arl = [34, 67, 9, 0, -12, 578, 92, 14]
    ms = merge_sort(arl, "asc")

