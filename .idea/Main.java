import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int usersInput = scanner.nextInt();

            if (usersInput == 1) {
                // Точка вызова метода для добавления шагов
                tracker.addNewNumberStepsPerDay();
            } else if (usersInput == 2) {
                // Точка вызова метода для изменения цели по шагам в день
                tracker.changeStepGoal();
            } else if (usersInput == 3) {
                // Точка вызова метода для печати статистики
                tracker.printStatistic();
            } else if (usersInput == 4) {
                // Завершение метода
                System.out.println("Работа приложения завершена");
                return;
            } else {
                // Ошибка ввода
                System.out.println("Введите значение от 1 до 4");
            }
        }
    }
    public static void printMenu() {
        System.out.println("\n       ---------- Счётчик калорий ----------\n");
        System.out.println("[1] - Ввести количество шагов за выбранный день");
        System.out.println("[2] - Изменить цель по количеству шагов за день");
        System.out.println("[3] - Показать статистику за выбранный месяц");
        System.out.println("[4] - Выход");
        System.out.println("\nВведи команду: ");
    }
}