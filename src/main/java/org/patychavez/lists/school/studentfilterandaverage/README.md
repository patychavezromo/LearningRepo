# Filter and average a list of students 
***
***

This program filters the students with a score equal to or greater than the indicated grade and performs an average of that filtering.

:mortar_board:

```java
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
```

