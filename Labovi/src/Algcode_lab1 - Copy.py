from random import randint

lista_s_clanovima = []
alphabet = "qwertzuiopšđasdfghjklčćžyxcvbnm1234567890"
alph_lista = []
for i in alphabet:
    alph_lista.append(i)

def gen_String(min = None, maks = None):
    if min == None:
        min = 3
    if maks == None:
        maks = 15
    string = ""    
    duljina_stringa = randint(min, maks)
    for i in range(duljina_stringa):
        br = randint(0, len(alph_lista)-1)
        temp = alph_lista[br]
        string += temp
    return string

def lista_s_Stringovima(duljina_liste = 10):
    br = 0   
    while br < duljina_liste:
        i = gen_String()
        lista_s_clanovima.append(i)
        br += 1
    return lista_s_clanovima

def sort1(lista, key = 1):
    if key == 1:
        sort1_lista = sorted(lista, key=len)
    else:
        sort1_lista = sorted(lista, key=len, reverse=True)
    return sort1_lista

def sort2(lista, sort = "ascending"):
    if sort == "ascending": 
        for i in range(1, len(lista)):
            pp = lista[i]
            j = i - 1
            while j >= 0 and len(pp) < len(lista[j]):
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = pp
        return lista
    elif sort == "descending":
        for i in range(1, len(lista)):
            pp = lista[i]
            j = i-1
            while j >= 0 and len(pp) > len(lista[j]):
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = pp
        return lista

if __name__ == "__main__":
    lista_s_Stringovima()
    print(sort1(lista_s_clanovima))
    print(sort2(lista_s_clanovima))
    if sort1(lista_s_clanovima) == sort2(lista_s_clanovima):
        print("Test-default: True")
    else:
        print("Test-default: False")

    if sort1(lista_s_clanovima) == sort2(lista_s_clanovima, "descending"):
        print("Test-desc-one: True")
    else:
        print("Test-desc-one: False")

    if sort1(lista_s_clanovima, 0) == sort2(lista_s_clanovima, "descending"):
        print("Test-desc all: True")
    else:
        print("Test-desc all: False")
