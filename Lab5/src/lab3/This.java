package lab3;

public class This {
    private final String name;

    public String looksLike(){
        return "выглядело очень смешно";
    }
    public String getName(){
        return " " + name + " ";
    }
    public String itsMatter(){return "это значило что ";}

    public String thinking(){
        return "Можно было подумать, что";
    }

    public This(String name){
        this.name = name;
    }
}
