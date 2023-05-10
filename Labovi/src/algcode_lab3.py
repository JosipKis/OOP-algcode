def reverse_order(inpt):
    lst2 = [] # pomoca lista (stog)
    # ispitati slučajeve za str, listu i tuple
    if type(inpt) is tuple:
        inpt = list(inpt)
        reverse(inpt, lst2)
        return tuple(lst2)
    elif type(inpt) is str:
        inpt = list(inpt)
        reverse(inpt, lst2)
        return "".join(lst2)
    elif type(inpt) is list:
        inpt = list(inpt)
        reverse(inpt, lst2)
        return lst2
    else:
        return "Unsupported type"


def reverse(in1, aux):
    # dio koji koristi princip rada stoga 
    while in1:
        aux.append(in1.pop())



if __name__ == '__main__':
    inp = [11, -23, 90, 87, 54, 78, 0, -12, 33, 45, 67, 89, 90, 11, 23, 45, 67, 89, 90]
    some_string = "ovo je neki string koji nam treba za testiranje"
    inpt = (1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    # print obrnut redoslijed za inp
    print(reverse_order(inp))
    # print obrnut redoslijed za some_string
    print(reverse_order(some_string))
    # print za obrnut redoslijed za inpt
    print(reverse_order(inpt))