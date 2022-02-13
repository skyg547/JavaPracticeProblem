package Chapter13;


// 제네릭 이전 박스 클래스
//public class Box {
//
//    private Object object;
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//
//    public Object get() {
//        return object;
//    }
//
//
//}

public class Box<T> {

    private T t ;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}


/* 다음과 같이 재구성 된다
*  public class Box<String> {
*       private String t;
*       public void set(String t ) { this.t  = t ;}
*       public String get() {return t; }
* }
*
*
* */