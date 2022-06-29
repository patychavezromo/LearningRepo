package org.patychavez.utils.school;

public class Students {

    private String name;
    private int age;
    private float score;

    public Students (String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName (){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getScore() {
        return this.score;
    }


    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String toString(){
        return "Student name: "+this.name+"\n"+
               "Age: "+this.age+" years old\n"+
               "Score: "+this.score+"\n";
    }

}