package Grocery;

public class Player {
    private String name;
    private String type;
    public Player(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
