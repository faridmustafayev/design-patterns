package creational.builder.personBuilder;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final int id;
    private final String phone;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.id = builder.id;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private final String name;
        private final String surname;
        private int age;
        private final int id;
        private String phone;

        public PersonBuilder(String name, String surname, int id) {
            this.name = name;
            this.surname = surname;
            this.id = id;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
