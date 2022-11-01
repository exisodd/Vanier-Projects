/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _testapplication;


import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class _TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println(letterToNumber('g', 6));

    }
    static int letterToNumber(char c) {
        return Character.toTitleCase(c) - 65;
    }
//    static int letterToNumber(char c, int offset) {
//        int c_offset = letterToNumber(c) + offset;
//        if (c_offset <= 25) {
//            return c_offset;
//        } else if (c_offset % 25 == 0) {
//            return 25;
//        } else {
//            return c_offset % 25 - (c_offset / 25);
//        }
//    }

    static int letterToNumber(char c, int offset) {
        int c_offset = letterToNumber(c) + offset;
        return c_offset % 26;
    }
}
