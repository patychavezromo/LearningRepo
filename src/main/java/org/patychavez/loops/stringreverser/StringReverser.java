package org.patychavez.loops.stringreverser;

public class StringReverser {
    public String reverse(String originalText) {
        StringBuilder invertedText = new StringBuilder();
        for(int i= originalText.length()-1; i>=0;  i--){
            invertedText.append(originalText.charAt(i));
        }
        return invertedText.toString();
    }
}
