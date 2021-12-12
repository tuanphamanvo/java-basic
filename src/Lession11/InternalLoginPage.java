package Lession11;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String userNameSelector() {
        return "Internal Login Page | username";
    }

    @Override
    protected String passWordSelector() {
        return "Internal Login Page | password";
    }

    @Override
    protected String loginBtnSelector() {
        return "Internal Login Page | loginBtn";
    }
}
