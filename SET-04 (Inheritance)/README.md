# SET-04 (Inheritance & Polymorphism)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 13: Shape Inheritance (Triangle & Rectangle)
**Problem Statement:**
Design a base class `Shape` with two double data members `d1` and `d2`. Include a method `getData()` to initialize these. Create two derived classes, `Triangle` and `Rectangle`. Each should calculate its specific area.

**Sample Output:**
```text
Result for Triangle:
Enter base: 10
Enter height: 5
Area of Triangle: 25.0

Result for Rectangle:
Enter width: 4
Enter length: 6
Area of Rectangle: 24.0
```

---

## Practical 14: Bank Accounts (Inheritance)
**Problem Statement:**
Define a base class `BankAccount` with attributes like `accountNumber`, `accountHolderName`, and `balance` and methods `openAccount()`, `deposit()`, `withdraw()`, `checkBalance()`. Define subclasses `SavingAccount` (simple interest) and `FixedDepositAccount` (maturity amount).

**Sample Output:**
```text
=== Savings Account ===
Enter Account Number: 101
Enter Name: Student
Enter Balance: 5000
Account Opened Successfully.
Enter Interest Rate (%): 4
Enter Time (years): 2
Interest: 400.0
Current Balance: 5000.0

=== Fixed Deposit Account ===
Enter Account Number: 102
Enter Name: Investor
Enter Principal Amount: 10000
Enter Term (years): 5
Enter FD Interest Rate (%): 6.5
Account Opened Successfully.
Maturity Amount: 13700.86663957505
Current Balance: 10000.0
```

---

## Practical 15: Method Overriding (Employee & Manager)
**Problem Statement:**
Create a base class `Employee` with `displayDetails()`. Create a subclass `Manager` that inherits from `Employee` and overrides `displayDetails()` to include `teamSize`. Demonstrate runtime polymorphism.

**Sample Output:**
```text
Enter Employee Details:
Name: Alex
Department: HR

Enter Manager Details:
Name: Sarah
Department: Tech
Team Size: 12

--- Employee Display ---
Name: Alex
Department: HR

--- Manager Display (Overridden) ---
Name: Sarah
Department: Tech
Team Size: 12
```
