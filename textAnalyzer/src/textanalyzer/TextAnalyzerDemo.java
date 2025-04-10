/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;
import java.util.Arrays;



/**
 *
 * @author shruti-mudabe
 */
public class TextAnalyzerDemo {

    private String inputText;
      private int length;
      private int words;
      private int spaces;
      private int lines;
      private int tabs;
      private String uniqueChars;
      private int wordCount;
      

    public TextAnalyzerDemo( String inputText,String word) {
        this.inputText = inputText;
        performAnalysis();
        this.wordCount = CharOrWordCount(word);
    }
    
    public void setText(String inputText){
        this.inputText = inputText;
    }
    public String getText(){
        return inputText;
     }

    public int getLength() {
        return length;
    }

    public int getWords() {
        return words;
    }

    public int getSpaces() {
        return spaces;
    }

    public int getLines() {
        return lines;
    }

    public int getTabs() {
        return tabs;
    }

    public String getUniqueChars() {
        return uniqueChars;
    }
    public int getWordCount(){
        return wordCount;
    }
    
    private void performAnalysis(){
        length = inputText.length();
        words = inputText.split("[\n\t\s]").length;
        spaces = inputText.split("[\s]",-1).length-1;
        lines = inputText.length()>0 ? inputText.trim().split("[\n]",-1).length : 0;
        tabs = inputText.split("[\t]",-1).length-1;
         
        StringBuilder sb = new StringBuilder();
          
        for(int i=0;i<inputText.length();i++){
           String ch = inputText.charAt(i)+"";
           
               if(!sb.toString().contains(ch) && Character.isLetter(inputText.charAt(i))){
                   sb.append(ch);
               }
           
        }
         
          uniqueChars = sb.toString();
          
    }
     public int CharOrWordCount(String word){
         int count=0;
       String arr[] = inputText.splitWithDelimiters(word,0);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
           if(arr[i].trim().equalsIgnoreCase(word)){
               count++;
           }
       }
       return count;        
     }

    @Override
    public String toString() {
        return "TextAnalyzerDemo{" + "inputText=" + inputText + ", length=" + length + ", words=" + words + ", spaces=" + spaces + ", lines=" + lines + ", tabs=" + tabs + ", uniqueCharString=" + uniqueChars +"Word Count="+wordCount+'}';
    }
    
   
     //* @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        TextAnalyzerDemo td = new TextAnalyzerDemo("shruti\nmudabe\tshruti\nshruti","shruti");
         
        
        System.out.println(td);
         td.CharOrWordCount("shruti");
    }
    
}
