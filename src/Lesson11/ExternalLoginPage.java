package Lesson11;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String userNameSelector() {
        return "External Login Page | username";
    }

    @Override
    protected String passWordSelector() {
        return "External Login Page | password";
    }

    @Override
    protected String loginBtnSelector() {
        return "External Login Page | loginBtn";
    }
}
