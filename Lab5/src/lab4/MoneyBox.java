package lab4;

public class MoneyBox {
    static String name;
    String move1;


    public void setName(String name) {
        MoneyBox.name = name;
    }
    public static String getName() {
        return "объект " + name;
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }
    public String getMove1() {
        return "выполнил " + move1;
    }

    public MoneyBox(String name, String move1){
        setMove1(move1);
        setName(name);
    }

     static class Coins {
        String name, move1, move2;
        int x;

        public void setPar(int x){
            this.x = x;
        }
        public String getPar5(int x){
            return x/20 + "-тиэровые " ;
        }

         public String getPar25(int x){
             return x/4 + "-тиэровые " ;
         }

         public String getPar10(int x){
             return x/10 + "-тиэровые " ;
         }

         public int getPar(int x) {
             return x;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return "объект " + name;
        }

        public void setMoves(String move1, String move2) {
            this.move1 = move1;
            this.move2 = move2;
        }

        public String getMove1() {
            return "выполнил " + move1;
        }
        public String getMove2() {
            return  move2;
        }
        public Coins(String name, String move1, String move2, int x){
            setName(name);
            setMoves(move1,move2);
            setPar(x);
        }
    }

}
