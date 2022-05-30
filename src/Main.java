public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName, middleName, lastName, fullName = "";
        firstName = "Ivan";
        middleName = "Ivanovich";
        lastName = "Ivanov";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -  " + fullName);
        System.out.println("\nЗадание 2");
        System.out.println("ФИО сотрудника для заполнения отчета -  " + fullName.toUpperCase());
        System.out.println("\nЗадание 3");
        System.out.println("ФИО сотрудника для административного отдела -  " + fullName.replace(" ","; "));
        System.out.println("\nЗадание 4");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника -  " + fullName.replace("ё","е"));



    }
}