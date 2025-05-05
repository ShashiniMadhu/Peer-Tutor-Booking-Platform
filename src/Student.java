public class Student extends User{
    private final int graduationYear;

    public Student(String name, int graduationYear) {
        super(name);
        this.graduationYear = graduationYear;
    }

    @Override
    public String getUserRole(){
        return "Student";
    }

    public int getGraduationYear(){
        return graduationYear;
    }

    @Override
    public String toString(){
        return getUserRole() + "[ID=" + getId() + ", Name=" + getName() + ", Graduation Year=" + graduationYear + "]";
    }

}
