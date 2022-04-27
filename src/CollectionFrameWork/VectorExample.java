package CollectionFrameWork;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Board> ve = new Vector<>();

        ve.add(new Board("r", "A", "B"));
        ve.add(new Board("d", "B", "C"));
        ve.add(new Board("s", "C", "D"));
        ve.add(new Board("f3", "D", "E"));

        ve.remove(2);
        ve.remove(1);

        for (Board b : ve) {
            System.out.println(b.getContent() + " " + b.getSubject() + " " + b.getWriter());
        }
    }
}
