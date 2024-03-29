import java.util.List;

public class School {

    private  List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {

        this.teachers = teachers;
        this.students = students;

        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    public List<Teacher> getTeachers() {

        return teachers;
    }

    public void addTeachers(Teacher teachers) {

        teachers.add(teachers);

    }

    public List<Student> getStudents() {

        return students;
    }

    public void addStudents(Student students) {
        students.add(students);


    }

    public int getTotalMoneyEarned() {

        return totalMoneyEarned;
    }


    public static void updateTotalMoneyEarned(int moneyEarned) {

        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned=totalMoneyEarned-moneySpent;
        totalMoneyEarned-=moneySpent;


    }
}
