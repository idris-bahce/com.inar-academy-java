package weeks.week12;

public class TestFootballClub {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 20_000_000);
        Player ronaldo = new Player("Ronaldo", 4_000_000);
        Player maguire = new Player("Maguire", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player mbappe = new Player("Mbappe", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player veli = new Player("Veli Kavlak", 100);
        Player olcay = new Player("Olcay Sahan", 50);

        FootballClub bolvadin_spor = new FootballClub(40_000_000l, "Bolvadinspor", 10,
                "Kelbalavadin Stadium", 47856,new Player[5]);
        bolvadin_spor.buyPlayer(messi);
        bolvadin_spor.buyPlayer(mbappe);
        bolvadin_spor.buyPlayer(haaland);
        bolvadin_spor.buyPlayer(neymar);
        bolvadin_spor.buyPlayer(ronaldo);

        bolvadin_spor.sellPlayer(messi);

        bolvadin_spor.buyPlayer(olcay);
        bolvadin_spor.buyPlayer(veli);
        bolvadin_spor.buyPlayer(maguire);
        bolvadin_spor.buyPlayer(neymar);

        System.out.println(bolvadin_spor.getBalance());

    }
}
