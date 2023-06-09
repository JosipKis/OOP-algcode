def inverting(lst, n, k):
    inverted_lst = []
    if n >= k:
        return lst
    else:
        lst[n], lst[k] = lst[k], lst[n]
        return inverting(lst, n + 1, k - 1)


if __name__ == '__main__':
    int_lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    str_lst = ["jedan", "dva", "tri", "cetiri", "pet", "sest", "sedam", "osam", "devet", "deset"]
    print("Lista s brojevima:\n", int_lst)
    print("Lista s rijecima:\n", str_lst)
    print("Invertirana lista s brojevima:\n", inverting(int_lst, 0, len(int_lst) - 1))
    print("Invertirana lista s rijecima:\n", inverting(str_lst, 0, len(str_lst) - 1))
