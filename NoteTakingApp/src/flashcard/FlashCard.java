/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flashcard;

/**
 *
 * @author Lilly
 */
public class FlashCard {
    
    private String question;
    private String answer;
    
    public FlashCard(String q, String a) {
        
        question = q;
        answer = a;
        
    }
    
    // Getters and Setters
    public String getQuestion(){
        return question;
    }
    
    public void setQuestion( String question){
        this.question = question;
    }
    
    
    public String getAnswer(){
        return answer;
    }
   
     public void setAnswer( String answer){
        this.answer = answer;
    }
    
    
}
