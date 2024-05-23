package creational.prototype;

public class Main {
    public static void main(String[] args) {

        Student farid = new Student("Farid", "Mustafayev", 21);
        System.out.println(farid);


        Student farid1 = (Student) farid.clone();
        System.out.println(farid1);

        System.out.println(farid == farid1);

    }
}
