package Lesson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static String str;

	public static void main(String []args) {
		BufferedReader reader;
		int count = -1;
		try {
			reader = new BufferedReader(new FileReader("src/lesson/Test.txt"));
			String line = reader.readLine();
			String[] words = line.split("\\W+");
			Student student = new Student(words[0], words[1], Integer.parseInt(words[2]));
			while(line != null){
				System.out.println(line);
				words = line.split("\\W+");
				if(count == -1)
				{
					count++;
				}
				else {
					student.ArrLesson[count].setLesson_Name(words[0]);
					student.ArrLesson[count].setSemester(words[1]);
					student.ArrLesson[count].setMark(Integer.parseInt(words[2]));
					System.out.println(Integer.parseInt(words[2]));
					count++;
				}
				line = reader.readLine();
			}
			reader.close();
			System.out.println(student.getName() + " " + student.getSurName()+ " " + student.getStudentID());
			student.ListofLessons();
			student.AverMark();
			student.returnID();
			student.ChangeId("170202037");
			student.returnID();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}


	}
}
