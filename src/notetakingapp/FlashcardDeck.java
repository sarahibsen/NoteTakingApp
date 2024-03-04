/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package notetakingapp;

/**
 *
 * @author sarah
 */
import java.util.ArrayList;
import java.util.List;

public class FlashcardDeck {
    private List<Flashcard> flashcards;

    public FlashcardDeck() {
        this.flashcards = new ArrayList<>();
    }

    public void addFlashcard(Flashcard flashcard) {
        flashcards.add(flashcard);
    }

    public void removeFlashcard(Flashcard flashcard) {
        flashcards.remove(flashcard);
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    // Additional methods as needed, such as shuffle, sort, etc.
}
