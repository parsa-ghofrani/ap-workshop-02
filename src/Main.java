public class Main {
    public static void main(String[] args)
    {
        Lab myLab = new Lab("hosseini","shanbe",20);
        Student std1 = new Student("Parsa","Ghofrani","40131028",19.02,19);
        myLab.enrollStudent(std1);
        Student std2 = new Student("hadi","setak","40131019",18.87,19);
        myLab.enrollStudent(std2);
        myLab.printLabInfo();
    }
}