def print_diamond(n):
    for i in range(n):s
        for j in range(n - i - 1):
            print(" ", end="")
        for k in range(2 * i + 1):
            print("*", end="")
        print()


    for i in range(n - 2, -1, -1):

        for j in range(n - i - 1):
            print(" ", end="")

        for k in range(2 * i + 1):
            print("*", end="")
        print()


n = 5
print_diamond(n)
