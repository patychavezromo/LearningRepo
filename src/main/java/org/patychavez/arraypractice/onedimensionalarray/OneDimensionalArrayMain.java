package org.patychavez.arraypractice.onedimensionalarray;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class OneDimensionalArrayMain {

    public static void main() {
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        String array[] = oneDimensionalArray.requestData();
        System.out.println(Arrays.toString(array));
    }

}
