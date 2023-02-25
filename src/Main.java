public class Main {
    public static void main(String[] args)
    {
        Student std1 = new Student("Parsa","Ghofrani","40131028",19.03,19);
        Student std2 = new Student("Hadi","Setak","40131019",18.87,19);

        std1.setGrade(19.34);
        std2.setGrade(18.98);

        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab myLab = new Lab("hosseini","shanbe",20);
        myLab.enrollStudent(std1);
        myLab.enrollStudent(std2);
    }
}