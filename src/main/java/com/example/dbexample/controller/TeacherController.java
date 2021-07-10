package com.example.dbexample.controller;

import com.example.dbexample.model.Teacher;
import com.example.dbexample.pojo.Response;
import com.example.dbexample.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public ResponseEntity<Response> teacherList() {


        Response response= Response.builder()
                .timeStamp(new Date())
                .status(200)
                .message("Data successfully fetched")
                .data(teacherService.getTeacherList())
                .build();

        return new ResponseEntity<>(response,null,HttpStatus.OK);
    }

    //to enter a new data

    @PostMapping("/teacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        Teacher teacher1 = teacherService.saveTeacher(teacher);
        if (teacher != null) {
            System.out.println("data successfully saved");
        }
        return teacher1;
    }

    //to update the data
    @PutMapping("/teacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        Teacher teacher1 = teacherService.saveTeacher(teacher);
        if (teacher != null) {
            System.out.println("data successfully saved");
        }
        return teacher1;
    }

    @DeleteMapping("/teacher/{teacherId}")
    public ResponseEntity<Response> deleteTeacher(@PathVariable("teacherId") Integer id) {
        boolean result = teacherService.deleteTeacher(new Teacher(id));
        Response response = Response.builder()
                .timeStamp(new Date())
                .status(result ? 200 : 500)
                .message(result ? "Data was successfully deleted" : "Data was not deleted")
                .data(result ? 1 : 0)
                .build();
        return new ResponseEntity<>(response,null,HttpStatus.BAD_GATEWAY);
    }
}
