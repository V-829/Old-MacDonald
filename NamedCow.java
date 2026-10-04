public class NamedCow extends Cow {
    private String name;
    public NamedCow(String type, String sound, String name){
    //uses parameter arguements to initialize instance variables
        super(type, sound);
        this.name = name;
    }
    //gets the name of the cow object
    public String getName(){
        return name;
    }
}
