package chapters.chapter06.excercises06;

public class Exercise6_15 {
    public static void main(String[] args) {
        System.out.println("Taxable \t Single \t Married Joint \t Married \t Head of");
        System.out.println("Income  \t        \t or Qualifying \t Separate\t a Hause");
        System.out.println("        \t        \t Widow(er)     \t         \t        ");
        System.out.println("-------------------------------------------------------------");
        for (int i = 50000; i <=60000; i+=50) {
            System.out.printf("%5d",i);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%14.0f",computeTax(j,i));
            }
            System.out.println();
        }
    }
    public static double computeTax(int status, double taxableIncome){
        double tax = 0;
        if (status == 0) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
                return tax;
            } else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                return tax;
            } else if (taxableIncome <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                return tax;
            } else if (taxableIncome <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
                return tax;
            } else if (taxableIncome <= 372950) {
                tax = 8350 *0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
                return tax;
            }else {tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                    (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;}
            return tax;

        }else if (status == 1) {
            if (taxableIncome <= 16700) {
                tax = taxableIncome * 0.10;
                return tax;
            } else if (taxableIncome <= 67900) {
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                return tax;
            } else if (taxableIncome <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
                return tax;
            } else if (taxableIncome <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
                return tax;
            } else if (taxableIncome <= 372950) {
                tax = 16700 *0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 33950) * 0.25 + (208850 - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
                return tax;
            }else {tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                    (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;}
            return tax;
        }else if (status == 2) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
                return tax;
            } else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                return tax;
            } else if (taxableIncome <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                return tax;
            } else if (taxableIncome <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
                return tax;
            } else if (taxableIncome <= 186475) {
                tax = 8350 *0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (taxableIncome - 104425) * 0.33;
                return tax;
            }else {tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (104425 - 82250) * 0.28 +
                    (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;}
            return tax;
        }else  {
            if (taxableIncome <= 11950) {
                tax = taxableIncome * 0.10;
                return tax;
            } else if (taxableIncome <= 45500) {
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
                return tax;
            } else if (taxableIncome <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                return tax;
            } else if (taxableIncome <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
                return tax;
            } else if (taxableIncome <= 372950) {
                tax = 11950 *0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (taxableIncome - 190200) * 0.33;
                return tax;
            }else {tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                    (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
                return tax;
            }

        }

    }
}
