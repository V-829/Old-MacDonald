public class Chick implements Animal {
    private String sound;
    private String type;
    private String sound2;
    public Chick(String type, String sound){
        this.sound = sound;
        this.type = type;
    }
    public Chick(String type, String sound, String sound2){
        this.sound = sound;
        this.type = type;
        this.sound2 = sound2;
    }
   
    public String getSound(){
       return sound + sound2;
    }
    public String getType(){
        return type;
    }
}