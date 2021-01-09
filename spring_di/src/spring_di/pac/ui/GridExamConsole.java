package spring_di.pac.ui;

import spring_di.pac.entity.Exam;

public class GridExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public GridExamConsole() {
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.printf("total is %d\navg is %f\n",exam.total(),exam.avg());

	}
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}

}
