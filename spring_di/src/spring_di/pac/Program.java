package spring_di.pac;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_di.pac.entity.Exam;
import spring_di.pac.entity.MyExam;
import spring_di.pac.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new MyExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context =
				new  ClassPathXmlApplicationContext("spring_di/pac/setting.xml");
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		// 이름으로 가져오기
		ExamConsole console = (ExamConsole) context.getBean("console");
		// 타입명으로 가져오기
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		// 콜렉션 실습
		/*
		//List<Exam> exams = new ArrayList<>();
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new MyExam(1,2,3,4));
		
		for(Exam e : exams)
			System.out.println(e);
			*/
	}

}
