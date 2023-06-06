package pl.comarch.szkolenia.nowosci.w.java.java12;

public class Switch {
    public static void main(String[] args) {
        int x = 3;

        /*switch (x) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            default:
                System.out.println("cos");
                break;
        }*/

        switch (x) {
            case 1 -> System.out.println("jeden");
            case 2,3 -> System.out.println("dwa lub trzy");
            default -> System.out.println("cos");
        }

        String switchValue = switch (x) {
            case 1 -> "jeden";
            case 2 -> "dwa";
            case 3 -> "trzy";
            default -> "cos";
        };
        System.out.println(switchValue);
    }
}
