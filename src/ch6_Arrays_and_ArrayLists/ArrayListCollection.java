package ch6_Arrays_and_ArrayLists;

import java.util.ArrayList;

/**
 * {@code ArrayListCollection} sınıfı, ArrayList kullanarak bir liste üzerinde işlem yapmanın örneklerini sunar.
 */
public class ArrayListCollection {
    public static void main(String[] args) {
        // 10 başlangıç kapasitesine sahip yeni bir String ArrayList oluştur
        ArrayList<String> items = new ArrayList<String>();
        items.add("red"); // listede bir öğe ekle
        items.add(0, "yellow"); // "yellow"ı 0. indekse ekle

        // başlık
        System.out.print(
                "Counter kontrollü döngü ile liste içeriğini görüntüle:");

        // listedeki renkleri görüntüle
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }

        // enhanced for kullanarak renkleri görüntüleme
        display(items,
                "%nEnhanced for döngüsü ile liste içeriğini görüntüle:");

        items.add("green"); // listeye "green" ekle
        items.add("yellow"); // listeye "yellow" ekle
        display(items, "İki yeni eleman eklenmiş liste:");

        items.remove("yellow"); // ilk "yellow" öğesini kaldır
        display(items, "İlk sarı öğe kaldırıldı:");

        items.remove(1); // 1. indeksteki öğeyi kaldır
        display(items, "İkinci liste elemanı (green) kaldırıldı:");

        // Bir değerin listede olup olmadığını kontrol et
        System.out.printf("\"red\" listede %s%n",
                items.contains("red") ? "var" : "yok");

        // Listenin boyutunu görüntüle
        System.out.printf("Boyut: %s%n", items.size());
    }

    // ArrayList'in öğelerini konsol üzerinde görüntüle
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // başlığı görüntüle

        for (String item : items)
        // items içindeki her öğeyi görüntüle
        {
            System.out.printf(" %s", item);
        }

        System.out.println();
    }
}
