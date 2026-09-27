# Assignment 01 – OOP Concepts (Encapsulation, Inheritance/Polymorphism, Abstraction)

## Description
Solution for **Assignment 01** in **Software Construction And Development** (5th Semester, Software
Engineering, UET Abbottabad). Covers four OOP-focused tasks: encapsulation, inheritance
and polymorphism, abstraction via interfaces, and a critique of AI-generated code.

## Objective
Demonstrate a working understanding of core OOP principles through refactoring,
design, and critical analysis - not just working code (this assignment is graded
primarily through an oral viva).

## Project Structure
```
SC-Assignment-1-OOP/
├── pom.xml
├── src/main/java/
│   ├── task1/
│   │   └── DigitalWallet.java        # Encapsulation + business rules
│   ├── task2/
│   │   ├── Employee.java             # Base class
│   │   ├── Developer.java            # Subclass - overrides calculatePay()
│   │   ├── SalesManager.java         # Subclass - overrides calculatePay()
│   │   └── Main.java                 # Polymorphism demo (has main method)
│   ├── task3/
│   │   ├── SmartDevice.java          # Interface (the contract)
│   │   ├── SmartBulb.java            # Implementation + unique method
│   │   └── SmartThermostat.java      # Implementation + unique method
│   └── task4/
│       ├── original/                 # The unrefined AI-generated code (for critique)
│       │   ├── Book.java
│       │   └── Member.java
│       └── fixed/                    # The corrected version
│           ├── Book.java
│           └── Member.java
└── README.md
```

## What Was Implemented
1. **DigitalWallet** — private fields, a `final` PIN set only at construction with no
   getter, balance validated non-negative on both construction and withdrawal, and
   `withdraw(amount, enteredPin)` that only succeeds when the PIN matches and funds
   suffice.
2. **Employee / Developer / SalesManager** — `Employee.calculatePay()` is overridden
   differently by each subclass; `Main.main()` loops over a single
   `List<Employee>` containing both subtypes and prints each one's polymorphically
   computed pay.
3. **SmartDevice / SmartBulb / SmartThermostat** — a shared interface contract
   (`turnOn`, `turnOff`, `getStatus`), each implementation additionally exposing its
   own unique method (`setBrightness`, `setTemperature`) that isn't part of the
   contract.
4. **task4.original vs task4.fixed** — `original` is the unrefined output from
   prompting an AI exactly as instructed ("Write a Java program for a simple Library
   System using OOP. Include classes for Book and Member."); `fixed` is the corrected
   version with proper encapsulation. See the PDF report for the full critique.

## How to Run
- **In NetBeans:** open the project (File > Open Project, select the folder containing
  `pom.xml`). Right-click `task2/Main.java` → **Run File** to see the polymorphism demo
  print each employee's pay.
- **From the command line:**
  ```sh
  mvn compile exec:java
  ```

## Reflections
See the accompanying PDF report for the written reflections on Tasks 1–3 and the
Task 4 AI code critique.

## Author
Muhammad Umar Basit – 24ABSWE0003

## Course
Software Construction and Development, 5th Semester Software Engineering,
UET Abbottabad Campus. Instructor: Engr. Rizwan Shah.
