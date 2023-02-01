public class Main {
    public static void main(String[] args) {
        Person mom = new PersonalBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChieldBuilder()
                .setName("Антонио")
                .build();
        System.out.println("У " + mom + " есть сын " + son);
        try {
            System.out.println("Не достаточно обязательных полей");
            new PersonalBuilder().build();
        } catch (IllegalStateException e) {

            e.printStackTrace();
        }
        try {
            new PersonalBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Ввели не корректный возраст");
            e.printStackTrace();
        }
    }
}
