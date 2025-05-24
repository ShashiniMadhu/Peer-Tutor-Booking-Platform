# 📘 Peer Tutor Booking Platform – Java OOP Practice

A **terminal-based Peer Tutor Booking Platform** built in Java, designed to help students book sessions with mentors for academic and career guidance. This project was developed as a self-learning exercise to strengthen my understanding of **Object-Oriented Programming (OOP)** concepts in Java.

## 🎯 Objective

This project simulates a university peer tutoring system with two main roles: **Students** and **Mentors**, and supports two types of sessions: **Subject Tutoring** and **Career Coaching**. The application runs in the terminal with menu-driven interaction and is entirely built using Java fundamentals.

## 🛠️ Features

- 👥 **User Roles**  
  - **Student**: Can view mentors and book sessions.  
  - **Mentor**: Offers sessions in subject tutoring or career coaching.  

- 📚 **Session Types**  
  - **Subject Tutoring**: Includes subject-related details.  
  - **Career Coaching**: Includes topic-related details.  

- 📅 **Booking System**  
  - Students can create accounts and book sessions with available mentors.  
  - Sessions are stored in memory using Java collections.

- ❌ **Cancel Sessions**  
  - Students can cancel previously booked sessions.

- 🖥️ **Console Interface**  
  - Simple text-based menu using Java `Scanner` for user input.

## 🔍 OOP Concepts Practiced

This project covers all core Object-Oriented Programming principles:

- **Encapsulation**
- **Inheritance**
- **Polymorphism**
- **Abstraction** (Abstract classes & interfaces)
- **Use of `static` keyword**
- **Collections** (`List`, `Map`)
- **Exception Handling**

## 📁 Project Structure

src/
├── Main.java
├── models/
│ ├── User.java
│ ├── Student.java
│ ├── Mentor.java
│ ├── Session.java
│ ├── SubjectTutoringSession.java
│ └── CareerCoachingSession.java
├── services/
│ └── BookingService.java
└── utils/
└── ConsoleMenu.java


> All data is stored in memory. No file I/O or database is used.

## 🧪 How to Run

1. Clone the repository:
git clone https://github.com/ShashiniMadhu/Peer-Tutor-Booking-Platform.git

2. Open the project in your favorite IDE (like IntelliJ IDEA or Eclipse).

3. Run the `Main.java` file.

## 📌 Key Learnings

- Solidified foundational OOP concepts in a practical scenario.
- Gained experience with Java collections and design patterns.
- Improved ability to structure clean and modular Java code.

## 🧠 Future Enhancements

- Add persistent storage using file I/O or a database.
- Implement user authentication.
- Expand session filtering and search options.

## 👨‍💻 Author

**[Shashini Madushika]**  
Web & Java Development Enthusiast  
[LinkedIn Profile](https://www.linkedin.com/in/shashini-madushika-965b01319/) | [GitHub](https://github.com/your-username)

---

**Thank you for checking out the project!**  
Feel free to fork, contribute, or share feedback.
