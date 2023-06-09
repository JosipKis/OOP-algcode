from timeit import default_timer as timer
from typing import List

'''
    Rezultati u Pythonu su drukciji, jer rekurzijska funkcija je sporija od normalne funkcije za nekih 30%. 
    Razlog tomu je sto rekurzija koristi stog(stack) memoriju, a normalna funkcija ne.
'''

def recursion_potentions(x: int, n: List[int]):
    if x == 0:
        return "X equals 0"
    elif len(n) == 0:
        return "Done"
    else:
        potention = x ** n[0]
        print(potention)
        return recursion_potentions(x, n[1:])


def normal_potentions(x: int, n: List[int]):
    for i in n:
        potention = x ** i
        print(potention)


if __name__ == '__main__':
    inti = [2, 5, 7, 11, 15, 25, 30, 50, 63]
    star_timer = timer()
    recursion_potentions(2, inti)
    end_timer = timer()
    print("Recursion time: ", end_timer - star_timer)
    print("--------------------------------------------------")
    star_timer = timer()
    normal_potentions(2, inti)
    end_timer = timer()
    print("Normal time: ", end_timer - star_timer)
