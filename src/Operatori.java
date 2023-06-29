/* Operatori:
-aritmetici: +, -, /, *, %
-de comparare: <>, ==, !=, >=, <=
-logici: &&, ||, !
* */
public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b ;  // facem o suprascriere
        System.out.println(a != b); // 5 diferit de 5? => false
        System.out.println(a == b); // 5 egal cu 5? => true
        System.out.println(7>b && 8>5); // 7>5 si 8>5? true
        System.out.println(7>b || 3>5); // 7>5 sau 3>5? true
        System.out.println(7>b && (8>b || 3>b)); // true && true => true
        System.out.println(7>b && (2>b || 3>b)); // true && false => false
        System.out.println(7>b || (2>b || 3>b)); // true || false => true
        System.out.println(!(7>b)); // ! true => false





    }
}
