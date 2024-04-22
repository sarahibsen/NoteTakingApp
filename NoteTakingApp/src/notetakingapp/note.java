/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lilly
 */
/*
 *
 */
package notetakingapp; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.filechooser.FileNameExtensionFilter;

public class note{
    

    int fsize = 12;
    
    private JTextArea area;
    private JScrollPane scpane;
    String text = "";

    //Creating Frame and setting up the title
    JFrame frame = new JFrame("Note");

    JTextField Title;
    JPanel bottomPanel;
    JScrollPane sb;
    
   
    // Defining a List of Fonts for the text, Uses the Fonts available in Java
    String fontFamilyValues[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    
    
    //Defining List of Font Size for Text
    String fontSizeValues[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", 
        "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28",
        "30", "36", "38", "40", "42", "44", "46", "48", "50", "56", "58", "60", 
        "62", "64", "66", "68", "70", "72"};
    
   
    int[] stylevalue = {Font.PLAIN, Font.BOLD, Font.ITALIC};
    
    //Defining List of Font Styles for Text
    String[] fontStyleValues = {"PLAIN", "BOLD", "ITALIC"};
    
    
    // Defines variables to allow formatting of text
    Font newFont;
    String fontFamily, fontSize, fontStyle;
    JList fontFamilyList, fontStyleList, fontSizeList; 
    int fstyle;
    
    
    public note(){
      
        bottomPanel = new JPanel();

        // Creating a menu bar to hold File, Edit, and Format
        JMenuBar menuBar = new JMenuBar();

        // Creating the JMenu for the file tab
        JMenu fileMenu = new JMenu("File");

        // Creates the options that will be under the file tab
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem printMenuItem = new JMenuItem("Print");
        JMenuItem exitMenuItem = new JMenuItem("Exit");


        // Creating the JMenu for the Edit tab
        JMenu editMenu = new JMenu("Edit");

        // Creates the menu items that will be under the edit tab
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem selectMenuItem = new JMenuItem("Select All");


        // Creating the JMenu for the Format tab
        JMenu formatMenu = new JMenu("Format");

        // Creates the menu items that will be under the Format tab
        JMenuItem fontfamilyMenuItem = new JMenuItem("Font Family");
        JMenuItem fontstyleMenuItem = new JMenuItem("Font Style");
        JMenuItem fontsizeMenuItem = new JMenuItem("Font Size ");


        //TextArea / Editor of Notepad
         area = new JTextArea();

        //Creating Scrollables around textarea
        scpane = new JScrollPane(area);

        //Creating border for scrollpane
        scpane.setBorder(BorderFactory.createEmptyBorder());


        // Adds the menuitems to the file drop-down button in menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.add(exitMenuItem);

        // Adds the menuitems to the edit drop-down button in menu
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(selectMenuItem);

        // Adds the menuitems to the format drop-down button in menu
        formatMenu.add(fontfamilyMenuItem);
        formatMenu.add(fontstyleMenuItem);
        formatMenu.add(fontsizeMenuItem);

        // Adds the File to the menu bar
        menuBar.add(fileMenu);

        // Adds the actions that each button under the file tab should perform
        newMenuItem.addActionListener(new newMenuItemListener());
        openMenuItem.addActionListener(new openMenuItemListener());
        saveMenuItem.addActionListener(new saveMenuItemListener());
        printMenuItem.addActionListener(new printMenuItemListener());
        exitMenuItem.addActionListener(new exitMenuItemListener());


        // Adds Edit to the menu bar
        menuBar.add(editMenu);

        // Adds the actions that each button under the edit tab should perform
        copyMenuItem.addActionListener(new copyMenuItemListener());
        pasteMenuItem.addActionListener(new pasteMenuItemListener());
        cutMenuItem.addActionListener(new cutMenuItemListener());
        selectMenuItem.addActionListener(new selectMenuItemListener());


        // Adds Format to the menu bar
        menuBar.add(formatMenu);

        // Adds the actions that each button under the format tab should perform
        fontfamilyMenuItem.addActionListener(new fontfamilyMenuItemListener());
        fontstyleMenuItem.addActionListener(new fontstyleMenuItemListener());
        fontsizeMenuItem.addActionListener(new fontsizeMenuItemListener());



        //Creating List of Font Styles and assigning the list values
        fontStyleList = new JList(fontStyleValues);
        
        
        
        // Creating List of Font options and assigning the list values
        // Allows for the fonts list to be scrollable
        fontFamilyList = new JList(fontFamilyValues){
            @Override
            public Dimension getPreferredScrollableViewportSize(){
                Dimension dim = super.getPreferredScrollableViewportSize();
                dim.width = 25;
                return dim;
          }
        };
        

      

        // Creating List of Font Size and assigning the list values
        // Allows for the lizt of sizes to be scrollable
        fontSizeList = new JList(fontSizeValues){
          @Override
          public Dimension getPreferredScrollableViewportSize(){
            Dimension dim = super.getPreferredScrollableViewportSize();
            dim.width = 25;
            return dim;
         }
        };
        
        
        
        //Allowing user to select only one option
        fontFamilyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontStyleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontSizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //TextArea / Editor of Notepad
        area = new JTextArea();

        //Default font will be Times New Roman and default font style will be plain and default style will be 12. 
        area.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        //Sets the line-wrapping policy of the text area
        area.setLineWrap(true);

        //Sets the word-wrapping policy of the text area
        area.setWrapStyleWord(true);

        //Creating Scrollables around textarea
        scpane = new JScrollPane(area);

        //Creating border for scrollpane
        scpane.setBorder(BorderFactory.createEmptyBorder());


        // Sets the menu bar on the note frame
        frame.setJMenuBar(menuBar);

        //Setting up the size of frame
        frame.setSize(500, 500);

        //Setting up the layout of frame
        frame.setLayout(new BorderLayout());

        //Adding panels in frame
        frame.add(scpane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        //Setting Frame visible to user
        frame.setVisible(true);
}
   
    // creates a class that handles the action for when new button is pressed
    class newMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             //Setting Text as empty by default
            area.setText("");
        }
    }
     
