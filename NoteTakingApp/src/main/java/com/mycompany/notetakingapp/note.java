/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.notetakingapp; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;


/*
i'm not sure how to import the NoteTakingApp.java class into this note.java 
it is throwing errors </3 so definitely need to fix that some how 
*/
import java.util.Date;

public class note extends KeyAdapter implements ActionListener, KeyListener {
    private String title;
    private String content; // consider storing rich text or HTML for advanced formatting
    private Date creationDate;
    
    
    public note(String title, String content) {
        this.title = title;
        this.content = content;
        this.creationDate = new Date(); // automatically set the creation date
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
    
   
    //Default Font Size for text
    int fsize = 12;

    private JTextArea area;
    private JScrollPane scpane;
    String text = "";

    //Creating Frame and setting up the title
    JFrame frame = new JFrame("Note");

    JTextField Title;
    JPanel bottomPanel;
    JLabel detailsOfFile;
    JScrollPane sb;
    JMenuBar menuBar;
    JMenu file;
    JMenuItem newdoc, open, save, print, exit;
    
    
    
    
    public note() {
        //Calling initUI() method to initiliaze UI
        initUI();
        
        //Calling addActionEvents() method to add events
        addActionEvents();
    }

    public void actionPerformed(ActionEvent ae) {
        
        //if new option is choosen
        if (ae.getActionCommand().equals("New")) {
            //Setting Text as empty by default
            area.setText("");
        } //if open option is chosen
        else if (ae.getActionCommand().equals("Open")) {
           // Action for the open tab should be placed here 
            
            
            
        } //if save option is choosen
        else if (ae.getActionCommand().equals("Save")) {
            
          // Acton for the save button can be ubdated here
            
            
            
        } //if print option is choosen
        else if (ae.getActionCommand().equals("Print")) {
            
            try {
                //printer dialog will open
                area.print();
            } catch (Exception e) {
            }
        } //if exit option is choosen
        else if (ae.getActionCommand().equals("Exit")) {
            //Destroying/Closing the frame/window
            frame.dispose();
        } 
    }

    

    public void initUI() {
        detailsOfFile = new JLabel();

        bottomPanel = new JPanel();

        //Creating Menubar
        menuBar = new JMenuBar();

        //Creating Menu "File"
        file = new JMenu("File");

        //Creating MenuItem "New"
        newdoc = new JMenuItem("New");


        //Creating MenuItem "Open"
        open = new JMenuItem("Open");


        //Creating MenuItem "Save"
        save = new JMenuItem("Save");


        //Creating MenuItem "Print"
        print = new JMenuItem("Print");


        //Creating MenuItem "Exit"
        exit = new JMenuItem("Exit");

        
        //TextArea / Editor of Notepad
        area = new JTextArea();

        
        //Creating Scrollables around textarea
        scpane = new JScrollPane(area);

        //Creating border for scrollpane
        scpane.setBorder(BorderFactory.createEmptyBorder());

        //Adding menubar in frame
        frame.setJMenuBar(menuBar);

        //Adding all menus in menubars
        menuBar.add(file);
        file.add(newdoc);
        file.add(open);
        file.add(save);
        file.add(print);
        file.add(exit);


        bottomPanel.add(detailsOfFile);

        //Setting up the size of frame
        frame.setSize(900, 500);

        //Setting up the layout of frame
        frame.setLayout(new BorderLayout());

        //Adding panels in frame
        frame.add(scpane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        //Setting Frame visible to user
        frame.setVisible(true);
    }

    public void addActionEvents() {
        //registering action listener to buttons
        newdoc.addActionListener(this);
        save.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        open.addActionListener(this);
     

    }

    public static void main(String ar[]) {
        // TODO code application logic here
        note noteFrame;
        noteFrame = new note();
    }
    
    
    
}
