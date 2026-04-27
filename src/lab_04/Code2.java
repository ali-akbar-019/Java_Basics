package lab_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code2 {

	public static void main(String args[]) throws IOException, InterruptedException {
		long startTime = System.currentTimeMillis();
		String classpath = "D:\\eclipse-workspace\\Java_Basics\\bin";

		ProcessBuilder p1 = new ProcessBuilder("java", "-cp", classpath, "lab_04.WorkerProcess");
		ProcessBuilder p2 = new ProcessBuilder("java", "-cp", classpath, "lab_04.WorkerProcess");
		///
		///
		Process pr1 = p1.start();
		Process pr2 = p2.start();
		//
		printProcessOutput("Process 1", pr1);
		printProcessOutput("Process 2", pr2);

		//
		pr1.waitFor();
		pr2.waitFor();
//		
		long endTime = System.currentTimeMillis();
		System.out.println("Total taken by the process: " + (endTime - startTime));

	}

	public static void printProcessOutput(String pName, Process pr) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		BufferedReader errorReader = new BufferedReader(new InputStreamReader(pr.getErrorStream()));

//		print
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(pName + " OUTPUT " + line);
		}
		while ((line = errorReader.readLine()) != null) {
			System.err.println(pName + " ERROR " + line);
		}
	}
}
