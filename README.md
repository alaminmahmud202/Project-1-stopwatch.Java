
# ⏱️ Java Stopwatch Project

## 📌 Project Overview

A simple and functional **digital stopwatch** built using **Java Swing GUI**. This application allows users to start, stop, and reset the timer, with a clean graphical interface showing hours, minutes, and seconds.

---

## 🎯 Objective

To create a basic yet functional stopwatch that demonstrates Java's **event-driven programming** and **GUI development skills** using Swing.

---

## 🛠️ Tools & Technologies

- **Language:** Java (JDK 8+)
- **GUI:** Java Swing
- **IDE:** Visual Studio Code / IntelliJ
- **Compiler:** `javac`, `java`
- **Build:** Manual via Terminal

---

## 📐 Project Diagram

+-------------------------+
| Java Swing GUI |
| +-------------------+ |
| | Time Label | --> Displays HH:MM:SS
| +-------------------+ |
| | Start | Stop | Reset| --> User controls
| +-------------------+ |
| Timer (1000ms) --> Updates time every 1 sec
+-------------------------+

---

## 📂 File Structure

📁 Stopwatch-Project/
├── StopWatch.java
└── README.md

---

## ✅ Features

- Displays elapsed time in HH:MM:SS format
- Responsive Start, Stop, and Reset buttons
- Accurate timing using `javax.swing.Timer`
- Lightweight and fast

---

## 🚀 How to Run

```bash
javac StopWatch.java
java StopWatch

