
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
import java.util.ArrayList;
import java.util.List;

public class NoteTakingApp extends JFrame {
    private List<note> notes;
    private JTextPane textPane; // for advanced text formatting and embedding images
    private JList<note> notesList; // to display a list of notes
 //   private List<Flashcard> flashcards; // call the flashcard class to be used within the main 
    private DefaultListModel<note> notesModel; // model for notesList

    public NoteTakingApp() {
        setTitle("Note Taking App");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        notes = new ArrayList<>();
      //  flashcards = new ArrayList<>(); 
        initUI();
    }
    
      
    

    private void initUI() {
        // initialize UI components here
        // consider adding a toolbar for text formatting options
        // implement functionality for creating, editing, and deleting notes, and for adding advanced formatting
    }
// create method for flashcards management (add, edit, delete, study (aka study mode)
    
 //   public static void main(String[] args) {
 //       SwingUtilities.invokeLater(() -> {
 //           NoteTakingApp app = new NoteTakingApp();
 //           app.setVisible(true);
 //       });
 //   }

   
}
