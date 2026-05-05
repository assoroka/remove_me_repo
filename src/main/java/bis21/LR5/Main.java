package bis21.LR5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Завдання 1. Фільтрація.
        List<Student> students = Arrays.asList(
                new Student("Іван", 19),
                new Student("Аліна", 22),
                new Student("Михайло", 21)
        );
        List<Student> filtered = students.stream()
                .filter(s -> s.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println("Завдання 1: " + filtered);

        // Завдання 2. Список унікальних елементів.
        List<String> strings = Arrays.asList("Java", "Stream", "Java", "API");
        long uniqueCount = strings.stream()
                .distinct()
                .count();
        System.out.println("Завдання 2: " + uniqueCount);

        // Завдання 3. Сума квадратів чисел.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Завдання 3: " + sum);

        // Завдання 4. Перетворення на MAP
        List<Employee> employees = Arrays.asList(
                new Employee(101L, "Андрій", 25000.0),
                new Employee(102L, "Катерина", 30000.0)
        );
        Map<Long, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(e -> e.id, e -> e));
        System.out.println("Завдання 4: " + employeeMap);

        // Завдання 5. Пошук максимального елементу.
        List<StudentGrade> grades = Arrays.asList(
                new StudentGrade("Олександр", "529", 4.5),
                new StudentGrade("Дмитро", "529", 4.8),
                new StudentGrade("Софія", "529ст", 4.9),
                new StudentGrade("Ірина", "529ст", 4.2),
                new StudentGrade("Павло", "525", 5.0)
        );
        Optional<StudentGrade> best = grades.stream()
                .filter(s -> s.group.equals("529") || s.group.equals("529ст"))
                .max(Comparator.comparingDouble(s -> s.avrGrade));
        best.ifPresent(s -> System.out.println("Завдання 5: " + s.name + " (" + s.avrGrade + ")"));
    }
}
