## Use Case 9 – Recursive Palindrome Checker

Goal
Check whether a string is a palindrome using recursion.

Description
In this use case, a recursive function compares the first and last characters of the string. If they match, the function calls itself with the next inner characters until the base condition is reached.

Flow
1. Define input string.
2. Call recursive function.
3. Compare start and end characters.
4. If mismatch → return false.
5. Otherwise call recursion with start+1 and end-1.
6. Stop when start >= end.

Key Concepts
- Recursion
- Base Condition
- Call Stack
