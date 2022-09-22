package Stream;

public class reMakeStudent implements Comparable<Student> {

    public enum Sex {
        MALE, FEMALE
    }

    public enum City {
        Seoul, Pusan
    }

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public reMakeStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public reMakeStudent(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public reMakeStudent(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
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
