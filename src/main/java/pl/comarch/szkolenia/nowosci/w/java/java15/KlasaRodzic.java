package pl.comarch.szkolenia.nowosci.w.java.java15;

public sealed class KlasaRodzic permits KlasaDziecko1, KlasaDziecko2 {
    int a;
    int b;

    public void cos() {
        System.out.println("cos");
    }
}
