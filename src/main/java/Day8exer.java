public class Day8exer {
    sealed interface LoginResult
            permits LoginSuccess, LoginFailure, LoginLoading {
    }

    record LoginSuccess(String time) implements LoginResult {
    }

    record LoginFailure(String reason) implements LoginResult {
    }

    record LoginLoading(String expectedTime) implements LoginResult {
    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success ->
                    System.out.println("Login Success at: " + success.time());

            case LoginFailure failure ->
                    System.out.println("Login failure because of:" +failure.reason());
            case LoginLoading loading ->
                    System.out.println("Login Loading, " + loading.expectedTime());
        }
    }

    public static void main(String[] args) {

        LoginResult loginSuccess =
                new LoginSuccess("2026-06-13 03:03:10");

        LoginResult loginFailure =
                new LoginFailure("Invalid Username or Password");

        LoginResult loginLoading =
                new LoginLoading("Check after 5 hours");

        handleLogin(loginSuccess);
        handleLogin(loginFailure);
        handleLogin(loginLoading);
    }
}
