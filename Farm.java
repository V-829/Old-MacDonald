public class Farm {
    private Animal [] a = new Animal[3];
 Farm () {
    a[0] = new NamedCow ("cow","moo", "Steak") ;
    a[1] = new Chick ("chick","cluck", "cheep") ;
    a[2] = new Pig ("pig","oink") ;
 }
 public void animalSounds () {
    //for loop that goes through farm array and prints 
    // out each animal and its sound
    for (int i = 0; i < a.length ; i ++) {
        System.out.println (a[i].getType() + " goes " + a [i].getSound());
     }
     // prints out the name of the NamedCow object
    System.out.println ("The cow is known as " +((NamedCow)a[0]).getName()) ;
  
    }
 }

