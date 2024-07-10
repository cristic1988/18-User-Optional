package app;

public class App {

    public static void main(String[] args) {

        HandleData handler = new HandleData();

        System.out.println(handler.findUserById());
        System.out.println(handler.findUserByEmail());
        System.out.println(handler.findAllUsers());

    }
}