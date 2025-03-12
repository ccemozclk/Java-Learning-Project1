# 🔐 Java-Based Login System with Authentication

This project is a beginner-level **Login & Authentication System** developed in **Java** following **OOP, Clean Code, and SOLID principles**.  
It is designed for an **e-commerce website**, handling **user authentication** using a **PostgreSQL database**.

---

## 📌 **Project Overview**
✅ **Dynamic database connection using PostgreSQL**  
✅ **User authentication via username or email**  
✅ **User login system with validation checks**  
✅ **Secure database operations with prepared statements**  
✅ **Follows SOLID principles & Clean Code standards**  

---

## 📌 **Project Structure**
This project consists of several core components:

### 1️⃣ **Database Connection**
Handles **PostgreSQL connection** using an **interface-based approach**.  
- `DatabaseConnection.java` – Interface for database operations.  
- `PostgreDatabaseConnection.java` – Implements PostgreSQL connection logic.  

### 2️⃣ **Database Table Manager**
Manages **table creation and data insertion** dynamically.  
- `DatabaseTableManager.java`  
  - **`createNewTable()`** – Creates tables dynamically.  
  - **`insertTable()`** – Inserts user data securely.  

### 3️⃣ **User Management**
Stores user information with **encapsulation and immutability**.  
- `User.java`  
  - **Auto-increment User ID**  
  - **Encapsulated fields (username, email, password, address)**  
  - **Setters for modifiable attributes** (email, password, address)  

### 4️⃣ **Authentication System**
Validates user credentials and handles login verification.  
- `Authentication.java`  
  - **Verifies user login using username/email & password**  
  - **Returns true for successful authentication, false otherwise**  

### 5️⃣ **Login System**
Handles **user input and authentication flow**.  
- `LoginSystem.java`  
  - **Takes input from the user**  
  - **Checks credentials using `Authentication` class**  
  - **Displays success/error messages**  

### 6️⃣ **Main Application**
Compiles and runs the project.  
- `Main.java`  
  - **Initializes database connection**  
  - **Creates and inserts user records**  
  - **Handles the login process**  

---

## 📌 **Technologies Used**
🔹 **Java** (OOP, SOLID, Clean Code)  
🔹 **PostgreSQL** (Database Connection & Management)  
🔹 **JDBC** (Database Communication)  
🔹 **Git & GitHub** (Version Control)  

---

## 📌 **Installation & Usage**
1️⃣ **Clone the repository:**
```sh
git clone https://github.com/YOUR_GITHUB_USERNAME/Java-Login-System.git
cd Java-Login-System
