package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class PlantUMLFixer {
        private static List<String> reader(String filename){
            List<String> lines = new ArrayList<>();
            try{
                File f = new File(filename);
                Scanner s = new Scanner(f);
                while(s.hasNextLine()){
                    lines.add(s.nextLine());
                }
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("No se pudo leer el archivo");
                e.printStackTrace();
            }
            for (String line: lines
            ) {
                System.out.println(line);
            }
            return lines;
        }
        public static void fixer(String filename){
            List<String> lines = reader(filename);
            List<String> newLines = new ArrayList<>();

            for (String line: lines) {
                newLines.add(lineFixer(line));
            }
            try{
                FileWriter writer = new FileWriter(filename);
                writer.write(String.join("\n", newLines));
                writer.close();
                System.out.println(String.join("\n", newLines));
            } catch (IOException e) {
                System.out.println("No se pudo escribir el archivo");
                e.printStackTrace();
            }
        }

        private static String lineFixer(String line){
            if(line.indexOf("-") == 0 || line.indexOf("+") == 0 || line.indexOf("#") == 0){
                String[] lines = line.split(" ");
                if(lines.length == 3)
                    line = lines[0] + " " + lines[2] + ": " + lines[1];
                else if(lines.length == 4)
                    line = lines[0] + " " + lines[3] + ": " + lines[1] + " " + lines[2];
            }
            return line;
        }
    }

