package geekbrains_home_work;

public class Main {

    public static void main(String[] args) {
        employeeArray();
    }
    public static void employeeArray() {

        Person[] employeeArray = new Person[]{new Person("Ivanov", "Director", "111111@gmail.com", 375672534, 1000, 45), new Person("Petrov", "Engineer", "111112@gmail.com", 375290876, 900, 35), new Person("Ivanova", "HR", "111113@gmail.com", 375290182, 800, 25), new Person("Sidorova", "Cleaner", "1111@gmail.com", 375290189, 200, 60), new Person("Sidorov", "Security", "111456@gmail.com", 375295672, 400, 50)};

        for(int i = 0; i < employeeArray.length; ++i) {
            if (employeeArray[i].age > 40) {
                employeeArray[i].printPerson();
            }
        }

    }
}
