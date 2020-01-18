package KalkTest;

import KalkTest.sources.OutForUser;
import KalkTest.sources.UserStringInput;
import KalkTest.sources.sortirovka.Sort;
import KalkTest.sources.operacion.*;


public class Run {

    public void start(){
        String userInput; //пользовательское значение
        String [] userData; //массив значений
        int arifZnack; //ариф знак в значении


        //ввод пользовательского значения
        System.out.println("Введите значение на обработку");
        UserStringInput usString = new UserStringInput();
        usString.setUserInput();
        userInput=usString.getUserInput(); //присвоить значение userInput

        //сортировка значения
        Sort sort = new Sort();
        sort.startSort(userInput);

        //получение ариф знак
        arifZnack=sort.getArifZnak();
        //получение обработанного массива
        userData=sort.getUserData();

        //начало операций над значениями

        String otvetOperation="";

        //прибавление строк
        if(arifZnack==1){
            Plus plus = new Plus();
            plus.pribavlenie(userData);
            otvetOperation=plus.getPribavlenie();
        }

        //отнимание строк
        if(arifZnack==2){
            otvetOperation=Minus.otnimanie(userData);
        }

        //умножение строки
        if(arifZnack==3){
            otvetOperation=Umnojenie.umnoj(userData);
        }

        //деление строки
        if(arifZnack==4){
            otvetOperation=(Delenie.delen(userData));
        }
        //конец математических операций

        //вывод ответа операций над значением
        OutForUser.LineOut(otvetOperation);
    }

}
