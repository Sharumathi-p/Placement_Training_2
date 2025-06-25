def frequency(s):
    words = s.split()
    frequency = {}
    for word in words:
        frequency[word] = frequency.get(word, 0) + 1
    return frequency

test_str = input("Enter a string")
print(f"Word frequency: {frequency(test_str)}")
