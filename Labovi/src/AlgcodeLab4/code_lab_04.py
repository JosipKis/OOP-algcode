# import
import random
from random import *


# define algorih for random search
def rand_search(inpt: str, some_wrd: str) -> bool:
    inpt = inpt.split()
    inpt = [x.lower() for x in inpt]
    print(inpt)
    some_wrd = some_wrd.lower()
    in_arr = False
    while len(inpt) > 0:
        rnd_num = randint(0, len(inpt) - 1)
        print("Random index to test:", rnd_num)
        if some_wrd == inpt[rnd_num]:
            in_arr = True
            print(f"{some_wrd} is in array...")
            return in_arr
        else:
            print(f"Removing: {inpt[rnd_num]}")
            inpt.remove(inpt[rnd_num])
    return in_arr
