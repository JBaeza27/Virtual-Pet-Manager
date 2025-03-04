package org.example;

import java.io.*;

public class GameDataManager {
    public static void saveFile(Pet pet){
        try {
            /*Creating a new BufferedWriter Object which buffers the data and write it efficiently in chunks
                File Writer writes one character at a time to a file
                FileWriter is given the file name of "SavedFile.txt" to write to.
             */
            BufferedWriter writer = new BufferedWriter(new FileWriter("SavedFile.txt"));
            writer.write(pet.getName() + " " + pet.getHappiness() + " " + pet.getHunger());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }

    public static void readRead(Pet pet){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("SavedFile.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
