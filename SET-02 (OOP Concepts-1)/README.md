# SET-2 (OOP Concepts - Part 1)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 6: Rectangle Class
**Problem Statement:**
Define a Java class named Rectangle. It should have two double data fields: width and height, both with a default value of 1. Implement a no-argument constructor and a constructor that takes width and height as parameters. Include methods `getArea()` and `getPerimeter()`.

**Sample Output:**
```text
Rectangle 1 (Default):
Area: 1.0
Perimeter: 4.0

Enter dimensions for Rectangle 2:
Width: 5
Height: 8
Rectangle 2:
Area: 40.0
Perimeter: 26.0
```

---

## Practical 7: Employee Class
**Problem Statement:**
Create an Employee class with private instance variables for `employeeName` (String) and `employeeSalary` (double). Implement public methods `readEmployeeData()` and `displayEmployeeData()`. Demonstrate object creation and method invocation in a main method.

**Sample Output:**
```text
Enter Employee Name: John Doe
Enter Employee Salary: 75000

Employee Details:
Name: John Doe
Salary: 75000.0
```

---

## Practical 8: Point Class
**Problem Statement:**
Create a Point class representing a 2D point (x, y). Implement a default constructor (x=5, y=5), a parameterized constructor, and a copy constructor. Include a `display()` method.

**Sample Output:**
```text
Point 1 (Default): (5.0, 5.0)
Enter coordinates for Point 2:
x: 3.5
y: 7.2
Point 2 (Parameterized): (3.5, 7.2)
Point 3 (Copy of P2): (3.5, 7.2)
```

---

## Practical 9: Rectangle Comparison
**Problem Statement:**
Define a Java class named Rectangle. Create two Rectangle objects. Compare the two rectangles based on their areas and print which one has a larger area.

**Sample Output:**
```text
Enter dimensions for Rectangle 1:
Width: 10
Height: 5
Enter dimensions for Rectangle 2:
Width: 4
Height: 40

Rectangle 1:
Area: 50.0
Perimeter: 30.0

Rectangle 2:
Area: 160.0
Perimeter: 88.0

Comparison:
Rectangle 2 has a larger area.
```
