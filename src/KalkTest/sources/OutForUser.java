package KalkTest.sources;

public class OutForUser {
    public static void LineOut(String userLine){
        String userOut;
        if(userLine.length()>40){ //если символов больше 40ка
            userOut=(userLine.substring(0,39)+"...");
        }
        else userOut=userLine;
        System.out.println(userOut);
    }
}
