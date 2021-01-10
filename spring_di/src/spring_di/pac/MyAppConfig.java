package spring_di.pac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring_di.pac.entity.Exam;
import spring_di.pac.entity.MyExam;

@ComponentScan("spring_di.pac.ui")
@Configuration
public class MyAppConfig {
	
	@Bean
	public Exam exam() {
		return new MyExam();
	}
}
