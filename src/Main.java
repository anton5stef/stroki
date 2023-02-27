import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        taskTutorial();
        task1();
        task2();
        task3();
    }

    public static void taskTutorial () {
        String phone = "9604157537";
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
// Если длина строки больше 11
            throw new RuntimeException("Телефон слишком длинный");
            // Выводим сообщение об ошибке с помощью throw new RuntimeException
        } else if (phone.length() < 10) {
// Если длина строки меньше 10
            throw new RuntimeException("Телефон слишком короткий");
            // Выводим сообщение об ошибке
        }
        System.out.println("phone = " + phone);
    }

        public static void task1 () {
            System.out.println("Задача 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника — " + fullName);


        }
    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3 () {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

        }}
