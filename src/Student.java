public class Student
{
    //fields
    private String name;
    private String last_name;
    private String id;
    private double grade;

    private int age;

    //constructor
    public Student(String name, String last_name, String id, double grade, int age )
    {
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.last_name = last_name;
        this.id = id;
    }

    //methods
    public void printStudentInfo()
    {
        System.out.println(name +" "+last_name+"\n AGE :"+ age +"\n ID: "+ id + "\nGRADE :" + grade);
    }
    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return last_name;
    }

    public String getId()
    {
        return id;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        if(grade >= 0 && grade <= 20)
        {
            this.grade = grade;
        }
    }

    public int getAge()
    {
        return age;
    }
}
