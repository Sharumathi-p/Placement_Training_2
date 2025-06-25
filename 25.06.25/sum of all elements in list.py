def sum_of_list(lst):
    total = 0
    for num in lst:
        total += num
    return total

numbers = [1, 2, 3, 4, 5]
result = sum_of_list(numbers)
print(f"The sum of the list is {result}.")
