package weeks.week12;

public class Player {
    private String name;
    private long fee;

    public Player(){
        this("default",0);
    }
    public Player(String name, long fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }
}
