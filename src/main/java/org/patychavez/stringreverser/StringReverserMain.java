package org.patychavez.stringreverser;

public class StringReverserMain {

    public static void main() {
        String originalText="sample text";
        StringReverser stringReverser = new StringReverser();
        String invertedText = stringReverser.reverse(originalText);
        System.out.println(invertedText);
    }

}
