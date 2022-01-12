package lab4;
import lab3.Human;

public class Maloy extends Human {
    public String malysh;
    public String move1, move2, move3, move4, move5, move6;


    public String getMalysh() {
        return  malysh;
    }

    public void setMalysh(String malysh) {
        this.malysh = malysh;
    }

    @Override
    public String getMove1() {
        return "выполнил " + move1;
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    public String getMove2() {
        return "выполнил " + move2;
    }

    public void setMove2(String move2) {
        this.move2 = move2;
    }

    public String getMove3() {
        return "выполнил " + move3;
    }

    public void setMove3(String move3) {
        this.move3 = move3;
    }

    public String getMove4() {
        return "выполнил " + move4;
    }

    public void setMove4(String move4) {
        this.move4 = move4;
    }

    public String getMove5() {
        return "выполнил " + move5;
    }

    public void setMove5(String move5) {
        this.move5 = move5;
    }

    public String getMove6() {
        return move6;
    }

    public void setMove6(String move6) {
        this.move6 = move6;
    }



    public Maloy(String malysh, String move1, String move2, String move3, String move4,String move5, String move6){
        setMalysh(malysh);
        setMove1(move1);
        setMove2(move2);
        setMove3(move3);
        setMove4(move4);
        setMove5(move5);
        setMove6(move6);
    }
}
