## Use Case 7 – Deque Based Optimized Palindrome Checker

Goal
To validate a palindrome using a Deque data structure.

Description
In this use case, characters of the input string are inserted into a Deque (Double Ended Queue). Characters are removed from both the front and rear of the deque and compared. If all pairs match, the string is confirmed as a palindrome.

Flow
1. Define the input string.
2. Insert characters into a Deque.
3. Remove first and last characters.
4. Compare the characters.
5. Continue until deque has 0 or 1 element.
6. Display whether the string is a palindrome.

Key Concepts
- Deque (Double Ended Queue)
- removeFirst()
- removeLast()
- Bidirectional comparison
