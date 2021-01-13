package spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new  ClassPathXmlApplicationContext("spring_aop/setting.xml");
				//new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Exam proxy = (Exam) context.getBean("proxy");

		System.out.printf("total is %d\n", proxy.total());
		System.out.println();
		System.out.printf("total is %f\n", proxy.avg());
		
		/*
		Exam exam = new MyExam(1,1,1,1);
		
		Exam proxy= (Exam) Proxy.newProxyInstance(
				MyExam.class.getClassLoader(),
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						long start = System.currentTimeMillis();
						
						Object result  = method.invoke(exam, args);
						
						long end = System.currentTimeMillis();
						String message = (end-start)+"ms 시간이 걸림";
						System.out.println(message);
						
						return result;
					}
				}
			);
		*/
	}

}
