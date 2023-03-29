import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person aPerson) {
        this.personList.add(aPerson);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    // returns a list of persons in the room
    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    // return the shortest person in the room
    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }

        Person shortPerson = personList.get(0);
        for (Person p : personList) {
            if (p.getHeight() < shortPerson.getHeight()) {
                shortPerson = p;
            }
        }

        return shortPerson;
    }

    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }

        Person toRemove = shortest();

        personList.remove(toRemove);

        return toRemove;

    }
}
