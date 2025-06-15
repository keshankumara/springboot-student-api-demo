package com.ruhuna.Students;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private ArrayList<Student> students = new ArrayList<>();

    /*
    Student keshan = new Student(1,"keshan", "keshan@gmail.com");
    Student kumara = new Student(2, "kumara", "kumara@gmail.com");
    Student supun = new Student(3, "Supun", "supun@gmail.com");
     */


    //To perform initialization tasks after all dependencies have been injected
    @PostConstruct
    public void loadData()
    {
        students = new ArrayList<>();
        Student keshan = new Student(1,"keshan", "keshan@gmail.com");
        Student kumara = new Student(2,"kumara", "kumara@gmail.com");
        Student supun = new Student(3,"Supun", "supun@gmail.com");
        students.add(keshan);
        students.add(kumara);
        students.add(supun);
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return ResponseEntity.ok(students);
    }

    @PostMapping("/student")
    public ResponseEntity<String> createNewStudent(@RequestBody Student newStudent){
        students.add((Student) newStudent);
        return new ResponseEntity<>("Student "+newStudent.getName() +" is Created", HttpStatusCode.valueOf(201));
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id){
        if(id<0){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        for (Student student : students)
        {
            if(student.getID()== id)
            {
                return new ResponseEntity<>(student,HttpStatus.FOUND);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/student/{Id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int Id,@RequestBody Student updateStudent){
        if(Id<0){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        for (Student student : students)
        {
            if(student.getID()== Id)
            {
                student.setEmail(updateStudent.getEmail());
                student.setName(updateStudent.getName());
            }
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
