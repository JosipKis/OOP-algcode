from timeit import default_timer as timer
from typing import List

'''
    Rezultati u Pythonu su takvi da je rekurzijska funkcija sporija od normalne funkcije za testove 100 i 10000
    sporija za otprilike 10, puta, a za test 1000000 je sporija za cak 3 sekunde.
'''

def recursion_potentions(x: int, n: List[int]):
    if x == 0:
        return "X equals 0"
    elif len(n) == 0:
        return "Done"
    else:
        potention = x ** n[0]
        return recursion_potentions(x, n[1:])


def normal_potentions(x: int, n: List[int]):
    for i in n:
        potention = x ** i
        return potention


def timerr(repeats):
    inti = [2, 5, 7, 11, 15, 25, 30, 50, 63]
    star_timer = timer()
    for i in range(repeats):
        recursion_potentions(2, inti)
    end_timer = timer()
    print("Recursion time: ", end_timer - star_timer)
    print("--------------------------------------------------")
    star_timer = timer()
    for i in range(repeats):
        normal_potentions(2, inti)
    end_timer = timer()
    print("Normal time: ", end_timer - star_timer)


if __name__ == '__main__':
    timerr(1000000)

