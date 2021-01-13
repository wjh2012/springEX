package spring_aop.entity;

import java.awt.desktop.SystemSleepEvent;

public class MyExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
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
		
		int result =kor+eng+math+com; 
		
		if(kor>100)
			throw new IllegalArgumentException("��ȿ�������� ��������");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public float avg() {
		
		float result = total()/4.0f; 
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "MyExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	
	
}
