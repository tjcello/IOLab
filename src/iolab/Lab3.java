/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Lab3 {

    public static void main(String[] args) throws IOException {

        int record = 3;
        int recordNumber = 3;
        File data = new File("F:" + File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

       BufferedReader in = null;
            List<String> Lines = new ArrayList<>();
            try {   
                in = new BufferedReader(new FileReader(""
                        + "F:" + File.separatorChar + "temp" + File.separatorChar + "Lab1.txt"));
                String str;
                while ((str = in.readLine()) != null) {
                    Lines.add(str);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    in.close();
                }
            }
            System.out.print(Lines.get(record * recordNumber - 3));
            System.out.print("'s state: ");
            String line = (Lines.get(record * recordNumber - 1));
            String [] lines = line.split(" ");
            System.out.println(lines[1]);
    }
}
