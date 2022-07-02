package org.patychavez.lists.school.averagescore;

import org.patychavez.utils.school.Students;

import java.util.List;

public class AverageScore {

    public float average (List<Students> stdudentsList){
        float suma=0;
        float average=0;
        int divider=stdudentsList.size();
        for(Students student : stdudentsList ){
            float currentScore = student.getScore();
            suma= (suma+currentScore);
        }
        average = suma/divider;
        return average;
    }
}
