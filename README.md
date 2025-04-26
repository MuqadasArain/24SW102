# 🏋️‍♂️ Fitness Tracking App
_A Java OOP Project for Managing Fitness Activities._

---

## 📚 Project Overview
A simple Java-based application that tracks fitness activities for users, demonstrating core Object-Oriented Programming (OOP) concepts like **inheritance**, **composition**, **aggregation**, and **threading**.

Users can log different activities such as **Running**, **Cycling**, and **Workout sessions**. An ActivityProcessor thread processes the activities in the background for better simulation.

---

## 🚀 Features

### 👤 User Management
- Abstract `User` class with extended concrete class for Fitness Users.

### 🏃‍♂️ Fitness Activity Tracking
- Activities tracked include:
  - Running
  - Cycling
  - Workout
  
Each activity records:
- Duration
- Calories burned
- Specific details related to the activity type

### 🔄 Activity Processing (Multithreading)
- A background thread (`ActivityProcessor`) handles activity data processing asynchronously.

---

## 🧩 Key OOP Concepts Demonstrated

| Concept | Implementation |
|:-------|:----------------|
| Inheritance | Running, Cycling, and Workout inherit from Activity |
| Composition | User has a list of Activities |
| Aggregation | User is associated with multiple independent Activities |
| Threading | ActivityProcessor extends Thread |

---

## 🏗️ Project Structure

```
├── FitnessApp.java
├── User.java
├── Activity.java
├── Running.java
├── Cycling.java
├── Workout.java
├── ActivityProcessor.java
```

---

## ⚙️ Technologies Used
- Java
- OOP (Inheritance, Composition, Aggregation)
- Threading (Multithreading)
- Visual Studio Code

---

## ▶️ How to Run
1. Clone or download the repository.
2. Open the project in **Visual Studio Code** or any Java IDE.
3. Open `FitnessApp.java`.
4. Run the main file and watch fitness activities being managed and processed.

---

> **"Turning Code into Cardio, A Real-World Java OOP Experience."** 🚀
> 

Project by: **[Muqadas Arain]**
