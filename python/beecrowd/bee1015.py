import math

coord1 = input()
coord2 = input()

x1, y1 = map(float, coord1.split(" "))
x2, y2 = map(float, coord2.split(" "))

distance = math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

print(format(distance, ".4f"))
