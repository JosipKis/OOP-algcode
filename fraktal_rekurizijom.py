import matplotlib.pyplot as plt

def draw_triangle(x, y, a, ax):
    plt.plot([x, x+a], [y, y], 'k')
    v = a ** (3) ** (0.5) / 2
    plt.plot([x, x+a/2], [y, y+v], 'k')
    plt.plot([x+a, x+a/2], [y, y+v], 'k')

fig, ax = plt.subplot()
draw_triangle(0, 0, 100, ax)