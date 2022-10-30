package weeks.week12;

public class Interview {
    public static void main(String[] args) {
        String cv = "inar Java academy java";
        String[] st = cv.split("\\s");
        int counter = 0;
        for (int i = 0; i < st.length; i++) {
            if (st[i].equalsIgnoreCase("java")){
                counter++;
            }
        }
        System.out.println("There are " + counter + " times java.");
    }
}
