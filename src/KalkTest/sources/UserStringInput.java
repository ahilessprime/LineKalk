package KalkTest.sources;

import java.util.Scanner;

public class UserStringInput {
    private String userInput;

    public void setUserInput(){
        Scanner scan = new Scanner(System.in);
        userInput=scan.nextLine();
    }

    public String getUserInput(){
        return userInput;
    }

}
