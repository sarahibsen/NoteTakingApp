/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package notetakingapp;

/**
 *
 * @author sarah
 * this will be our flashcard creation. 
 * for the UI, we can make a new window or panel for viewing flashcards 
 * maybe implement a study mode where the user can use this class for studying
 * this is just a basic skeleton 
 */
public class Flashcard {
    private String question;
    private String answer;
    private String title;
    //  add image paths or extra notes

    public Flashcard(String question, String answer, String title) {
        this.question = question;
        this.answer = answer;
        this.title = title;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Add methods for any additional fields
}
