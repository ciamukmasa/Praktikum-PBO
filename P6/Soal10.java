package P6;

public class Soal10 {

    public static void main(String[] args) {
        // Object[] dapat menampung semua tipe data (autoboxing)
        Object[] data = {19, 0.2, 'C', "Java", true};

        for (Object o : data) {
            System.out.println(o + "  -> tipe: " + o.getClass().getSimpleName());
        }
    }
}