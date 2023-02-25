public class Lab
{
    //fields
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    //constructor
    public Lab(String teacherName, String dayOfWeek, int maxSize)
    {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
        this.currentSize = 0;
    }

    //methods
    public void calAvg()
    {
        double res = 0;
        int counter = currentSize;
        for (int i = 0; i < currentSize; i++)
        {
            res += students[i].getGrade();
        }
        this.avgGrade = (res/counter);

    }
    public void enrollStudent(Student std)
    {
        int len = 0;
        for (int i = 0; i < currentSize; i++,len++);
        students[len] = std;
        this.currentSize++;
        calAvg();
    }
    public void printArr()
    {
        System.out.println("current size : " + currentSize);
        System.out.println("student len : " + students.length);
        System.out.println("avgGrade : " + avgGrade);
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void printLabInfo()
    {
        System.out.println("TeacherName : " + teacherName);
        System.out.println("Day Of Week : " + dayOfWeek);
        System.out.println("Average Grade : " + avgGrade);
        System.out.println("the list of students is :");
        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo();
        }
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}