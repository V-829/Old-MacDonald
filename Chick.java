public class Chick implements Animal {
    private String sound;
    private String type;
    private String sound2;
    //constructor of chick with two parameters
    public Chick(String type, String sound){
        //uses parameter arguements to initialize instance variables
        this.sound = sound;
        this.type = type;
    }
    //constructor of chick again, but with 3 paramaters
    public Chick(String type, String sound, String sound2){
        //uses parameter arguements to initialize instance variables
        this.sound = sound;
        this.type = type;
        this.sound2 = sound2;
    }
   //method that prints out either 1 sound or the other
    public String getSound(){
        double check = Math.random();
        //if-else statement to make sure both sounds
        //have equal probability of being chosen
        if(check<=0.5){
       return sound;
        }
        else{ 
            return sound2;
        }
    }
    //returns the what type of animal the animal is
    public String getType(){
        return type;
    }
}