/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package notetakingapp;
import java.io.*;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;


/*
i'm not sure how to import the NoteTakingApp.java class into this note.java 
it is throwing errors </3 so definitely need to fix that some how 
*/


public class Note {
    private String title;
    private String content; // consider storing rich text or HTML for advanced formatting
    private Date creationDate;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.creationDate = new Date(); // automatically set the creation date
    }
    
    
    // Getters and setters

    // Method to save the note to a file
    public void saveNoteToFile(String directoryPath) {
        try {
            // Create the file path for saving the note
            String filePath = directoryPath + File.separator + getTitle() + ".note";
            
            // Create a new ObjectOutputStream to write the Note object to the file
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            
            // Write the Note object to the file
            outputStream.writeObject(this);
            
            // Close the output stream
            outputStream.close();
            
            System.out.println("Note saved successfully to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to save note to file.");
        }
    }

    // Static method to load a note from a file
    public static Note loadNoteFromFile(String filePath) {
        try {
            // Create a new ObjectInputStream to read the Note object from the file
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
            
            // Read the Note object from the file
            Note loadedNote = (Note) inputStream.readObject();
            
            // Close the input stream
            inputStream.close();
            
            System.out.println("Note loaded successfully from: " + filePath);
            
            return loadedNote;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Failed to load note from file.");
            return null;
        }
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    // add methods for handling embedded images or other advanced features
}
