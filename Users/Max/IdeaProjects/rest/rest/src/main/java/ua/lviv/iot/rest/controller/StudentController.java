package ua.lviv.iot.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.rest.model.Student;

@RequestMapping ("/students")
@RestController
public class StudentController {

   @GetMapping (path = "/{id}")
   public Student getStudent(@PathVariable ("id") Integer studentID){
       System.out.println(studentID);
       return new Student("Mircea" ,"Lupescu");
   }

   @PostMapping (produces = {MediaType.APPLICATION_JSON_VALUE, "application/xml;charset=UTF-8"})
    public Student getMoldovanStudent(@RequestBody Student student){
       student.setId(535);
       return student;
   }
}
