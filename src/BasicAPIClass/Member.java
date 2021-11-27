package BasicAPIClass;

import java.text.MessageFormat;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;


    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} : {1}", id, name);
    }
}
