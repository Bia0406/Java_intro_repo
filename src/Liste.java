import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elemente
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());

        // eliminam toate elementele din lista
     //   fructe.clear();

        // scoatem un element
        fructe.remove("mar");

        // aflam dimensiunea listei

        System.out.println(fructe.size());

        // listam elementele
        System.out.println(Arrays.toString(fructe.toArray()));

        if (!fructe.isEmpty()) {   // daca NU este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[] {1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add ("Rose");
        System.out.println(Arrays.toString(flowerList.toArray()));

        // aflam unde este Poppy
        int poopy_index = flowerList.indexOf("Poppy");
        // stergem ce este in acea pozitie
        flowerList.remove(poopy_index);

        // scoatem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(Arrays.toString(flowerList.toArray()));
        System.out.println(flowerList);

    }
}
