package org.patychavez.lists.school.studentfilterandaverage;


import org.patychavez.utils.school.StudentSolicitor;
import org.patychavez.utils.school.Students;

import java.util.List;
import java.util.Scanner;

public class FilterAnAverageMain {
    public void main(){
        Scanner input = new Scanner(System.in);
        StudentSolicitor studentSolicitor = new StudentSolicitor();
        List<Students> studentsList= studentSolicitor.requestStudent();
        FilterAndAverage filterAndAverage = new FilterAndAverage();
        System.out.println("filter students with a score greater than:");
        int score= input.nextInt();
        float average= filterAndAverage.filterAndAverage(studentsList,score );
        System.out.println("the average is: "+average);
    }
}
