## Use Case 10 – Case-Insensitive & Space-Ignored Palindrome

Goal
Check whether a string is a palindrome while ignoring spaces and letter case.

Description
In this use case, the input string is first normalized by removing spaces and converting all characters to lowercase. The palindrome check is then performed on the normalized string.

Flow
1. Define the input string.
2. Normalize the string (remove spaces and convert to lowercase).
3. Compare characters from both ends of the string.
4. If all pairs match, the string is a palindrome.

Key Concepts
- String preprocessing
- Regular expressions
- Case normalization