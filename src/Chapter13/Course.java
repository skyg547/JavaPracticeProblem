package Chapter13;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) new Object[capacity]; // 타입파라미터로 배열을 생성하려면 new T[N]을 사용할수 없고 (T[]) (new Object[n]로 해야함))
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    public void addStudent(T student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    // 배열이 비어있는 부분을 찾아서 수강생을 추가하는 메소드다
}
