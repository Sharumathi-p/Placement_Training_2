def count_vowels(s):
    vowels = "aeiouAEIOU"
    count = 0
    for char in s:
        if char in vowels:
            count += 1
    return count

text =input()
vowel_count = count_vowels(text)
print(f"The number of vowels in '{text}' is {vowel_count}.")
