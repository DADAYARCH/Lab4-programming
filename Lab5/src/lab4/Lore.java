package lab4;

import java.io.IOException;

public class Lore {


    public static void main(String[] args) {
        MoneyBox moneyBox = new MoneyBox("Копилка ", "стояла на книжной полке ");
        Karl karl = new Karl("Карлосон "," с надеждой посмотрел на малыша ", " помогал ему с усердием ",
                "ликовал по поводу каждой монеты ", "радовался при виде  ");
        Maloy maloy = new Maloy(" Малыш ","стоял совершенно растерянный ", " не знал где он сможет достать всё чего хочет ",
                "очень захотел стать матерью для "," сбегал на кухню за ножом ", " начал доставать ", "придется опустошить свою ");
        MoneyBox.Coins coins = new MoneyBox.Coins(" Монетки ", " выкатывались ", " попадались ", 100);
        if(coins.getPar(coins.x) != 100) {
            try {
                throw new IOException();
            } catch (IOException e){
                System.out.println("вы мне подсчеты сбили, поставьте соточку обратно)");
            }
        }        //CHECKED EXCEPTION(COMPILE TIME EXCEPTION)

        Maloy maloyy = new Maloy("","","","","","",""){
            @Override
            public String getMove1() {
                return "a это значило, что ";
            }
        };    // АНОНИМНЫЙ КЛАСС


        Action(karl,maloy,coins,moneyBox,maloyy);
    }
    public static void create(String name){
        System.out.println(name + "создан");
    }

    static void Action(Karl karl, Maloy maloy, MoneyBox.Coins coins, MoneyBox moneyBox, Maloy maloyy) {
        create(karl.getName());
        create(maloy.getMalysh());
        create(coins.getName());
        create(MoneyBox.getName());
        System.out.println("");

        System.out.println(karl.getName() + karl.getMove1() + "но " + maloy.getMalysh() +
        maloy.getMove1() + maloy.getMove2() + "\n" + karl.getName() + maloy.getMalysh()
        + maloy.getMove3() + karl.getName() + maloyy.getMove1() + maloy.getMove6() + MoneyBox.getName() + "\n"
        + moneyBox.getName() + moneyBox.getMove1() + maloy.getMalysh() + maloy.getMove4() + "и" +
        maloy.getMove5() +  coins.getPar5(100) + coins.getName() + karl.getName() + karl.getMove2() +
        "\n" + karl.getMove3()+".   "  + coins.getMove1() + coins.getName() +  coins.getPar10(100) + " и " + coins.getPar25(100)
        + " но "+ karl.getName()+karl.getMove3()+coins.getPar5(100)+coins.getName());


    }
}
