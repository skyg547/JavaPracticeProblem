package Stream;

public class Student implements Comparable<Student> {

    public static class Sex{
        public static final String MALE = "Male";
        public static final String FEMALE = "FeMale";
    }

    
    public static class City{
        public static final String Seoul = "서울";
        public static final String Pusan = "부산";
    }

    private String name;
    private int score;
    private String sex;
    private String city;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, String sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, String sex, String city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
