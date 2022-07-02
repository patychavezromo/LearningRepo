package org.patychavez.lists.school.averagescore;

import org.patychavez.utils.school.StudentSolicitor;
import org.patychavez.utils.school.Students;

import java.util.List;

public class AverageScoreMain {

    public void main() {

        StudentSolicitor studentSolicitor = new StudentSolicitor();
        List<Students> studentsList = studentSolicitor.requestStudent();
        System.out.println(studentsList);

        AverageScore averageScore = new AverageScore();
        float average= averageScore.average(studentsList);
        System.out.println("AVERAGE SCORE: "+average);
    }
}

