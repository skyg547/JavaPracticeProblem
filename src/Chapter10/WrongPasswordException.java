package Chapter10;

import java.sql.SQLOutput;

public class WrongPasswordException extends  Exception{

    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super(message);

    }
}
