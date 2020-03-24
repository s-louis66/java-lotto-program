package com.ttsprojectjava;

public class AsciiChars {
    public static void printNumbers()
    {
        // TODO: print valid numeric input
        int i = 48;
        char numChange = (char)i;
        for(i = 48; i <= 57; i++) {
            System.out.println((char)i);
        }
    }
    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        int b = 97;
        char changeLower = (char)b;
        for (b = 97; b <= 122; ++b) {
            System.out.println((char)b);
        }
    }
    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        int c = 65;
        char changeUpper = (char)c;

        for (c = 65; c <= 90; ++c) {
            System.out.println((char)c);
        }
    }
}
