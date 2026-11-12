package edu.mu.mvc.registration;

public class Main {

    public static void main(String[] args) {

        UserModel model =
                new UserModel();

        UserView view =
                new UserView();

        new RegistrationController(
                model,
                view);
    }
}