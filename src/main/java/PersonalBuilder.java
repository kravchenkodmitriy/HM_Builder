public class PersonalBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonalBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonalBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст ввели меньше нуля");
        } else if (age > 100) {
            throw new IllegalArgumentException("Возраст ввели страше 100");
        }
        this.age = age;
        return this;
    }

    public PersonalBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        if (name == null || surname == null) {
            throw new IllegalStateException("Заполните имя и фамилию!");
        } else {
            return new Person(name, surname, age, address);
        }


    }

}
