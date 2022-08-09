package Stream;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    private String sex;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, String sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return Integer.compare(score, o.getScore());
    }
}
