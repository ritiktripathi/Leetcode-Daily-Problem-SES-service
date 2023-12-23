package com.dailyProblem.Daily.Problem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailyProblem.Daily.Problem.Service.EmailService;

@RestController
public class ControllerClass {
	@Autowired
	public EmailService email;

	@GetMapping("/email")
	public String sendEmail() {
		email.sendSimpleMessage("ritiktripathi22@gmail.com", "Simple Email Test",
				"This email is sended just for testing purpose");
		return "Email sent";
	}
}
