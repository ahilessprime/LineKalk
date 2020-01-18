package KalkTest.sources.operacion;
import KalkTest.sources.sortirovka.sortSources.ToInteger;

public class UdalenieKavichek {
    public static String deleteKavhc(String line){
        String outLine;
        if(!line.contains("\"")) {
            outLine = line;
        }
        else {outLine = line.substring(1, line.length() - 1);}
        return outLine;
    }
}
