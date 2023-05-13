from typing import List, Tuple

def read_data_as_list(file_name: str) -> List[str]:
    file = open(file_name, "r")
    lista = []
    for i in file:
        ni = i.strip()
        lista.append(ni)
    return lista
    """
    Reads the data from the file and returns the list of strings
    Args:
        file_name: name of the file

    Returns:
        list of strings
    """

    
    
    


def convert_to_numbers(slst: List[str]) -> List:
    int_float_list = [int(i) if i.lstrip("-").isdigit() else float(i) for i in slst]
    return int_float_list
    
    """
    Converts the list of strings to the list of integers
    and floats
    Args:
        slst: list of strings

    Returns:
        list of floats and integers
    """
    
    
    
    


def eliminate_duplicates(iflst: List) -> List:
    lista_wo_dupes: set = set(iflst)
    return list(lista_wo_dupes)

    """
    Eliminates the duplicates from the list
    Args:
        iflst: list of integers and floats

    Returns:
        list of integers and floats without duplicates
    """
    
    
    
    


def find_pos_neg_ints(filst:List) -> Tuple:
    pos_list = []
    neg_list = []
    for i in filst:
        if type(i) == int:
            if i < 0:
                neg_list.append(i)
            elif i > 0:
                pos_list.append(i)
            else:
                pass
    return tuple(pos_list), tuple(neg_list)
    
    


if __name__ == '__main__':
    # read data
    rdal = read_data_as_list("data.txt")
    # convert to floats and numbers
    ctn = convert_to_numbers(rdal)
    # eliminate duplicates
    ed = eliminate_duplicates(ctn)
    # find positive and negative integers
    pos, neg = find_pos_neg_ints(ed)
    
    print("Positive integers: ", pos)
    print("Negative integers: ", neg)