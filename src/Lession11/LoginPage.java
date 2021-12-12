package Lession11;

public abstract class LoginPage {
    public void login() {
        System.out.println(userNameSelector());
        System.out.println(passWordSelector());
        System.out.println(loginBtnSelector());
    }

    protected abstract String userNameSelector();
    protected abstract String passWordSelector();
    protected abstract String loginBtnSelector();
}
