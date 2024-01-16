// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in you

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     Teacher liizy  = new Teacher(1,"lizzy",50000);
     Teacher Ali  = new Teacher(2,"Ali",55000);
     Teacher john  = new Teacher(3,"john",50000);

     List<Teacher> TeacherList = new ArrayList<>();
     TeacherList.add(liizy);
     TeacherList.add(Ali);
     TeacherList.add(john);

     Student  tamasha = new Student(1,"tamasha",10);
     Student  yusuf = new Student(1,"yusuf",11);
     Student  kevo = new Student(1,"kevo",10);
     List<Student> StudentList = new ArrayList<>();
     StudentList.add(tamasha);
     StudentList.add(yusuf);
     StudentList.add(kevo);


     School ghs = new School(TeacherList,StudentList);
     tamasha.updateFeesPaid(5000);
     yusuf.updateFeesPaid(6000);
     System.out.println("GHS has earned$ "+ghs.getTotalMoneyEarned());

        System.out.println("----making GHS Salary ");
        liizy.receiveSalary(liizy.getSalary());
        System.out.println("GHS has spent for salary to " + liizy.getName()+"and now has"+ghs.getTotalMoneyEarned());

        john.receiveSalary(john.getSalary());
        System.out.println("GHS has spent for salary to " + yusuf.getName()+"and now has"+ghs.getTotalMoneyEarned());

    }
}