   // Creates a class that uses an ActionListener to open the files or notes 
    class openMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
             // Setting current directory to the "user.dir" or where project is stored
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            chooser.setAcceptAllFileFilterUsed(false);
            //Allowing only text (.txt) files extension to open
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
            chooser.addChoosableFileFilter(restrict);
            
            // Opens the open file dialog available through Java
            int result = chooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try {
                    //Reading the file
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    area.read(br, null);
                    //Closing the file after reading
                    //Clearing the memory
                    br.close();
                    area.requestFocus();
                } catch (Exception ex) {
                    System.out.print(ex);
                }        
            }
        }
    }
    
    
    // Creates a class that uses an ActionListener to save the files or notes 
    class saveMenuItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            final JFileChooser SaveAs = new JFileChooser();
            // Setting current directory to the "user.dir" or where project is stored
            SaveAs.setCurrentDirectory(new File(System.getProperty("user.dir")));
            SaveAs.setAcceptAllFileFilterUsed(false);
            // Allowing only text (.txt) files extension to open
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
            SaveAs.addChoosableFileFilter(restrict);
            SaveAs.setApproveButtonText("Save");
            // Opens the Save file dialog available through Java
            int actionDialog = SaveAs.showSaveDialog(frame);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }
            // When file is save it converts the file to .txt
            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                area.write(outFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
    }
    
    
    // Creates a class that uses an ActionListener to print the files or notes
    class printMenuItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                //printer dialog will open
                area.print();
            } catch (Exception ex) {
            }
        }
    }
    
    
    // Creates a class that uses an ActionListener to exit the note editing page
    class exitMenuItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Destroying/Closing the frame/window
            frame.dispose();
        }
    }
    
    // Creates a class that uses an ActionListener to copy the files or notes
    class copyMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            text = area.getSelectedText();
        }
    }
    
    
    // Creates a class that uses an ActionListener to paste to the note
    class pasteMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            area.insert(text, area.getCaretPosition());
        }
    }
    
    // Creates a class that uses an ActionListener to cut information from the note
    class cutMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            text = area.getSelectedText();
            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }
    }
    
    // Creates a class that uses an ActionListener to Select everything on note
    class selectMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            area.selectAll();
        }
    }
    
    // Creates a class that uses an ActionListener to open the availabel fonts
    class fontfamilyMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
            // Uses a JOptionPane to show the selection of available fonts
            JOptionPane.showConfirmDialog(null, new JScrollPane(fontFamilyList), "Choose Font Family", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            // Gets the selected font from the user
            fontFamily = String.valueOf(fontFamilyList.getSelectedValue());
            
            newFont = new Font(fontFamily, fstyle, fsize);
            
            // Sets the new font
            area.setFont(newFont);
             
        }
    }
    

    // Creates a class that uses an ActionListener to open the available font styles
    class fontstyleMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Setting up Font Style using JOptionPane to show options
          JOptionPane.showConfirmDialog(null, fontStyleList, "Choose Font Style",
                   JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
           fstyle = stylevalue[fontStyleList.getSelectedIndex()];
           newFont = new Font(fontFamily, fstyle, fsize);
           area.setFont(newFont);
             
        }
    }
    
    // Creates a class that uses an ActionListener to open font size selection
    class fontsizeMenuItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
           //Setting up Font Size
           JOptionPane.showConfirmDialog(null, new JScrollPane(fontSizeList), "Choose Font Size",
                   JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
           fontSize = String.valueOf(fontSizeList.getSelectedValue());
           fsize = Integer.parseInt(fontSize);
           newFont = new Font(fontFamily, fstyle, fsize);
           area.setFont(newFont);
             
        }
    }
    
    
    
    
    

    public static void main(String ar[]) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
        
        @Override
        public void run(){
            new note();
        }
    });
        
    }

    public void setVisible(boolean b) {
        
    }
      
}
