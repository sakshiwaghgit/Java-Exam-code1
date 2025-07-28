
    import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 88));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 92));
        students.add(new Student("David", 85));

    
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
    
