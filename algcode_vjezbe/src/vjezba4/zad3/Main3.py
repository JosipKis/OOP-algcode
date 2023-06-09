from timeit import default_timer as timer


''' 
    U Pytohnu za 100 i 10000 vrijeme programa sa rekurzijom je bilo gotovo 2 puta sporije
    dok je za 1000000 više od nekoliko puta sporiji od petlje...
'''


def recursion_potentions(x: int, n: int):
    if n == 0:
        return 1
    elif n % 2 == 0:
        return (x ** (n - 1)) ** 2
    else:
        return x * (x ** (n - 1)) ** 2


def normal_potentions(x: int, n: int):
    for i in range(n):
        potention = x ** i
        return potention


if __name__ == '__main__':
    star_timer = timer()
    recursion_potentions(2, 1000000)
    end_timer = timer()
    print("Recursion time: ", end_timer - star_timer)
    print("--------------------------------------------------")
    star_timer = timer()
    normal_potentions(2, 1000000)
    end_timer = timer()
    print("Normal time: ", end_timer - star_timer)
