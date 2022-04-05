package BasicAPIClass;

public class Student {

    private String studentNum;

    public Student(String studentNUm) {
        this.studentNum = studentNUm;
    }

    public String getSudentNum() {
        return studentNum;
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
        if(studentNum.equals(student.getSudentNum()))
            return true;
        }
        return false;
    }
}
