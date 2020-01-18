package KalkTest.sources.operacion;
import KalkTest.sources.operacion.UdalenieKavichek;

public class Plus {
    private String lineReturn;
    public void pribavlenie(String[]userData){
        lineReturn = (UdalenieKavichek.deleteKavhc(userData[0].toString())
                +UdalenieKavichek.deleteKavhc(userData[1].toString()));
    }
    public String getPribavlenie(){
        return lineReturn;
    }
}
