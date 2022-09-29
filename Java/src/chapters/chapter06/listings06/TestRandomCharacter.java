package chapters.chapter06.listings06;

public class TestRandomCharacter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.getRandomLowerCaseLetter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.getRandomCharacter() + " ");
        }
    }
}
