package ca.sait.blog.blogdemo.restcontrollers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DateRestController {
	
	@GetMapping("date")
	public Date getCurrentDate() {
		return new Date();
	}
}
