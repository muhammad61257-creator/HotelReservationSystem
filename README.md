# Hotel Reservation System

A robust Java-based domain model for managing hotel chains, rooms, and reservations. This project demonstrates high-quality software engineering principles, including **Encapsulation**, **Defensive Programming (WP7)**, and **Interdependence (WP8)**.

## 🏨 Project Overview

The Hotel Reservation System is designed to handle complex relationships between hotel chains, individual hotels, and their guests.

### Key Features

* **Domain-Driven Design:** Clear separation of concerns between models (Hotel, Room, Guest) and value objects (Money, Address).
* **Defensive Programming (WP7):** Strict validation in constructors to prevent invalid states (e.g., negative prices, invalid date ranges, or null associations).
* **Interdependence (WP8):** Complex associations linking Reservations to ReserverPayers and Rooms.
* **Comprehensive Testing:** 1:1 mapping of model classes to JUnit 5 test classes using the Arrange-Act-Assert (AAA) pattern.

---

## 🛠️ Instructions to Build and Run

### Prerequisites

* **Java Development Kit (JDK):** Version 11 or higher.
* **VS Code Extensions:** "Extension Pack for Java" and "Debugger for Java."

### Building the Project

1. Open the project folder in VS Code.
2. Open a terminal (Ctrl+`) and navigate to the root directory.
3. Compile all source files:
```bash
javac -d bin src/*.java

```



### Running the Application

To launch the main application entry point (`App.java`):

```bash
java -cp bin App

```

---

## 🧪 Instructions to Execute Tests

The project uses **JUnit 5** for unit testing. Every model class has a corresponding test file located in the `test/` directory.

### Running via VS Code (Recommended)

1. Click on the **Testing Icon** (the beaker) in the left-hand sidebar.
2. Click **"Run All Tests"** at the top of the Testing Explorer.
3. Verify that all **25 tests** show a green checkmark.

### Running via Terminal

If you have the JUnit Console Standalone JAR, you can run:

```bash
java -jar lib/junit-platform-console-standalone.jar --class-path bin:test --scan-class-path

```

---

## 📂 Project Structure

```text
HotelReservationSystem/
├── src/             # Production Source Code (.java files)
├── test/            # Unit Test Suite (AAA Pattern)
├── bin/             # Compiled Bytecode (.class files)
└── README.md        # Project Documentation

```

---

## ⚖️ Quality Assurance (WP1)

The test suite ensures the system handles conflicting requirements by:

* Verifying "Happy Paths" (successful bookings).
* Verifying "Error Paths" (throwing `IllegalArgumentException` for invalid data).
* Ensuring 100% model coverage across all 12+ domain entities.

---
