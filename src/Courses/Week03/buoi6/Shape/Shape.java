package Courses.Week03.buoi6.Shape;

public class Shape {
     //Attribute
     private String soundFile;

     //Method
     public Shape(){}
 
     public Shape(String soundFile){
         this.soundFile = soundFile;
     }

     public String getSoundFile(){
        return this.soundFile;
     }

     public void setSoundFile(String soundFile){
         this.soundFile = soundFile;
     }
 
     void rotate(){
         System.out.println("Rotating 360...");
         this.playSound();
     }
 
     void playSound(){
         System.out.println("Play this .aif " + soundFile + " music");
     }
}
