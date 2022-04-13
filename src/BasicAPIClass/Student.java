package BasicAPIClass;

public class Student {

    private String studentNum;
    private String studentName;
    private Integer studentAge;
    private String studentSex;

    public Student() {
    }

    public Student(String studentNum, String studentName, Integer studentAge, String studentSex) {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
    @Override
    public int hashCode() {
        return Integer.parseInt(studentNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
        if(studentNum.equals(student.getStudentNum()))
            return true;
        }
        return false;
    }
}
