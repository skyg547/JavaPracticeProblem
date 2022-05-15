package Chapter14;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

    public static void main(String[] args) {

        TreeMap<Integer, String> score = new TreeMap<Integer, String>();
        score.put(new Integer(18), "길동");
        score.put(new Integer(30), "g하이");
        score.put(new Integer(340), "gf하이");
        score.put(new Integer(310), "g하fd이");
        score.put(new Integer(3320), "g하e2e2이");
        score.put(new Integer(350), "g하r이");
        score.put(new Integer(20), "g하gg이");

        Map.Entry<Integer,String> entry = null;

        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 " + entry.getKey() + "-" + entry.getValue());

        entry = score.lastEntry();
        System.out.println("가장 높은 점수 " + entry.getKey() + "-" + entry.getValue());



    }

}
