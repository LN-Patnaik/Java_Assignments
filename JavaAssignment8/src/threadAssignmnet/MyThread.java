package threadAssignmnet;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
 		List<Integer> values=Arrays.asList(12,4,27,78,545,66,24);
 	
 		values.forEach(i-> System.out.println(i));
	}}