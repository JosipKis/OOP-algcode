# import from module
import random
from code_lab_04 import rand_search


# random seed
rnd_seed = random.seed(123)
some_string = "this is some string that will be used in the code"
# test for strings


# print status
def status():
    bool = rand_search(some_string, "strings")
    print(f"Status: {bool}")


if __name__ == '__main__':
    status()


