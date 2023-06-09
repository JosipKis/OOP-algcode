import random
from typing import List


def list_creator(min: int, max: int, elements: int):
    lista = []
    for i in range(elements):
        lista.append(random.randint(min, max))
    return lista


def recursive_sum(lista: List[int], n: int):
    if n <= len(lista):
        if n == 0:
            return 0
        else:
            return recursive_sum(lista, n-1) + lista[n - 1]
    else:
        return "N is greater than list length"


if __name__ == '__main__':
    lista = list_creator(1, 100, 100)
    print(lista)
    print(recursive_sum(lista, 69))
