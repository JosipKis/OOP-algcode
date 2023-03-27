from random import *

niz = []

print("Pronalazak maksimalne vrijednosti u nizu...")
for i in range(randint(1, 8)):
    niz.append(randint(1,101))
a = 0
print(niz)

print("Iterirajući kroz petlju: ")
for i in niz:
    for j in niz:
        if i > a:
            a = i
        elif j > a:
            a = j
print(a)
print("Koristći max funkciju: ")
print(max(niz))

#Josip Kiš