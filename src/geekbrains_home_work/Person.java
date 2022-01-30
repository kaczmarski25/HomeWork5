package geekbrains_home_work;

public class Person {
    String FIO;
    String position;
    String email;
    int phone;
    int cash;
    int age;

    public Person(String FIO, String position, String email, int phone, int cash, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Информация о сутруднике(ах) старше 40 лет: " + this.FIO + ", " + this.position + ", " + this.email + ", " + this.phone + ", " + this.cash + ", " + this.age + ".");
    }

}
