package Ejemplo4;

import Ejemplo3.Actor;
import Ejemplo3.Engineer;
import Ejemplo3.Person;

public class WorkersUtils {
    public <T extends Person> String getJob(T person) {
        return person.getJob();
    }
 // Uso en el método main
    public static void main(String[] args) {
        Actor actor = new Actor("Michael", 23);
        Engineer engineer = new Engineer("Scott", 25);
 
        WorkersUtils wu = new WorkersUtils();
        System.out.println(wu.getJob(actor) + ", " + wu.getJob(engineer));
    }
}
