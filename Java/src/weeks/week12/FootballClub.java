package weeks.week12;

public class FootballClub {
    private String clubName;
    private double ticketFee;
    private long balance;
    private String nameOFStadium;
    private int capacityOfStadium;
    private Player[] team;

    public FootballClub() {
        this(40_000_000, "default", 0, "default stadium", 0, new Player[25]);
    }

    public FootballClub(long balance, String clubName, double ticketFee, String nameOFStadium, int capacityOfStadium) {
        this(40_000_000, "default", 0, "default stadium", 0, new Player[25]);
    }

    public FootballClub(String clubName, String nameOFStadium) {
        this(0, clubName, 0, nameOFStadium, 0, new Player[25]);
    }

    FootballClub(long balance, String clubName, double ticketFee, String nameOFStadium, int capacityOfStadium, Player[] players) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.nameOFStadium = nameOFStadium;
        this.capacityOfStadium = capacityOfStadium;
        this.team = players;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public double getTicketFee() {
        return ticketFee;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public String getNameOFStadium() {
        return nameOFStadium;
    }

    public void setNameOFStadium(String nameOFStadium) {
        this.nameOFStadium = nameOFStadium;
    }

    public int getCapacityOfStadium() {
        return capacityOfStadium;
    }

    public void setCapacityOfStadium(int capacityOfStadium) {
        this.capacityOfStadium = capacityOfStadium;
    }

    public Player[] getTeam() {
        return team;
    }

    public void setTeam(Player[] team) {
        this.team = team;
    }

    public void sellTicket(int soldTicketNumber){
        soldTicketNumber = soldTicketNumber > this.capacityOfStadium ? this.capacityOfStadium : soldTicketNumber;
        this.balance += (int) (soldTicketNumber * this.ticketFee);
    }

    public void sellPlayer(Player p){
        if(doPlayerExistInMyTeam(p)){
            this.balance = this.balance + p.getFee();
            removePlayer(p);
            System.out.println("You sold " + p.getName().toUpperCase());
            printBalance();
        }else{
            System.out.println(p.getName() + " does not exist in this team.");
        }
    }
    public void buyPlayer(Player p){
        if(doWeHaveEnoughSpaceForNewPlayer()){
            if(this.balance < p.getFee()){
                System.out.println("Balance is only " + this.balance);
                System.out.println(p.getName() + " costs " + p.getFee());
                System.out.println("TOO BROKE!!! YOU CAN'T BUY");
                return;
            }
            this.balance = this.balance - p.getFee();
            System.out.println("You bought " + p.getName().toUpperCase());
            addPlayer(p);
            printBalance();
        }else{
            System.out.println("Your team is full. You can't buy a new player");
        }
    }
    private boolean doWeHaveEnoughSpaceForNewPlayer() {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                return true;
            }
        }
        return false;
    }
    private void addPlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                team[i] = p;
                break;
            }
        }
    }
    private boolean doPlayerExistInMyTeam(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer == null){
                continue;
            }
            if(myPlayer.getName().equals(p.getName())){
                return true;
            }
        }
        return false;
    }
    private void removePlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if(myPlayer.getName().equals(p.getName())){
                team[i] = null;
                break;
            }
        }
    }
    private void printBalance() {
        System.out.println("BALANCE :" + this.balance);
        System.out.println("--------");
    }
}
