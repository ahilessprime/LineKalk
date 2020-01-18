package KalkTest.sources.sortirovka.sortSources;

public class ToInteger {
    private static int n;

    public static int toInt(String lineToInt) {
        if(lineToInt.contains("\"")){
        return  n; }//если содержит ковычки пусть сразу возвр. что строка
        //почему то иногда условия с ковычкой игнорируются когда внутри цифры, шанс на перехват + 2х
        if(lineToInt.contains("\"")){
            return  n; }
        if(lineToInt.contains("\"")){
            return  n; }


        try {
            n = Integer.parseInt(lineToInt);
        } catch (NumberFormatException e) {}
        return n; }
}
