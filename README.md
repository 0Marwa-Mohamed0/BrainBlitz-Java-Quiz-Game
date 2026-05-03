# Quiz Game App (Java + SQL)

## 📌 Overview

This project is an interactive **Quiz Game Application** built using **Java** and **SQL**. It allows users to test their knowledge through multiple-choice questions while tracking scores and storing data in a structured database.

---

## 🚀 Features

* 🎯 Multiple-choice quiz questions
* 👤 User system (optional: login/register)
* 🧠 Score tracking and evaluation
* 🗄️ SQL database integration for storing:

  * User data
  * Scores
* 📊 Result display at the end of the quiz

---

## 🛠️ Technologies Used

* **Java** (Core logic & application)
* **SQL** (Database management)
* **JDBC** (Database connectivity)

---

## ⚙️ Installation & Setup

1. **Clone the repository**

```bash
git clone https://github.com/0Marwa-Mohamed0/BrainBlitz-Java-Quiz-Game.git
```

2. **Open the project**

* Import into your preferred IDE (IntelliJ, Eclipse, etc.)

3. **Set up the database**

* Create a SQL database
* Import the provided `.sql` file (if available)
* Update database credentials in your Java code:

```java
String url = "jdbc:mysql://localhost:3306/quizapp";
String user = "root";
String password = "";
```

4. **Run the application**

* Execute the main Java file

---

## 📂 Project Structure

```
/src
  ├── Main.java
  ├── DatabaseConnection.java
  ├── QuizManager.java
  └── Models/
/database
  └── schema.sql
```

---

## 🎮 How to Use

1. Start the application
2. Answer quiz questions
3. Submit your answers
4. View your score at the end

---

## 🔮 Future Improvements

* Add timer for each question
* Difficulty levels (easy, medium, hard)
* GUI interface (JavaFX / Swing)
* Leaderboard system
* Online multiplayer mode

---

## 🤝 Contributing

Feel free to fork this repository and submit pull requests for improvements or new features.

---

## 📄 License

This project is open-source and available under the MIT License.
.
