package KalkTest.sources.operacion;

public class Umnojenie {
    public static String umnoj(String [] userData){
        String lineRetorn;
        int mnojitel;

        String [] cleanUserData= new String[2]; //очищение от ковычек
        cleanUserData[0]=UdalenieKavichek.deleteKavhc(userData[0]);
        try{ mnojitel = Integer.parseInt(userData[1]);} //пресекаем ввод строки
        catch (NumberFormatException e){ throw new IllegalArgumentException("неверный формат");}
        cleanUserData[1]=UdalenieKavichek.deleteKavhc(userData[1]);


        lineRetorn=cleanUserData[0];
        for(int n=0; n<mnojitel; n++){
            lineRetorn=lineRetorn+cleanUserData[0];
        }

        return lineRetorn;
    }


    public static void main(String [] args){
        String [] test = new String[]{"\"jgvgjgg\"","7"};
        System.out.println(Umnojenie.umnoj(test));
    }
}
