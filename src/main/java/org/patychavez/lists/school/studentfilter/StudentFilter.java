package org.patychavez.lists.school.studentfilter;

import org.patychavez.utils.school.Students;

import java.util.ArrayList;
import java.util.List;


public class StudentFilter {

    public List<Students> filterStudentsByGrades (List<Students> listStudents, int score ){

        List<Students> filteredList = new ArrayList<>();
        for (Students student : listStudents){
            float currentScore= student.getScore();
            if(currentScore >= score ){
                filteredList.add(student);
            }
        }
        return filteredList;
    }
}
