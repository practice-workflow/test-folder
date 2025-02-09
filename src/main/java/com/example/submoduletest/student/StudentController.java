package com.example.submoduletest.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<String> onboard(@RequestParam("name") String name) {
        Student student = Student.builder()
                .name(name)
                .build();
        Student savedStudent = studentRepository.save(student);
        return ResponseEntity.ok(savedStudent.getName());
    }
}
