package KalkTest.sources.operacion;

public class Delenie {
    public static String delen(String [] userData){
        String lineRetorn;
        int delitel;

        String [] cleanUserData= new String[2]; //очищение от ковычек
        cleanUserData[0]=UdalenieKavichek.deleteKavhc(userData[0]);
        try{ delitel = Integer.parseInt(userData[1]);} //пресекаем ввод строки
        catch (NumberFormatException e){ throw new IllegalArgumentException("неверный формат");}
        cleanUserData[1]=UdalenieKavichek.deleteKavhc(userData[1]);


        int konecIndex = userData[0].length()/delitel;


        lineRetorn=(cleanUserData[0].substring(0,konecIndex));

        return lineRetorn;
    }


    public static void main(String [] args){
        String [] test = new String[]{"\"jgvgjg\"","3"};
        System.out.println(Delenie.delen(test));
    }
}
