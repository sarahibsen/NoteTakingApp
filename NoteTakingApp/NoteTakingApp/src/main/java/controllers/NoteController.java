package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import model.;
import views.HomeView;

/**
 * The controller for the view and model.
 *
 * @author dmr for CS321 UAH
 */
public class NoteController {

    private final HomeView theView;
    //private final Model theModel;

    /**
     * Controller constructor. Links the model and the view. Generates
     * appropriate listeners in the view.
     *
     * @param theView as a HomeView
     * @param theModel as a Model NOT YET IMPLEMENTED!!!!!!!!
     */
    public NoteController(HomeView theView) {
        this.theView = theView;

        // Tell the view that whenever the NewNote button
        // is clicked to execute the actionPerformed method
        // in the NewNoteListener inner class
        //this.theView.newNoteButtonListener(new ChangeViewListener());
    }   

    /**
     * Inner class for creating appropriate listeners that direct calculations
     * in the model.
     */
    /**
    public class ChangeViewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String command;

            try {
                // Get the JButton command
                command = e.getActionCommand();

                // Do action in model according to the command
                if (command.equals("newNote")) {
                    theView.newNoteButtonActionPerformed();
                }
                if (command.equals("Subtract")) {
                    theModel.subtractTwoNumbers(firstNumber, secondNumber);
                }
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            } catch (Exception exm) {
                System.out.println(exm.getMessage());
            }

        }

    }
*/
}
