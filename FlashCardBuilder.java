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
        
        frame = new JFrame("Flash Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        
        Font greatFont = new Font("Ariel", Font.BOLD, 21);
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(greatFont);
        
        
        JScrollPane qJScrollPane = new JScrollPane(question);
        qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);
        
        
        JScrollPane aJScrollPane = new JScrollPane(answer);
        aJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       
        
        JButton nextButton = new JButton("Next Card");
        
        cardList = new ArrayList<FlashCard>();
        
        
        JLabel qJLabel = new JLabel("Question");
        JLabel aJLabel = new JLabel("Answer"); 

        mainPanel.add(qJLabel);
        mainPanel.add(qJScrollPane);
        mainPanel.add(aJLabel);
        mainPanel.add(aJScrollPane);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        
        JMenuItem saveMenuItem = new JMenuItem("Save");
        
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        
        menuBar.add(fileMenu);
        
        
        newMenuItem.addActionListener(new NewMenuItemListener());
        saveMenuItem.addActionListener(new SaveMenuItemListener());
        
        
        frame.setJMenuBar(menuBar);
        
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
    }

    public void setVisible(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    class NextCardListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          // create a flashcard
          FlashCard card = new FlashCard(question.getText(), answer.getText());
          cardList.add(card);
          clearCard();
          
          
        }
    }
    
    
    class NewMenuItemListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          System.out.println("New Clicked");
          
        }
    }
    
    
     class SaveMenuItemListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
          FlashCard card = new FlashCard(question.getText(), answer.getText());
          
          JFileChooser fileSave = new JFileChooser();
          fileSave.setCurrentDirectory(new File(System.getProperty("user.dir")));
          fileSave.setAcceptAllFileFilterUsed(false);
          FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
          fileSave.addChoosableFileFilter(restrict);
          fileSave.setApproveButtonText("Save");
          
          fileSave.setAcceptAllFileFilterUsed(false);
          fileSave.showSaveDialog(frame);
          saveFile(new File(fileSave.getSelectedFile() + ".txt"));
        }

    }
     
     
     private void clearCard() {
         question.setText("");
         answer.setText("");
         question.requestFocus();
         
     }
     
     
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
