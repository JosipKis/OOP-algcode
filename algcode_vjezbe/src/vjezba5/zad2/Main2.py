
def convert_to_postfix(infix):
    postfix = []
    stack = []
    for c in infix:
        if c.isalnum():
            postfix.append(c)
        elif c == '(':
            stack.append(c)
        elif c == ')':
            while stack and stack[-1] != '(':
                postfix.append(stack.pop())
            if stack and stack[-1] != '(':
                return None
            stack.pop()
        else:
            while stack and importance(c) <= importance(stack[-1]):
                postfix.append(stack.pop())
            stack.append(c)
    while stack:
        if stack[-1] == '(':
            return None
        postfix.append(stack.pop())
    return ''.join(postfix)


def importance(operator):
    if operator in ['+', '-']:
        return 1
    elif operator in ['*', '/']:
        return 2
    elif operator == '^':
        return 3
    return -1



if __name__ == '__main__':
    infix = "(a+3*b)-log(c/(d-2))"
    postfix = convert_to_postfix(infix)
    print("Postfix:", postfix)
    if postfix == "a3b*+logcd2-/-":
        print("Test passed")
    else:
        print("Test failed")
