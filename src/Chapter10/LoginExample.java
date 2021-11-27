package Chapter10;

public class LoginExample {


    public static void main(String[] args) {
        try {
            login("White", "12345");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            login("blue", "432345");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static void login(String id, String password) throws Exception {


        // id가 "blue가" 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {

            throw new NotExistIDException("아이디가 존재하지 않습니다");

        }

        //parssword 가 "12345" 가 아니라면 WrongPasswordException 발생 시킴
        if (!password.equals("12345")) {
                throw new WrongPasswordException("비밀번호가 틀립니다.");

        }

    }

}

