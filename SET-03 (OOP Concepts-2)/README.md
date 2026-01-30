# SET-3 (OOP Concepts - Part 2)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 10: Static Data Members (BankAccount)
**Problem Statement:**
Design a class `BankAccount` with `account_holder_name` and `balance`. Use a static variable `interest_rate` (same for all accounts). Include methods to calculate and display the interest earned. Update interest rate using a static method.

**Sample Output:**
```text
Enter Account Holder Name: Alice
Enter Initial Balance: 10000
Initial Interest Rate: 3.5%
Account Holder: Alice
Balance: 10000.0
Interest Earned: 350.0

Enter new Interest Rate: 4.2
New Interest Rate: 4.2%
Account Holder: Alice
Balance: 10000.0
Interest Earned: 420.0
```

---

## Practical 11: Inner Classes (College Admission)
**Problem Statement:**
Write a Java program to model a college admission system using the concept of inner classes. Create an outer class `College` and an inner class `Admission`. The inner class should access the `collegeName` from the outer class and display complete details.

**Sample Output:**
```text
Enter College Name: MIT
Enter Student Name: Robert
Enter Course: Physics

--- Admission Details ---
College: MIT
Student: Robert
Course: Physics
```

---

## Practical 12: Method Overloading (Volume Calculator)
**Problem Statement:**
Demonstrate method overloading to calculate the volume of different 3D shapes. Implement `calculateVolume()` for a Cube (side), a RectangularCube (length, width, height), and a Sphere (radius).

**Sample Output:**
```text
Enter side of Cube: 5
Volume of Cube: 125.0

Enter dimensions for Rectangular Cube:
Length: 4
Width: 5
Height: 6
Volume of Rectangular Cube: 120.0

Enter radius of Sphere: 3
Volume of Sphere: 113.09733552923255
```
