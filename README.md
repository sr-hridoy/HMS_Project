# Hospital Management System (HMS)

![Java](https://img.shields.io/badge/Java-SE-blue.svg) ![OOP](https://img.shields.io/badge/OOP-Principles-red.svg) ![Console](https://img.shields.io/badge/Console_App-CRUD-green.svg) ![Data Structures](https://img.shields.io/badge/Data_Structures-ArrayList-orange.svg)

### 📌 Project Overview

---

This repository contains a console-based Hospital Management System built entirely in Java. The project is a practical implementation of fundamental Object-Oriented Programming (OOP) concepts, demonstrating how classes, abstraction, inheritance, and dynamic data structures can be used to develop a simple real-world application.

The system provides a clean and interactive command-line interface for managing patient records without requiring a graphical user interface.

### 📊 Core Features

---

The system manages patient records through complete CRUD (Create, Read, Update, Delete) operations:

* **Add Patient:** Register a new patient by entering their name and age. A unique Patient ID is automatically assigned to each patient.
* **View Patients:** Display a formatted list of all currently registered patients.
* **Update Patient:** Modify an existing patient's name and age using their unique Patient ID.
* **Delete Patient:** Remove a patient's record from the system using their unique Patient ID.

### 🧠 Architecture & Methodology

---

* **Abstraction:** `Person.java` is an abstract base class that defines common attributes and behavior for people in the system.
* **Inheritance:** `Patient.java` extends the `Person` class and represents a patient in the hospital system.
* **Dynamic Data Management:** `Hospital.java` uses Java's `ArrayList` to store and manage patient objects dynamically.
* **CRUD Operations:** The `Hospital` class contains the main logic for adding, viewing, updating, and deleting patient records.
* **Interactive Menu:** `Main.java` uses `Scanner` and a `switch-case` menu to receive user input and perform the selected operation.

### 📂 Project Structure

---

```text
HMS_Project/
│
├── src/
│   ├── Person.java
│   ├── Patient.java
│   ├── Hospital.java
│   └── Main.java
│
├── README.md
├── hms_project_ss.pdf
└── hospital-management-system-demo.mp4
```

* `src/Person.java` – Abstract base class defining common person attributes.
* `src/Patient.java` – Class representing a patient and extending `Person`.
* `src/Hospital.java` – Handles patient records and CRUD operations using `ArrayList`.
* `src/Main.java` – Entry point of the application containing the console menu.
* `hms_project_ss.pdf` – Document containing screenshots of the project and its execution.
* `hospital-management-system-demo.mp4` – Video demonstration of the working project.

## ⚙️ Installation & Usage

### Prerequisites

* Java Development Kit (JDK) 8 or later
* Any Java IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code

### Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/sr-hridoy/HMS_Project.git
   cd HMS_Project
   ```

2. **Open the project:**

   Open the `src` folder in your preferred Java IDE.

3. **Run the application:**

   Run `Main.java` to start the Hospital Management System.

4. **Use the console menu:**

   The application allows the user to add, view, update, and delete patient records through the console.

### 👨‍💻 Author

**Md. Shaifur Rahman Hridoy**
*B.Sc. in Computer Science and Engineering, Leading University*

Feel free to explore the project and its implementation of fundamental Java OOP concepts.
