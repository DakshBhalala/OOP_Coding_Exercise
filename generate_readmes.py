import os

readmes = {
    "SET-01 (Basics)": """# SET-01 (Basics)

This set covers foundational Java programming concepts including input parsing, mathematical operations, conditionals, and standard console output formatted strings.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **01** | `Practical01.java` | Meters to feet converter. |
| **02** | `Practical02.java` | Solves a system of linear equations using Cramer's rule. |
| **03** | `Practical03.java` | Vowel detection program utilizing basic String scanning. |
| **04** | `Practical04.java` | Calculates Compound Interest via Math.pow utilities. |
| **05** | `Practical05.java` | Computes the area of a mathematical triangle. |
""",
    "SET-02 (OOP Concepts-1)": """# SET-02 (OOP Fundamentals 1)

This module focuses on defining custom Object-Oriented Entity models, explicitly building Constructors, parameterization, class scoping, and instantiation methods.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **06** | `Practical06.java` | `Rectangle06` class evaluating Default versus Parameterized Constructors. |
| **07** | `Practical07.java` | Object parameter-passing by passing variables into method signatures. |
| **08** | `Practical08.java` | Deep Copy Constructor demonstrating how to clone an object cleanly. |
| **09** | `Practical09.java` | Method returning object metrics mapped recursively for comparison logics. |
""",
    "SET-03 (OOP Concepts-2)": """# SET-03 (OOP Fundamentals 2)

Dives deeper into static keywords, outer/inner class hierarchies, and Java Method Overloading behaviors.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **10** | `Practical10.java` | `BankAccount` model manipulating global `static` member variables properties safely. |
| **11** | `Practical11.java` | Inner Classes representation outlining the hierarchical relationship structure between Outer Models (e.g. `College`) and nested forms. |
| **12** | `Practical12.java` | Method Overloading providing varying execution pathways depending on argument types (Float / Double primitives). |
""",
    "SET-04 (Inheritance)": """# SET-04 (Inheritance Models)

Exhibits hierarchical structures leveraging the `extends` mechanism, utilizing the `super` pointer to map upward constructors, and defining polymorphous Overriding methods.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **13** | `Practical13.java` | Inheritance layout mapping base `Shape` structures directly to `Rectangle` subclasses seamlessly. |
| **14** | `Practical14.java` | Implementing `super()` allowing inherited subclasses to instantiate super-level constructor attributes initially before modifying local attributes. |
| **15** | `Practical15.java` | `@Override` methodologies showcasing method shadowing where derived classes update behaviors previously defined atop the inheritance tree. |
""",
    "SET-05 (Interface & Abstract)": """# SET-05 (Interfaces, Abstraction & Packages)

Transitions into fully enforcing rigid behaviors, encapsulating functionality purely via non-instantiable Abstract interfaces alongside Java Package implementations cross-file.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **16** | `Practical16.java` | Constructing behavior Interface abstractions implementing fixed mandatory method contracts un-reliant on hierarchy trees. |
| **17** | `Practical17.java` | Multiple-Inheritance workaround allowing one concrete Java class to extract requirements from numerous interfaces concurrently. |
| **18** | `Practical18.java` | Abstract entity configurations requiring distinct child models to explicitly redefine overarching parent functionalities entirely locally. |
| **19** | `Practical19.java` | Java Packaging layout loading entity configurations seamlessly from externalized directories mapping packages correctly runtime. |
""",
    "SET-06 (Exception Handling)": """# SET-06 (Exception Handling)

Outlines fault-tolerant configurations, resolving crashes effectively. Implementations showcase the entire standard Error Catching sequence encompassing native errors + explicit throwable variants safely.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **20** | `Practical20.java` | Catching primitive runtime Arithmetic and Format exceptions gracefully circumventing harsh JVM application crashes. |
| **21** | `Practical21.java` | Explictly enforcing programmatic constraints by manually throwing standard Runtime Errors (like age validation thresholds). |
| **22** | `Practical22.java` | Designing 100% custom specialized User Exceptions mapping logic exceptions (`BookNotAvailable`) into clean execution flow control mechanisms safely. |
""",
    "SET-07 (Threading)": """# SET-07 (Concurrent Threading)

Highlights Multithreading logic executing independent processor workloads simultaneously optimizing execution schedules utilizing `Runnable` implementations + Thread lifecycle syncing.

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **23** | `Practical23.java` | Threading instance generations splitting execution loops running concurrently alongside primary memory threads natively cleanly. |
| **24** | `Practical24.java` | `join()` implementations stalling main parent execution mapping synchronously waiting precisely predicting chronological resolution properly! |
| **25** | `Practical25.java` | Object Thread `synchronized` locks preventing independent entities writing simultaneous corruptions toward shared instance mapping methodologies gracefully. |
""",
    "SET-08 (File IO)": """# SET-08 (Text File Streams Integration)

Examines Native Input/Output methodologies manipulating system memory dynamically extracting and depositing serialized arrays outward mapping files seamlessly!

## Practical List

| # | File Name | Description |
| :--- | :--- | :--- |
| **26** | `Practical26.java` | Loading and indexing raw external ASCII documents counting characters string metrics accurately reliably. |
| **27** | `Practical27.java` | Executing native Data Pipeline depositing console structures straight into `students.txt` persistent drives. |
| **28** | `Practical28.java` | Advanced Buffer readings formatting document lengths mapping unique String spaces filtering extraneous array elements safely! |
"""
}

def generate():
    for folder, content in readmes.items():
        if os.path.isdir(folder):
            file_path = os.path.join(folder, "README.md")
            with open(file_path, "w", encoding="utf-8") as f:
                f.write(content)
            print(f"Created {file_path}")

if __name__ == "__main__":
    generate()
