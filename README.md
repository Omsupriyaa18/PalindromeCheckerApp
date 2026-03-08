## Use Case 12 – Strategy Pattern for Palindrome Algorithms

Goal
Choose a palindrome algorithm dynamically using the Strategy Design Pattern.

Description
In this use case, a PalindromeStrategy interface defines the contract for palindrome checking algorithms. Different implementations such as StackStrategy or DequeStrategy can be used interchangeably. The strategy is selected at runtime.

Flow
1. Define PalindromeStrategy interface.
2. Implement StackStrategy algorithm.
3. Inject strategy at runtime.
4. Execute palindrome validation.

Key Concepts
- Interface
- Polymorphism
- Strategy Pattern