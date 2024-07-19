ATM Simulation using Multithreading in Java
=============================================

### Overview

This Java program simulates an ATM system where multiple customers can access the ATM simultaneously. The program demonstrates the use of multithreading and synchronization to ensure thread safety.

### Code Structure

The program consists of three classes:

## ATM.java

*   Represents the ATM machine.
*   Has two synchronized methods: `checkBal` and `withdraw`.
*   These methods are synchronized to ensure that only one customer can access the ATM at a time.

## Customer.java

*   Extends the `Thread` class and represents a customer who wants to use the ATM.
*   Has a reference to the `ATM` object and a `useAtm` method that calls the `checkBal` and `withdraw` methods of the ATM.

## AtmRunner.java

*   The main class that creates an instance of the `ATM` class and two instances of the `Customer` class.
*   Starts both customer threads simultaneously.

### Removing the `synchronized` Keyword

If you remove the `synchronized` keyword from the `checkBal` and `withdraw` methods, the program will not ensure thread safety. Both customer threads will access the ATM simultaneously, leading to unpredictable behavior and potential errors.

### Output

The output of the program will show the customers accessing the ATM one by one, with each customer's actions (checking balance and withdrawing money) being executed sequentially.

Example Output:
```bash
Customer 1: Checking balance...
Customer 1: Withdrawing $100...
Customer 2: Checking balance...
Customer 2: Withdrawing $200...
