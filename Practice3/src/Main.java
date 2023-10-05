public class Main {
    public static void main(String[] args) {
        Integer x=45;
        System.out.println(Math.max(10,30));
        System.out.println(Math.min(4,34));
        System.out.println(x.compareTo(3)); // x 3 den büyükse çıktı 1 dir
        System.out.println(x.compareTo(45)); // x 45 e eşit ise çıktı 0
        System.out.println(x.compareTo(56)); // 56  x den büyükse  çıktı -1
        System.out.println(Math.random()); // 0 ile 1 arası sayı üretir
        Integer y=7;
        System.out.println(y.toString()); // Stringe çevirir
        System.out.println(y.byteValue()); // byte çevirir
        System.out.println(y.doubleValue()); // double çevirir
        System.out.println(y.longValue()); // long çevirir
        

      //  System.out.println("Hello world!");
    }
}