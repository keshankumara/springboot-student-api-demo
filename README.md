# Spring Boot Student API Demo

This is a simple REST API built with Spring Boot to manage student data using an in-memory list. No database is used in this project, making it ideal for beginners who are learning how RESTful APIs work in Spring Boot.

---

## 📌 Features

- ✅ `@RestController` with base path `/students`
- ✅ In-memory list of students using `ArrayList`
- ✅ `@PostConstruct` method to initialize data
- ✅ GET all students – `/students/getAllStudents`
- ✅ GET a student by ID – `/students/student/{id}`
- ✅ POST a new student – `/students/student`
- ✅ PUT to update a student – `/students/student/{id}`

---

## 📦 Technologies Used

- Java
- Spring Boot
- Spring Web
- Jakarta Annotations

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── ruhuna/
                └── Students/
                    ├── Student.java
                    └── StudentRestController.java
```

---

## 🔧 Setup & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/springboot-student-api-demo.git
   ```

2. Open the project in your favorite IDE (IntelliJ, VS Code, etc.)

3. Run the application using:
   - The IDE's run button, or
   - Command line: 
     ```bash
     ./mvnw spring-boot:run
     ```

4. Visit the endpoints using tools like **Postman** or **cURL**.

---

## 📬 Example API Usage

### ➕ Create New Student

**POST** `/students/student`  
```json
{
  "id": 4,
  "name": "Nimal",
  "email": "nimal@gmail.com"
}
```

---

### 📚 Get All Students

**GET** `/students/getAllStudents`

Returns a list of all students.

---

### 🔍 Get Student by ID

**GET** `/students/student/1`

Returns student object with ID = 1.

---

### ✏️ Update Student

**PUT** `/students/student/1`  
```json
{
  "name": "Keshan Kumara",
  "email": "newemail@gmail.com"
}
```

---

## 💡 Who is this for?

- 💻 Students learning Spring Boot
- 🔰 Beginners starting out with REST APIs
- 👨‍🏫 Educators teaching Spring Boot basics
- 📦 Developers creating a fast prototype without DB

---

## 🌱 Future Improvements

- Add validation using `@Valid`
- Connect to a real database (e.g., MySQL, PostgreSQL)
- Implement CRUD operations in a `Service` layer
- Handle exceptions with custom error responses

---

## 🔗 License

This project is licensed under the MIT License – feel free to use and modify it for your learning or teaching purposes.

---

## 🙋‍♂️ Author

Created by **Keshan Kumara**  
Feel free to connect on [GitHub](https://github.com/keshankumara) or share your feedback.
