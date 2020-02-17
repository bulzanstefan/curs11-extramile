package ro.fasttrackit.curs11.extramile;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        List<StudentGrade> students = reader.readFile("grades.txt");
        System.out.println(students);

        Classroom classroom = new Classroom(students);
        System.out.println(classroom.getGrades("Computer Science"));
    }
}
