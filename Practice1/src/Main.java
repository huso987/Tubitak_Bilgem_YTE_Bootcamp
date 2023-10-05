public class Main {
    public static void main(String[] args) {

        // Boxing: int ilkel veri türünü Integer nesnesine dönüştürme
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        System.out.println("Wrrappe:"+wrappedInt);
        // Unboxing: Integer nesnesini int ilkel veri türüne dönüştürme
        Integer wrappedInt = Integer.valueOf(42);
        int primitiveInt = wrappedInt.intValue();
        System.out.println("Primitive:"+primitiveInt);



      //  System.out.println("Hello world!");
    }
}