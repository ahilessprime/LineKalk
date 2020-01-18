package KalkTest.sources.operacion;
import KalkTest.sources.operacion.UdalenieKavichek;

public class Minus {
    private static String lineReturn;
    public static String otnimanie(String [] userData){

        String [] cleanUserData= new String[2]; //очищение от ковычек
        cleanUserData[0]=UdalenieKavichek.deleteKavhc(userData[0]);
        cleanUserData[1]=UdalenieKavichek.deleteKavhc(userData[1]);

        //проверка на совпадение
        if(cleanUserData[0].toString().contains(cleanUserData[1].toString())){
            return lineReturn=(cleanUserData[0].toString().replace(cleanUserData[1].toString(), ""));
        }

        return lineReturn="";
    }

    public static void main(String [] ards){
        String [] test = new String[]{"\"jgvgjgg\"","\"gvg\""};
        System.out.println(Minus.otnimanie(test));
    }
}
