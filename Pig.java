public class Pig implements Animal {
    private String sound;
    private String type;
    public Pig(String type, String sound){
        this.sound = sound;
        this.type = type;
    }
   
    public String getSound(){
       return sound;
    }
    public String getType(){
        return type;
    }
}