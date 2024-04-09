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


public class note {
    private String title;
    private String content; // consider storing rich text or HTML for advanced formatting
    private Date creationDate;

    public note(String title, String content) {
        this.title = title;
        this.content = content;
        this.creationDate = new Date(); // automatically set the creation date
    }
    // might want to try using this way of creating files it seems easier
    public void createNote(String title) {
        File file = new File(title);
        if (file.exists()){
            System.out.println("That file already exists! :0");
        }
        else {
            System.out.println("That file doesn't exist! :)");
        }
    }
    
    // Getters and Setters
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
