
package notetakingapp;

/**
 *
 * @author sarah
 */
/*
use jTextPlane or JEditorPlane for 'advanced' formatting options aka bulleted lists
for the fonts creation : in the GUI incorporate a toolbar or menu that allows the users to select
    fonts, font sizes, and styles. 
for embedded/pasting images , JTextPlane and JEditorPlane support embedded images. 

this current code serializes notes to a file. 
we might need to create a database in order to store notes / handle large amounts of data 

*/

// basic skeleton 
// need to consider creating a database (maybe)
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import views.HomeView;


public class NoteTakingApp extends JFrame {
    private List<Note> notes;
    private Note currentNote;
    private JTextPane textPane; // for advanced text formatting and embedding images
    private JList<Note> notesList; // to display a list of notes
    private List<Flashcard> flashcards; // call the flashcard class to be used within the main 
    private DefaultListModel<Note> notesModel; // model for notesList

    public NoteTakingApp() {
        setTitle("Note Taking App");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        notes = new ArrayList<>();
        flashcards = new ArrayList<>(); 
        initUI();
    }

    
    // Method to create a new note
    public void createNewNote() {
        String title = JOptionPane.showInputDialog(this, "Enter the title of the new note:", "New Note", JOptionPane.PLAIN_MESSAGE);
        if (title != null && !title.isEmpty()) {
            String content = JOptionPane.showInputDialog(this, "Enter the content of the new note:", "New Note", JOptionPane.PLAIN_MESSAGE);
            if (content != null) {
                currentNote = new Note(title, content);
                // You can handle the created note here, e.g., display it in the GUI
            }
        }
    }

    // Method to save the current note
    public void saveCurrentNote() {
        if (currentNote != null) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String directoryPath = fileChooser.getSelectedFile().getParent();
                currentNote.saveNoteToFile(directoryPath);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No note to save.", "Note Taking App", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Method to load a note from a file
    public void loadNoteFromFile(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            currentNote = (Note) objectInputStream.readObject();
            objectInputStream.close();
            // You can handle the loaded note here, e.g., display it in the GUI
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load note.", "Note Taking App", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void initUI() {
       
        // implement functionality for creating, editing, and deleting notes, and for adding advanced formatting
    }
// create method for flashcards management (add, edit, delete, study (aka study mode)
    
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
        HomeView homeView = new HomeView();
        homeView.setVisible(true);
    });
}

   
}
