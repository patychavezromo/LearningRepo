package org.patychavez.utils.school;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentSolicitor {

    NameGenerator generator = new NameGenerator();


    public List <Students> requestStudent(){
        Scanner input = new Scanner (System.in);
        List<Students> studentsList = new ArrayList<>();
        System.out.println("the list will have a size of: ");
        int size= input.nextInt();
        input.nextLine();
        List<Name> names = generator.generateNames(size);
        for(int i=0; i<size; i++){
            Random random = new Random();
            int randomScore= 6 + random.nextInt(5);
            String name= String.valueOf(names.get(i));
            int randomAge= 18 + random.nextInt(30);
            Students student = new Students(name,randomAge, randomScore);
            studentsList.add(student);
        }
        return studentsList;
    }
}
