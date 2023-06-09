

def binary_search(lista, num):
    lista = sorted(lista)
    mid = len(lista) // 2
    if lista[mid] == num:
        return True
    elif lista[mid] > num:
        lst = lista[mid:]
        if len(lst) > 1:
            return binary_search(lst, num)
        else:
            return False


if __name__ == '__main__':
    lista = [11, 41, 9, 1, 23, 3, 44, 101]
    print(lista)
    print(binary_search(lista, 23))
