from collections import OrderedDict

# python kod uz rješenje - testira se s main u ovoj istoj datoteci
'''
NAPOMENA: stvarni test treba biti s:
"23 This is a se78ntence for tesTing - try THIS only one 1!!"
'''


def charCounter(string: str):
    counter = OrderedDict()

    for char in string:
        char = char.lower()
        if char == " ":
            string.replace(char, " ")
        elif not char.isdigit():
            if char in counter:
                counter[char] += 1
            else:
                counter[char] = 1
    return counter


def printCounter(cntr: OrderedDict):
    sorted_cntr = OrderedDict(sorted(cntr.items()))
    for key, value in sorted_cntr.items():
        print(f"Character {key} occurs {value} times.")


if __name__ == '__main__':
    cntr = charCounter("23 This is a se78ntence for tesTing - try THIS only one 1!!")
    printCounter(cntr)
