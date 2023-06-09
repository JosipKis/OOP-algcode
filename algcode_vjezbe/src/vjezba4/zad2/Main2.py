from typing import List


def recursion_potentions(x: int, n: List[int]):
    if x == 0:
        return "X equals 0"
    elif len(n) == 0:
        return "Done"
    else:
        potention = x ** n[0]
        print(potention)
        return recursion_potentions(x, n[1:])


if __name__ == '__main__':
    inti = [2, 5, 7, 11, 15, 25, 30, 50, 63]
    recursion_potentions(2, inti)
