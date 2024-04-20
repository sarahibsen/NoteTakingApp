/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import notetakingapp.NoteTakingApp;

/**
 *
 * @author Landan
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    private NoteTakingApp noteTakingApp;

    public HomeView() {
        initComponents();
        noteTakingApp = new NoteTakingApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NotesDirectory = new javax.swing.JDialog();
        NoteEditing = new javax.swing.JFrame();
        noteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        saveNote = new javax.swing.JButton();
        flashcardCreation = new javax.swing.JButton();
        flashcardFrame = new javax.swing.JFrame();
        directoryFrame = new javax.swing.JFrame();
        newNote = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notesCollection = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        flashcards = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();

        NotesDirectory.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        NotesDirectory.setTitle("NotesDirectory");

        javax.swing.GroupLayout NotesDirectoryLayout = new javax.swing.GroupLayout(NotesDirectory.getContentPane());
        NotesDirectory.getContentPane().setLayout(NotesDirectoryLayout);
        NotesDirectoryLayout.setHorizontalGroup(
            NotesDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        NotesDirectoryLayout.setVerticalGroup(
            NotesDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        NoteEditing.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        NoteEditing.setTitle("NoteEditing");

        noteLabel.setText(" Note");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        saveNote.setText("saveNote");
        saveNote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        flashcardCreation.setText("flashcard creation");
        flashcardCreation.setToolTipText("");
        flashcardCreation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout NoteEditingLayout = new javax.swing.GroupLayout(NoteEditing.getContentPane());
        NoteEditing.getContentPane().setLayout(NoteEditingLayout);
        NoteEditingLayout.setHorizontalGroup(
            NoteEditingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoteEditingLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(saveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(flashcardCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jScrollPane1)
            .addGroup(NoteEditingLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NoteEditingLayout.setVerticalGroup(
            NoteEditingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoteEditingLayout.createSequentialGroup()
                .addComponent(noteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoteEditingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NoteEditingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNote)
                    .addComponent(flashcardCreation))
                .addContainerGap())
        );

        NoteEditing.getAccessibleContext().setAccessibleDescription("");

        flashcardFrame.setName("flashcardFrame"); // NOI18N

        javax.swing.GroupLayout flashcardFrameLayout = new javax.swing.GroupLayout(flashcardFrame.getContentPane());
        flashcardFrame.getContentPane().setLayout(flashcardFrameLayout);
        flashcardFrameLayout.setHorizontalGroup(
            flashcardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        flashcardFrameLayout.setVerticalGroup(
            flashcardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        directoryFrame.setName("directoryFrame"); // NOI18N

        javax.swing.GroupLayout directoryFrameLayout = new javax.swing.GroupLayout(directoryFrame.getContentPane());
        directoryFrame.getContentPane().setLayout(directoryFrameLayout);
        directoryFrameLayout.setHorizontalGroup(
            directoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        directoryFrameLayout.setVerticalGroup(
            directoryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newNote.png"))); // NOI18N
        newNote.setText("newNote");
        newNote.setInheritsPopupMenu(true);
        newNote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newNoteMousePressed(evt);
            }
        });
        newNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNoteActionPerformed(evt);
            }
        });

        jLabel1.setText("NEW NOTE");

        notesCollection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filingCabinet.png"))); // NOI18N
        notesCollection.setText("notesCollection");
        notesCollection.setInheritsPopupMenu(true);
        notesCollection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notesCollectionMousePressed(evt);
            }
        });
        notesCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesCollectionActionPerformed(evt);
            }
        });

        jLabel2.setText("SEE NOTES COLLECTION");

        flashcards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flashCards.png"))); // NOI18N
        flashcards.setText("flashcards");
        flashcards.setInheritsPopupMenu(true);
        flashcards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                flashcardsMousePressed(evt);
            }
        });
        flashcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flashcardsActionPerformed(evt);
            }
        });

        jLabel3.setText("FLASHCARDS");

        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesLabel.setText("Java Notes App");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(newNote, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(notesCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(flashcards, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(notesLabel)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newNote, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flashcards, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        notesLabel.getAccessibleContext().setAccessibleName("notesLabel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNoteActionPerformed
        noteTakingApp.createNewNote();
    }//GEN-LAST:event_newNoteActionPerformed

    private void notesCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesCollectionActionPerformed
       
    }//GEN-LAST:event_notesCollectionActionPerformed

    private void flashcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flashcardsActionPerformed
       
    }//GEN-LAST:event_flashcardsActionPerformed

    
    private void newNoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newNoteMousePressed
        // TODO add your handling code here:
         NoteEditing.setTitle("New Note");
         NoteEditing.setSize(500, 500);
         NoteEditing.setLocationRelativeTo(this); // Center it on the parent window
         NoteEditing.setVisible(true);
         NoteEditing.setDefaultCloseOperation(NoteEditing.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newNoteMousePressed

    // have to create a jFrame and then for the mouse pressed event 
    private void flashcardsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flashcardsMousePressed
        // TODO add your handling code here:
        flashcardFrame.setTitle("Flashcards");
        flashcardFrame.setSize(400, 300);
        flashcardFrame.setLocationRelativeTo(this);
        flashcardFrame.setVisible(true);
        flashcardFrame.setDefaultCloseOperation(directoryFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_flashcardsMousePressed

    private void notesCollectionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesCollectionMousePressed
        // TODO add your handling code here:
        directoryFrame.setTitle("Directory");
        directoryFrame.setSize(400, 300);
        directoryFrame.setLocationRelativeTo(this);
        directoryFrame.setVisible(true);
        directoryFrame.setDefaultCloseOperation(directoryFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_notesCollectionMousePressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame NoteEditing;
    private javax.swing.JDialog NotesDirectory;
    private javax.swing.JFrame directoryFrame;
    private javax.swing.JButton flashcardCreation;
    private javax.swing.JFrame flashcardFrame;
    private javax.swing.JButton flashcards;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newNote;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton notesCollection;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JButton saveNote;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
