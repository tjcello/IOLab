/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author tduwe
 */
public class Lab2 {

    public static void main(String[] args) throws IOException {

        File info = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        BufferedReader address = null;
        try {
            address = new BufferedReader(new FileReader(info));
            String line = address.readLine();
            while (line != null) {
                System.out.println(line);
                line = address.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioException) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                address.close();
            } catch (Exception exception) {

            }
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(info, true)));
        
        out.print("Joe ");
        out.println(" Schmoe");
        out.println("1234 GoAway Ln");
        out.print("Sheboygan");
        out.print(" WI ");
        out.println(12345);
        out.close();

        System.out.println("Done");

    }
}
