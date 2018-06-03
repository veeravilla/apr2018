package com.test.springdemo;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.test.springdemo.dao.StudentRepository;
import com.test.springdemo.entity.Student;

@RunWith(SpringRunner.class)
@WebMvcTest(value = StudentController.class, secure = false)
public class StudentControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentRepository studentRepository;
	
	@MockBean
	private JmsTemplate jmsTemplate;
	
	@Test
	public void getStudentById() throws Exception {
		//Mock Object
		Student student = new Student();
		student.setCourse("MS");
		student.setFee(3456);
		student.setSname("Jhon");
		student.setSno(999);
		
		Optional<Student> mockStudent = Optional.of(student);
		
		Mockito.when(studentRepository.findById(999)).thenReturn(mockStudent);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/v1/api/student/999").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{\"sno\":999,\"sname\":\"Jhon\",\"course\":\"MS\",\"fee\":3456}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
		
	}

}
