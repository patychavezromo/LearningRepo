package org.patychavez.lists.school.studentfilter;

import org.patychavez.utils.school.StudentSolicitor;
import org.patychavez.utils.school.Students;

import java.util.List;
import java.util.Scanner;

public class StudentFilterMain {

    public void main (){

        Scanner input = new Scanner(System.in);
        StudentSolicitor studentSolicitor = new StudentSolicitor();
        List<Students> listStudents= studentSolicitor.requestStudent();
        System.out.println("THIS IS THE LIST OF STUDENTS");
        System.out.println(listStudents.toString());
        System.out.println("filter students with score of: ");
        int score = input.nextInt();
        input.nextLine();
        StudentFilter studentFilter = new StudentFilter();
        List<Students> filteredList = studentFilter.filterStudentsByGrades(listStudents,score);
        System.out.println("\n\n");
        System.out.println("THESE ARE THE STUDENTS WITH GRADE GREATER THAN OR EQUAL TO "+score+":");
        System.out.println(filteredList.toString());

    }
}
