public class Cow  implements Animal {
    private String sound;
    private String type;
    public Cow(String type, String sound){
    //uses parameter arguements to initialize instance variables
        this.sound = sound;
        this.type = type;
    }
   //returns the sound this animal makes
    public String getSound(){
       return sound;
    }
    //returns the type of animal this animal is
    public String getType(){
        return type;
    }
}
