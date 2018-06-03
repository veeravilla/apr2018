package com.test.springjpademo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springjpademo.dao.StudentRepository;
import com.test.springjpademo.entity.Student;

@RestController
@RequestMapping("/v1/api")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private JmsTemplate jmsTemplate;

	// Get All Students
	@GetMapping("/students")
	@TrackTime
	public List<Student> getAllNotes() {
		return studentRepository.findAll();
	}

	// Create a new Student
	@PostMapping("/student")
	@TrackTime
	public Student addStudent(@Valid @RequestBody Student student) {
		
		//Student Msg
		jmsTemplate.convertAndSend("demo.requestq", student);

		return studentRepository.save(student);
	}

	// Get a Single Student
	@GetMapping("/student/{sno}")
	@TrackTime
	public Student getStudentById(@PathVariable(value = "sno") Integer sno) {
		return studentRepository.findById(sno).orElseThrow(() -> new ResourceNotFoundException("Student", "sno", sno));
	}

	// Update a Student
	@PutMapping("/student/{sno}")
	public Student updateNote(@PathVariable(value = "sno") Integer sno, @Valid @RequestBody Student studentDetails) {

		Student student = studentRepository.findById(sno)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "sno", sno));

		student.setSname(studentDetails.getSname());
		student.setCourse(studentDetails.getCourse());
		student.setFee(studentDetails.getFee());

		Student updatedStudent = studentRepository.save(student);
		return updatedStudent;
	}

	// Delete a Student
	@DeleteMapping("/student/{sno}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "sno") Integer sno) {
		Student student = studentRepository.findById(sno)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "sno", sno));

		studentRepository.delete(student);

		return ResponseEntity.ok().build();
	}

}
