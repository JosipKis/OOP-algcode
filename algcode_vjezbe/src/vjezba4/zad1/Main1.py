def recursion1(inti):
    if inti == 1:
        return "Ovo je poruka :-)"
    elif inti == 0:
        return "Zero is not allowed!"
        # Problem što bih bez ovog elif statementa došao do -1 i onda bih imali beskonačnu petlju
    else:
        print("Ovo je poruka :-)")
        return recursion1(inti - 1)


if __name__ == '__main__':
    main = recursion1(0)
    print(main)
