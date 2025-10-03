package Ejemplo3;

public class Worker<T extends Person> {
    protected Person person;
 
    public Worker(T person) { 
this.person = person; 
}
    public String getJob() { 
return this.person.getJob(); 
}
 }
