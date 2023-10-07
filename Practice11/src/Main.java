// Araba sınıfı
class Araba {
    // Özellikler (alanlar)
    String marka;
    String model;
    int uretimYili;

    // Yapıcı (constructor) metot
    public Araba(String marka, String model, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
    }

    // Davranışlar (metotlar)
    public void calistir() {
        System.out.println(marka + " " + model + " çalıştı!");
    }

    public void durdur() {
        System.out.println(marka + " " + model + " durdu!");
    }

    public void hizArtir(int artis) {
        System.out.println(marka + " " + model + " hızını " + artis + " km/saat artırdı.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Araba nesnesi oluşturma
        Araba araba1 = new Araba("Ford", "Focus", 2020);

        // Araba özelliklerini yazdırma
        System.out.println("Araba Markası: " + araba1.marka);
        System.out.println("Araba Modeli: " + araba1.model);
        System.out.println("Üretim Yılı: " + araba1.uretimYili);

        // Arabayı çalıştırma
        araba1.calistir();

        // Arabayı hızlandırma
        araba1.hizArtir(20);

        // Arabayı durdurma
        araba1.durdur();
    }
}
