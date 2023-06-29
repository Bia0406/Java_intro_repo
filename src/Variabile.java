public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul de date
        System.out.println("Am cumparat o masina marca : " + marcaMasina);
        System.out.println("Este modelul : " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca : " + marcaMasina);
        System.out.println("Este modelul : " + modelMasina);

        // declarare
        String nume;
        String prenume;

        // initializare
        nume = "Bad";
        prenume = "Bia";
        int varsta = 33;

        // concatenare de stringuri
        System.out.println( prenume + " " + nume + " cu varsta de " + varsta);

    }
}
