package Lesson;

import java.io.*;

public class Student {
    private String Name;
    private String SurName;
    private int StudentID;
    Lesson[] ArrLesson = new Lesson[6];
    public Student(String Name, String SurName, int StudentID)
    {
        this.Name = Name;
        this.SurName = SurName;
        this.StudentID = StudentID;
        ArrLesson[0] = new Lesson();
        ArrLesson[1] = new Lesson();
        ArrLesson[2] = new Lesson();
        ArrLesson[3] = new Lesson();
        ArrLesson[4] = new Lesson();
        ArrLesson[5] = new Lesson();
    }
    public void ChangeId(String NewID)
    {
        File fileToBeModified = new File("src/lesson/Test.txt");

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();
            String[] words = line.split("\\W+");

            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent

            String newContent = oldContent.replaceAll(words[2], NewID);

            //Rewriting the input text file with newContent

            writer = new FileWriter(fileToBeModified);

            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources

                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        setStudentID(Integer.parseInt(NewID));
    }
    public void returnID()
    {
        System.out.println(StudentID);
    }
    public void AverMark()
    {
        int num = 0;
        for (Lesson lesson : ArrLesson) {
            num += lesson.getMark();

        }
        System.out.println(num / ArrLesson.length);
    }
    public void ListofLessons()
    {
        for(Lesson lesson : ArrLesson)
        {
            System.out.println(lesson.getLesson_Name());
        }
    }

    public int getStudentID() {
        return StudentID;
    }
    public void setStudentID(int studentID) {
        StudentID = studentID;

    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSurName() {
        return SurName;
    }
    public void setSurName(String surName) {
        SurName = surName;
    }
    public Lesson[] getArrLesson() {
        return ArrLesson;
    }
    public void setArrLesson(Lesson[] arrLesson) {
        ArrLesson = arrLesson;
    }
}
