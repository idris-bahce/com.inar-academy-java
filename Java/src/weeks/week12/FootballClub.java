package weeks.week12;

public class FootballClub {
    private double balance;
    private String clubName;
    private double ticketFee;
    private String nameOFStadium;
    private int capacityOfStadium;

    FootballClub(){
        this(40_000_000,"",0,"",0);
    }
    FootballClub(double balance,String clubName,double ticketFee,String nameOFStadium,int capacityOfStadium){
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.nameOFStadium = nameOFStadium;
        this.capacityOfStadium = capacityOfStadium;
    }
    public double sellTicket(int amountOfTickets){
        balance += amountOfTickets * ticketFee;
        return balance;
    }
    public double sellPlayer(int numberOfPlayerWhoAreSold, double priceOfPlayers){
        balance += numberOfPlayerWhoAreSold * priceOfPlayers;
        return balance;
    }
    public double buyPlayer(int numberOfPlayerWhoAreBought, double priceOfThePlayers){
        balance -= numberOfPlayerWhoAreBought * priceOfThePlayers;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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
}
