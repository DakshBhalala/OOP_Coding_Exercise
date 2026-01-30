# SET-05 (Interface & Abstract Class)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 16: Interface (Classify)
**Problem Statement:**
Implement a method `getDivision(double average)` in a class `Result` implementing an interface `Classify`. Return "First Division" if average >= 60.

**Sample Output:**
```text
Enter percentage: 75
Division: First Division
```

---

## Practical 17: Multiple Interfaces
**Problem Statement:**
Create interfaces `Exam` (isPassed) and `Classify` (getDivision). Class `Result` should implement both.

**Sample Output:**
```text
Enter Marks: 45
Status: Passed
Division: Pass
```

---

## Practical 18: Abstract Class (Vehicle)
**Problem Statement:**
Create an abstract class `Vehicle` with abstract methods `fuelType()` and `noOfWheels()`. Subclasses `Car` and `Bike` should implement these.

**Sample Output:**
```text
--- Car Details ---
Fuel: Petrol/Diesel
Wheels: 4

--- Bike Details ---
Fuel: Petrol
Wheels: 2
```

---

## Practical 19: Packages (Student & Exam)
**Problem Statement:**
Use packages `student` (Student class) and `exam` (Result class inheriting Student). calculate and display mark sheet.

**Sample Output:**
```text
Enter Roll No: 101
Enter Name: Student Name
Enter Marks 1: 80
Enter Marks 2: 90
Enter Marks 3: 85

--- Mark Sheet ---
Roll No: 101
Name: Student Name
Marks 1: 80
Marks 2: 90
Marks 3: 85
Total: 255
Average: 85.0
```
