/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flashcard;

/**
 *
 * @author Lilly
 */

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FlashCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private JFrame frame;
    
    public FlashCardBuilder(){
        
        // Creating the frame and setting up the title
        frame = new JFrame("Flash Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        
        // Sets the font on the flashcard
        Font greatFont = new Font("Ariel", Font.BOLD, 21);
        
        // Creates a TextArea for the question and allows text to wrap in the TextArea
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(greatFont);
        
        
        // Allows the TextArea for the question to be scrollable
        JScrollPane qJScrollPane = new JScrollPane(question);
        qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        // Creates a TextArea for the answer and allows text to wrap in the TextArea
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);
        
        // Allows the TextArea for the answer to be scrollable
        JScrollPane aJScrollPane = new JScrollPane(answer);
        aJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       
        // Implements a JButton to got to next card
        JButton nextButton = new JButton("Next Card");
        
        // Creates an array list of cards
        cardList = new ArrayList<FlashCard>();
        
        // Creats Question and Answer labels
        JLabel qJLabel = new JLabel("Question");
        JLabel aJLabel = new JLabel("Answer"); 

        // Adds the question and answers labels and srollable TextAreas to the main panel
        mainPanel.add(qJLabel);
        mainPanel.add(qJScrollPane);
        mainPanel.add(aJLabel);
        mainPanel.add(aJScrollPane);
        mainPanel.add(nextButton);
        
        // For the next card button it calls the NextCardListener() class for its action
        nextButton.addActionListener(new NextCardListener());
        
        // Creates a menu bar using the JMenuBar and adds a file menu to the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        // Creates menu items "New" and "Save" 
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        
        // Adds the "New" and "Save menu items to the file menu
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        
        // Adds the file menu to the menu bar
        menuBar.add(fileMenu);
        
        // Adds actions to the new and save buttons by calling NewMenuItem class and SaveMenuItem class
        newMenuItem.addActionListener(new NewMenuItemListener());
        saveMenuItem.addActionListener(new SaveMenuItemListener());
        
        // Sets the menu bar to the frame
        frame.setJMenuBar(menuBar);
        
        // Creates the format or display of the frame. Sets size and makes it visible
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
    }

    public void setVisible(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    // Class that implements the action that the new card button is to perform
    class NextCardListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          // create a flashcard by getting the text from the question and answer TextArea
          // Then adds the card to the card list and clears card
          FlashCard card = new FlashCard(question.getText(), answer.getText());
          cardList.add(card);
          clearCard();
          
          
        }
    }
    
    
    // Creates the action for the new Menu Item
    class NewMenuItemListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          System.out.println("New Clicked");
          
        }
    }
    
    // Creates the action for the Save menu Item
     class SaveMenuItemListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          FlashCard card = new FlashCard(question.getText(), answer.getText());
          
          // Setting current directory to the "user.dir" or where project is stored
          JFileChooser fileSave = new JFileChooser();
          fileSave.setCurrentDirectory(new File(System.getProperty("user.dir")));
          fileSave.setAcceptAllFileFilterUsed(false);
          // Allowing only text (.txt) files extension to open
          FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
          fileSave.addChoosableFileFilter(restrict);
          fileSave.setApproveButtonText("Save");
          
          fileSave.setAcceptAllFileFilterUsed(false);
          // Opens the Save file dialog available through Java
          fileSave.showSaveDialog(frame);
          // When file is save it converts the file to .txt
          saveFile(new File(fileSave.getSelectedFile() + ".txt"));
        }

    }
     
     // Clears the card, by clearing the TextArea for question and answer
     private void clearCard() {
         question.setText("");
         answer.setText("");
         question.requestFocus();
         
     }
     
     // creates the fi=unctionality to save the file
     private void saveFile(File selectedFile) {
           
         try{
             BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
             Iterator<FlashCard> cardIterator = cardList.iterator();
             
             while(cardIterator.hasNext()){
                 FlashCard card = (FlashCard)cardIterator.next();
                 writer.write(card.getQuestion() + "/");
                 writer.write(card.getAnswer() + "\n");
                 
                 // Format is written in text like: question/Answer
                 
             }
             writer.close();
             
         } catch( Exception e) {
             System.out.println("Couldn't write to file");
             e.printStackTrace(); 
         }
         
        }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
        
        @Override
        public void run(){
            new FlashCardBuilder();
        }
    });
 
   
    }
    
}
