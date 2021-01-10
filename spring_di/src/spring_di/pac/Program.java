package spring_di.pac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_di.pac.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new MyExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		
		/*
		ApplicationContext context =
				new  ClassPathXmlApplicationContext("spring_di/pac/setting.xml");
		*/
		
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		// �̸����� ��������
		ExamConsole console = (ExamConsole) context.getBean("console");
		// Ÿ�Ը����� ��������
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		// �ݷ��� �ǽ�
		/*
		//List<Exam> exams = new ArrayList<>();
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new MyExam(1,2,3,4));
		
		for(Exam e : exams)
			System.out.println(e);
			*/
	}

}
