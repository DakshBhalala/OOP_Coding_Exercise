# SET-06 (Exception Handling)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 20: Run-time Errors (Try-Catch)
**Problem Statement:**
Take the value of denominator and numerator from user. Implement exception handling to manage all possible run-time errors (DivideByZero, NumberFormat).

**Sample Output:**
```text
> java Practical20 10 2
Result: 5

> java Practical20 10 0
Error: Cannot divide by zero.

> java Practical20 10 abc
Error: Please enter valid integers.
```

---

## Practical 21: Voting App (Throw Exception)
**Problem Statement:**
Create a `VotingApp`. Check eligibility; if age < 18, throw `IllegalArgumentException`. Use try-catch-finally.

**Sample Output:**
```text
Enter your age: 15
Exception: Age must be 18 or above to vote
Validation process completed
```

---

## Practical 22: Custom Exception (Library)
**Problem Statement:**
Define custom exception `BookNotAvailableException`. Library has `availableBooks`. If requested > available, throw exception.

**Sample Output:**
```text
Available Books: 3
Enter number of books to issue (0 to exit): 2
Book issued successfully

Available Books: 1
Enter number of books to issue (0 to exit): 2
Error: Requested books not available
```
