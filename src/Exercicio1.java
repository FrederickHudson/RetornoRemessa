import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;

public class Exercicio1 {
    public static void main(String[] args) {

        Double[] valores = new Double[]{88.00, 130.00, 54.90, 293.30, 44.80};
        DecimalFormat df = new DecimalFormat("#.00");
        double soma = 0;


        List lista = Arrays.asList(valores);

        for (int j = 0; j < lista.size(); j++) {
            soma += valores[j];
        }

        System.out.printf("Remessa gerada: ");

        for (int k=0; k < lista.size(); k++) {
            System.out.printf(k+1 + " cujo valor é R$ " + df.format(valores[k]));
            if (k == lista.size()-1)
                break;
            if (k < lista.size()-2) {
                System.out.printf(", ");
            } else {
                System.out.printf(" e ");
            }
        }
        System.out.printf(". Total = " + df.format(soma) + ".");
    }
}