public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    static int studentCount = 0;
    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        studentCount++;
        id = studentCount;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static int getStudentCount() {
        return studentCount;
    }
    public boolean equals(Student other){
        return (other.getFirstName().equals(firstName) && other.getLastName().equals(lastName) && other.getAge() == age && other.getYearLevel() == yearLevel);
    }
    public String toString(){
       return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }
}
