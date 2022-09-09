public class Main {
    public static void main(String[] args) {
       // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer2Weight + boxer1Weight));
        System.out.println("Разница между весами бойков: " + (boxer2Weight - boxer1Weight));

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница между весами бойков (1 способ): " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница между весами бойков (2 способ): " + (boxer2Weight % boxer1Weight));

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployes = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании - " + totalEmployes + " человек");
        totalEmployes = totalEmployes + 94;
        System.out.println("Если в компаниии работает " + totalEmployes + " то всего " + (totalEmployes * hoursPerDay) + " часов работы может быть поделено между сотрудниками");

    }
}