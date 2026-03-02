## ⏱️Java Swing Stopwatch
A lightweight, precision-based desktop stopwatch application developed using **Java Swing**, focusing on clean design, real-time updates, and modular code structure based on object-oriented programming (OOP) principles.


## 📘 Project Overview

This project presents a GUI-based **Stopwatch System** implemented in Java. It tracks elapsed time in real time with the ability to **Start**, **Stop**, and **Reset**. The program utilizes Java’s Swing toolkit for a responsive interface and a 'javax.swing.Timer' for precise second-by-second updates.

This project aims to demonstrate:
- Clean Java GUI development
- Timer and event-driven logic
- Practical use of encapsulation and state control
- Readable, testable object-oriented code

---

## 🎯 Objectives

- ⌚ Create a user-friendly stopwatch utility
- 🧠 Apply real-world use of Java Swing components and listeners
- 🔁 Practice robust state handling and event management
- 💡 Learn the use of timers and GUI refreshing mechanisms

---

### 🧱 System Design & Architecture

## 🧠 Component Breakdown

| Component   | Role                                      |
|------------|-------------------------------------------|
| JFrame   | Main window container                     |
| JLabel   | Displays the formatted time               |
| JButton  | User controls: Start, Stop, Reset         |
| Timer    | Swing timer to tick every second          |
| int      | Time storage in milliseconds              |
| boolean  | Tracks current running state              |

### 🧩 UML Class Diagram

+--------------------------------------+
|             StopWatch               |
+--------------------------------------+
| - JFrame frame                      |
| - JButton startButton               |
| - JButton stopButton                |
| - JButton resetButton               |
| - JLabel timeLabel                  |
| - Timer timer                       |
| - int elapsedTime, seconds, minutes |
| - int hours                         |
| - boolean isRunning                 |
+--------------------------------------+
| + StopWatch()                       |
| + actionPerformed(ActionEvent e)    |
| + start()                           |
| + stop()                            |
| + reset()                           |
| + formatTime(int h, int m, int s)   |
+--------------------------------------+

## 🖥️ Features
✅ Real-time display of hours, minutes, and seconds

🟢 Start button to begin the timer

🔴 Stop button to pause the timer

♻️ Reset button to reset to zero

⛔ Prevents double start or accidental resets

⚙️ Clean UI with a minimalist layout using FlowLayout

💡 Highly extensible structure for future enhancements

## 🧑‍💻 OOP Principles Used
OOP Principle	Usage in Project
Encapsulation	All logic/data is encapsulated in the StopWatch class
Abstraction	UI logic and timer updates hidden from user interactions
Single Responsibility	Each method does one specific task (start, stop, reset, format)
Event-Driven	ActionListeners manage button-click behavior in a modular way

## 🛠️ Tech Stack
Technology	Purpose
Java SE 8+	Core programming language
Swing	UI Framework (JFrame, JLabel, JButton, Timer)
AWT	Used for layout and font
Timer API	Executes actions every second

## 🏁 Getting Started
📋 Prerequisites
Java Development Kit (JDK 8 or higher)

Any Java IDE (IntelliJ, Eclipse, NetBeans) or terminal

## 🚀 Running the App
Option 1: Using CLI
bash
Copy
Edit
# Step 1: Clone the repo
git clone https://github.com/alaminmahmud202/java-stopwatch.gitcd java-stopwatch

# Step 2: Compile the Java source
javac StopWatch.java

# Step 3: Run the app
java StopWatch
Option 2: Using IDE
Open the project folder.

Open StopWatch.java.

Run the file using your IDE's built-in runner.

## 🔎 Example Output

<img src="https://github.com/alaminmahmud202/alaminmahmud202/blob/main/Git%20display/javaout2.png" alt="alaminmahmud" />


## 🧪 Testing Strategy
Test Case	Status
Timer counts every second	✅ Pass
Double click Start doesn’t break logic	✅ Pass
Reset clears time completely	✅ Pass
GUI remains responsive	✅ Pass
Negative or invalid states	✅ Handled

## 🧭 Potential Enhancements
🕓 Add lap recording

🌌 Add dark/light themes

⏳ Countdown functionality

🧪 Unit testing with mocked timers

🖱️ Keyboard shortcuts for faster control

🧾 Export timing logs to file

## 📜 License
This project is licensed under the MIT License.
See the full license in the LICENSE file.

## 🤝 Contributing
Want to add a new feature or improve the design?

Fork the repository

Create your feature branch (git checkout -b new-feature)

Commit your changes (git commit -am 'Add something')

Push to the branch (git push origin new-feature)

Open a Pull Request!

## 📬 Contact

Developer: Al Amin Mahmud

GitHub: @alaminmahmud202

Email: alaminmahmud684@gmail.com

“Time is the most valuable resource. Building a stopwatch teaches us to measure, manage, and master it.”
