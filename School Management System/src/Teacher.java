public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public  Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned+=salary;

    }



    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {

        return salary;
    }
    public void setSalary(int salary) {

        this.salary=salary;
    }
    public static void  receiveSalary(int salary){
        salaryEarned +=salary;
        school.updateTotalMoneyespent(salary);

    public String toString(){
        return "name of the teachers: "+name+ "Total salary so far" +receiveSalary(); ;
        }
    }
}
