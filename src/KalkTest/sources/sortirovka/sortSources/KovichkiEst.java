package KalkTest.sources.sortirovka.sortSources;
import KalkTest.sources.sortirovka.sortSources.ToInteger;

public class KovichkiEst {
    public static void sortKovichki(String line){
        int chislovoe = ToInteger.toInt(line); //пытаемся перевести в int
        if(chislovoe==0){ //если перевод в число не ок, то проверяем строку на ковычки
            char pervayKovichka = line.charAt(0);
            char vtotayKovichka = line.charAt(line.length()-1);
            if( '\"' != (pervayKovichka & vtotayKovichka)) throw new IllegalArgumentException("строка " +
                    "приведенна без ковычек");
        }
    }
}
