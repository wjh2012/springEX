package spring_di.pac.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exam2")
public class MyExam implements Exam {
	
	@Value("10")
	private int kor;
	@Value("20")
	private int eng;
	@Value("30")
	private int math;
	@Value("40")
	private int com;
	
	public MyExam() {
		// TODO Auto-generated constructor stub
	}
	
	public MyExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

	@Override
	public String toString() {
		return "MyExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	
	
}
