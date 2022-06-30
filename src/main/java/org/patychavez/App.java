package org.patychavez;

import org.patychavez.arraypractice.matrixprinter.MatrixPrinterMain;
import org.patychavez.arraypractice.onedimensionalarray.OneDimensionalArrayMain;
import org.patychavez.arraypractice.switchrowstocolumns.SwitchRowsToColumnsMain;
import org.patychavez.utils.school.StudentSolicitor;
import org.patychavez.utils.school.Students;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        StudentSolicitor studentSolicitor = new StudentSolicitor();
        List<Students> studentsList=studentSolicitor.requestStudent();
        System.out.println(studentsList.toString());
    }
}
