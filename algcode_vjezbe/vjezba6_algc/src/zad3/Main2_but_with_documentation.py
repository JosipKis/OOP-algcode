from typing import List


def merge_sort(arl: List, sort_type: str):
    '''
    Sortiramo listu s elemtnima tipa int ili float koristeći merge sort algoritam.

    Args:
        arl (List): Lista koju želimo sortirati.
        sort_type (str): Tip sortiranja ("asc" za uzlazno ili "desc" za silazno).

    Returns:
        List: Sortirana lista.
    '''
    assert sort_type in ["asc", "desc"], "Krivi tip sortiranja, mora biti 'asc' ili 'desc'!"

    if len(arl) == 1:
        return arl
    else:
        left, right = split_in_middle(arl)
        left = merge_sort(left, sort_type)
        right = merge_sort(right, sort_type)

    return merge(left, right, sort_type)


def merge(left: List, right: List, sort_type: str):
    '''
    Spaja dvije sortirane liste u jednu sortiranu listu.

    Args:
        left (List): Lijeva sortirana lista.
        right (List): Desna sortirana lista.
        sort_type (str): Tip sortiranja ("asc" za uzlazno ili "desc" za silazno).

    Returns:
        List: Spojene sortirane liste.
    '''
    merged = []
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

    return merged


def split_in_middle(ar: List):
    '''
    Dijeli listu na dva dijela.

    Args:
        ar (List): Lista koju želimo podijeliti.

    Returns:
        Tuple: Tuple s dvije liste.
    '''
    middle = len(ar) // 2
    left = ar[:middle]
    right = ar[middle:]

    return left, right
