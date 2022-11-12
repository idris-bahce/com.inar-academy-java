package chapters.chapter10.exercises.Exercise10_08;

public class TestTax {
    public static void main(String[] args) {
        int[][] bracketA = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        int[][] bracketB = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };

        double[] rateA = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[] rateB = {0.15, 0.275, 0.305, 0.355, 0.391};

        Tax t1 = new Tax(0, bracketA, rateA, 50000);
        Tax t2 = new Tax(0, bracketB, rateB, 50000);

        displayTable(t2, 2001);
        System.out.println();
        displayTable(t1, 2009);
    }

    public static void displayTable(Tax t, int year) {
        System.out.println("                       " + year + " Taxes" +
                "                       ");
        System.out.println("Income    Status 0     Status 1     Status 2     " +
                "Status 3");

        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%-10d", i);
            for (int j = 0; j <= 3; j++) {
                t.setFilingStatus(j);
                t.setTaxableIncome(i);
                System.out.printf("%-8.2f     ", t.getTax());
            }
            System.out.println();
        }
    }
}
