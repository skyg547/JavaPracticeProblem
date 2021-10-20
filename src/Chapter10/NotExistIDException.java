package Chapter10;

public class NotExistIDException extends Exception{
    public NotExistIDException(){}
    public NotExistIDException(String message){

        System.out.println("비밀번호가 존재하지 않습니다.");


    }


}
