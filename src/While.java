public class While {
    public static void main(String[] args) {
        // while -loop , ciclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        // problema: masina merge cat timp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {  // 10
            // acceleram
            System.out.println("Vruum Vruum!");
            // scadem benzina
            litri_benzina = litri_benzina -1;  // 9
            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <= 3){
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
