package org.patychavez.lists.school.studentfilterandaverage;


import org.patychavez.lists.school.averagescore.AverageScore;
import org.patychavez.lists.school.studentfilter.StudentFilter;
import org.patychavez.utils.school.Students;

import java.util.List;

public class FilterAndAverage {

    public float filterAndAverage (List<Students> studentsList, int score){
        System.out.println("Original list of students: ");
        System.out.println(studentsList.toString());
        StudentFilter studentFilter= new StudentFilter();
        List<Students> filteredList = studentFilter.filterStudentsByGrades(studentsList,score);
        System.out.println("Filtered list with students who have a score greater than or equal to "+score +":");
        System.out.println(filteredList.toString());
        AverageScore averageScore= new AverageScore();
        float average= averageScore.average(filteredList);
        return average;
    }
}
