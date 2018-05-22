package tpgproject.question3;

import java.lang.reflect.Method;

public class TimeMeasureTool {
	
	public static void main(String[] args) {
		String className = "tpgproject.question3.TimeMeasureTool";
		String methodName = "methodToCall";
		
		try {
			Class<?> c = Class.forName(className);
			c.newInstance();
			Method method = c.getMethod(methodName);
			
			long beforeTime = System.currentTimeMillis();
			method.invoke(c);
			long afterTime = System.currentTimeMillis();
			
			long elapsedTime = afterTime - beforeTime;
				
			System.out.println(className + methodName + ": " + elapsedTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void methodToCall() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
