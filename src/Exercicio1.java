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

        System.out.printf("Remessa gerada: 1 cujo valor é R$ " +df.format(valores[0])+ ", 2 cujo valor é R$ " +df.format(valores[1])+ ", 3 cujo valor é R$ " +df.format(valores[2])+ ",\n4 cujo valor é R$ " +df.format(valores[3])+ " e 5 cujo valor é R$ " +df.format(valores[4])+ ". Total = " +df.format(soma)+".");
    }
}