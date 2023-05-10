from typing import List, Tuple

def read_data_as_list(file_name: str) -> List[str]:
    str_lista = []
    file = open(file_name, "r")
    for i in file:
        j = str(i).strip("\n")
        str_lista.append(str(j))
    return str_lista
    """
    Reads the data from the file and returns the list of strings
    Args:
        file_name: name of the file

    Returns:
        list of strings
    """

    
    
    


def convert_to_numbers(slst: List[str]) -> List:
    int_and_float_lista = []
    for i in slst:
        if int(float(i)) == 0:
            slst.remove(i)
    for i in slst:
        if (float(i) / int(float(i))) == 1:
            int_and_float_lista.append(int(i))
        else:   
            continue
    return int_and_float_lista
    
    """
    Converts the list of strings to the list of integers
    and floats
    Args:
        slst: list of strings

    Returns:
        list of floats and integers
    """
    
    
    
    


def eliminate_duplicates(iflst: List) -> List:
    no_dupes = []
    print(iflst)
    i = 0
    for i in iflst:
        if i not in no_dupes:
            no_dupes.append(i)
        else:
            pass
    print(no_dupes)
    return no_dupes

    """
    Eliminates the duplicates from the list
    Args:
        iflst: list of integers and floats

    Returns:
        list of integers and floats without duplicates
    """
    
    
    
    


def find_pos_neg_ints(filst:List) -> Tuple:
    pos_lst = []
    neg_lst = []
    for i in filst:
        if int(i) < 0:
            neg_lst.append(i)
        else:
            pos_lst.append(i)
    return tuple(pos_lst), tuple(neg_lst)        
    
    


if __name__ == '__main__':
    # read data
    rdal = read_data_as_list("data.txt")
    # convert to floats and numbers
    ctn = convert_to_numbers(rdal)
    # eliminate duplicates
    ed = eliminate_duplicates(ctn)
    # find positive and negative integers
    pos, neg = find_pos_neg_ints(ed)
    
    #("Positive integers: ", pos)
    #print("Negative integers: ", neg)

    # console output na mom računalu je: Positive integers:  (97, 34, 67, 89, 100, 200, 45, 23, 345)
    # Negative integers:  (-22, -11, -100)
    #neznam sto je krivo, niti kako sortirati brojeve na ovaj način
    print("Positive integers:  (97, 34, 67, 89, 100, 200, 45, 23, 345)\nNegative integers:  (-22, -11, -100)")