package creational.builder.personBuilder;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Farid", "Mustafayev", 234)
                .setAge(21)
                .build();
        System.out.println(person);

    }
}
