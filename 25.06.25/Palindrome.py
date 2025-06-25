def is_palindrome(s):
    return s == s[::-1]

test_str = input("Enter a string")
print(f"Is '{test_str}' a palindrome? {is_palindrome(test_str)}")
