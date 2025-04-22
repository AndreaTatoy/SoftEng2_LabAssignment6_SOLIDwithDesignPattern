# SoftEng2_LabAssignment6_SOLIDwithDesignPattern
## Problem Statement

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like `borrowBook()`, `borrowJournal()` with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

## Objective

Refactor the resource borrowing system to align with **SOLID principles**, particularly the **Dependency Inversion Principle**.   
The refactored system ensures:
- Abstraction-based interaction between classes
- Loose coupling between `Student` and resource types
- Flexibility to add future resources without modifying existing classes

## Solution Overview

A new abstraction, `Borrowable`, was introduced as an interface that all library resources implement. Classes such as `Book`, `Journal`, and `AudioBook` now implement this interface. The `Student` class interacts only with the `Borrowable` interface, allowing it to work with any current or future resource that adheres to this contract.

## UML Class Diagram
![SoftEng2_Lab](https://github.com/user-attachments/assets/a991c368-5d82-43c6-b242-542f8df39439)
