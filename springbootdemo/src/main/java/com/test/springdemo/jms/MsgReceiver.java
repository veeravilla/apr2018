package com.test.springdemo.jms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.test.springdemo.entity.Student;

@Component
public class MsgReceiver {

	@JmsListener(destination = "demo.requestq", containerFactory = "myFactory")
	public void receiveMessage(Student student) {
		System.out.println("Received <<<<<<<<<<<<<<< " + student + ">>>>>>>>>>>>>>>>>>>>");
	}

}
