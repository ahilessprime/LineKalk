package KalkTest.sources.sortirovka.sortSources;
import KalkTest.sources.sortirovka.sortSources.ToInteger;

public class KolvoSim {
    public static void sortKolvo(String LineToSort){
        int chislovoe = ToInteger.toInt(LineToSort); //пытаемся перевести в int
        if(chislovoe!=0){ //если перевод в инт ок, то проверяем число
            if(chislovoe>10)throw new IllegalArgumentException("числовое значение велико");
        }
        if(chislovoe==0){ //если перевод в число не ок, то проверяем строку
            if(LineToSort.length()>10) throw new IllegalArgumentException("строка велика");
        }
    }
}
