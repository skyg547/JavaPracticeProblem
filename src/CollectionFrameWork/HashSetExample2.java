package CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member( "John",1));
        set.add(new Member( "John",1));
        set.add(new Member( "John3",2));

        System.out.println(set.size());
    }
}
