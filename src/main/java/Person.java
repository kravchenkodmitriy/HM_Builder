import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age > 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (age <= 0) {
            return OptionalInt.empty();
        } else {
            return OptionalInt.of(age);
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age = age + 1;
    }

    public String getAddress() {
        return address;
    }

    public PersonalBuilder newChieldBuilder() {
        return new PersonalBuilder()
                .setName(name)
                .setSurname(surname)
                .setAge(2)
                .setAddress(getAddress());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name =' " + name + '\'' +
                ", surname =' " + surname + '\'' +
                ", age =' " + age + '\'' +
                ", address =' " + address +
                '}';

    }

}
