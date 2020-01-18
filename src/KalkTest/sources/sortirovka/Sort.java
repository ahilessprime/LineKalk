package KalkTest.sources.sortirovka;

import KalkTest.sources.sortirovka.sortSources.*;

public class Sort {
    private String [] userData;
    private int arifZnak;
    private String arifZnakString;



    public void startSort(String userInput){

        //проверка на арифметический знак
        SortZnak sortZnak = new SortZnak();
        arifZnak=sortZnak.isArifZnak(userInput);
        if(arifZnak==0) throw new IllegalArgumentException("нет арифм. знака");
        arifZnakString=sortZnak.stringArifZnack(userInput);

        //разделение на массив
        BirthUserData birthUserData = new BirthUserData();
        birthUserData.setUserData(userInput,arifZnakString);
        userData=birthUserData.getUserDataString();


        //проверка значений на соответствие условий

        //первое значение не целое?
        if(0!=ToInteger.toInt(userData[0])) throw new IllegalArgumentException("первое значение" +
                " целочисленное!");
        //допустимоели количество символов?
        for(String line:userData){
            KolvoSim.sortKolvo(line);
        }
        //есть ли ковычки у строки?
        for(String line:userData){
            KovichkiEst.sortKovichki(line);
        }
        //имеется ли деление строки на строку
        if(arifZnak==4){
            ErrorDelSringNaString.DelStringNaString(userData);
        }

        //вроде как все сортировки завершенны



    }


    public int getArifZnak(){ return arifZnak; }
    public String[] getUserData(){return userData; }
}
