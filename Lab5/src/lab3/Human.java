package lab3;

public abstract class Human implements InterfaceName {
    public String name;
    public String move1, move2, move3, move4, move5, move6;

    public String getMove1(){
        return move1;
    }

//    public void setMove(String move1){
//        this.move1 = move1;
//    }
//
//    public void setMove(String move1, String move2, String move3){
//        this.move1 = move1;
//        this.move2 = move2;
//        this.move3 = move3;
//    }

    public void setMove(String move1, String move2, String move3, String move4, String move5, String move6){
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
        this.move5 = move5;
        this.move6 = move6;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
