package spring_di.pac.ui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring_di.pac.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required=true)
	@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
		
	public InlineExamConsole(Exam exam) {
		System.out.println("New constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n",exam.total(), exam.avg());
	}
	
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}
}
 