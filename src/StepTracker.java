import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        MonthData monthData = new MonthData();

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца:");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Вы выбрали месяц: " + monthNumber);
        } else {
            System.out.println("Повторите ввод номера месяца");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber >= 1 && dayNumber <= 30) {
            System.out.println("Вы выбрали день: " + dayNumber);
        } else {
            System.out.println("Повторите ввод дня");
            return;
        }

        System.out.println("Введите количество шагов");
        int stepNumber = scanner.nextInt();
        if (stepNumber > 0) {
            stepNumber = stepNumber;
            System.out.println("Ваши шаги: " + stepNumber);
        } else {
            System.out.println("Повторите ввод количества шагов");
            return;
        }

        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[dayNumber - 1] = stepNumber;
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель");
        int newGoalOfSteps = scanner.nextInt();
        if (newGoalOfSteps > 0) {
            goalByStepsPerDay = newGoalOfSteps;
        } else {
            System.out.println("Введите значение больше 0");
        }
    }

    void printStatistic() {
        MonthData monthData;
        Converter converter = new Converter();
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Вы выбрали месяц: " + monthNumber);
        } else {
            System.out.println("Введите число от 1 до 12");
            return;
        }

        monthData = monthToData[monthNumber - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц = " + monthData.sumStepsFromMonth());
        System.out.println("Всего пройдено за месяц = " + monthData.maxSteps());
        System.out.println("В среднем за месяц вы проходите = " + (sumSteps / 30));
        System.out.println("Дистанция за месяц = " + converter.convertToKm(sumSteps) + " км");
        System.out.println("Вы сожгли за месяц = " + converter.convertStepsToKilocalories(sumSteps) + " килокалорий");
        System.out.println("Лучшая серия = " + monthData.bestSeries(goalByStepsPerDay));
    }
}