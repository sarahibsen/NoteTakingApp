package mvc;

import controllers.NoteController;
//import model.CalcModel;
import views.HomeView;

/**
 * Creates the application. Instances of HomeView, and
 * NoteController are created. The view established by the instance of
 * HomeView is made visible.
 *
 */
public class MVC {
    /**
     * Main entry point.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HomeView theView = new HomeView();

        NoteController theController = new NoteController(theView);

        theView.setVisible(true);
    }
}
