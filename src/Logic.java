import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static java.util.Collections.sort;
import static java.util.Collections.reverse;
public class Logic {
    private Scanner entrada;
    private List<Integer> pares;
    private List<Integer> impares;

    public Logic() {
        entrada = new Scanner(System.in);
        pares = new ArrayList<>();
        impares = new ArrayList<>();
    }

    public void run() {
        parOuImparPositivo();
    }

    private void parOuImparPositivo() {
        System.out.println("informe a quantidade de números a ser inseridos:");
        var quantidade = entrada.nextInt();
        int[] quantidades = new int[quantidade];
        for (int i = 0; i < quantidades.length; i++) {
            System.out.println("insira os valores desejados");
            var valor = entrada.nextInt();
            boolean isParPositivo = (valor % 2 == 0) && (valor  > 0);
            boolean isImparPositivo = (valor % 2 == 1) && (valor > 1);
            if (isParPositivo) {
                pares.add(valor);
                sort(pares);

            } else if (isImparPositivo) {
                impares.add(valor);
               sort(impares);
               reverse(impares);
            } else
                System.out.printf("erro, só aceitamos números positivos");

        }


        for (Integer par : pares) {
            System.out.printf("números pares: %d \n", par);

        }
        for (Integer impar : impares) {
            System.out.printf("números ímpares: %d \n", impar);
        }


    }


}