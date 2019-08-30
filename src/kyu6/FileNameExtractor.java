package kyu6;

import  java.util.regex.*;
/**
 *
 *https://www.codewars.com/kata/extract-file-name
 *
 */


public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.replaceAll("\\d","");
    }

    public static void main(String[] args) {
        System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
    }
}
