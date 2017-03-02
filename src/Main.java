/**
 * Created by HP on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        person.setName("Peter");
        person.setEmail("Peter.15@cse.mrt.ac.lk");

        System.out.println(person);
        System.out.println(main.savePerson(person));
    }

    public Person savePerson(Person person) {
        if (person == null) {
            throw new IllegalArgumentException();
        }
        else {
            person.setId("p100");
            return person;
        }

    }
}
