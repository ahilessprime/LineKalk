package KalkTest.sources.sortirovka.sortSources;
import KalkTest.sources.sortirovka.sortSources.*;
public class ErrorDelSringNaString {
    public static void DelStringNaString(String [] userData){
        if(0==ToInteger.toInt(userData[1])) throw new IllegalArgumentException("деление строки на строку");
    }
}
