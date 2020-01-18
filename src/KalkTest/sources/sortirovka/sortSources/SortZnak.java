package KalkTest.sources.sortirovka.sortSources;

public class SortZnak {
    private int arifZnak;

    public int isArifZnak(String userInput){
        if (userInput.contains("+")){
            return 1;
        }
        if (userInput.contains("-")){
            return 2;
        }
        if (userInput.contains("*")){
            return 3;
        }
        if (userInput.contains("/")){
            return 4;
        }
        else return 0;
    }

    public String stringArifZnack(String userInput){
        if (userInput.contains("+")){
            return "+";
        }
        if (userInput.contains("-")){
            return "-";
        }
        if (userInput.contains("*")){
            return "*";
        }
        if (userInput.contains("/")){
            return "/";
        }
        else return null;
    }
}
