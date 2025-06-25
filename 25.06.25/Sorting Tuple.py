def sort_tuples(tuples):
    return sorted(tuples, key=lambda x: x[1])

test_tuples = [(1, 'banana'), (2, 'apple'), (3, 'cherry')]
print(f"Sorted tuples: {sort_tuples(test_tuples)}")
