import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
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
private String escolha = "";
    public Logic() {
        entrada = new Scanner(System.in);
        pares = new ArrayList<>();
        impares = new ArrayList<>();
    }

    public void run() {
        while (!escolha.equalsIgnoreCase("sair")) {


            menu();
            var option = entrada.nextInt();
            switch (option) {
                case  1:

                parOuImparPositivo();
                break;
                case  2:
                converterSegundos();
                break;
                default:
                    System.out.println("opção inválida, tente outra vez.");
                    break;
            }
            System.out.println("você deseja sair, s/n?");
            String resposta = entrada.next();
            if (resposta.equalsIgnoreCase("s")){
                setEscolha("sair");
           break;
            }
        }
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
private  void converterSegundos(){
    System.out.printf("informe o número a ser convertido em data e hora:");
    Long numero = entrada.nextLong();
    LocalDateTime dataHoraUTC = LocalDateTime.ofEpochSecond(numero, 0, ZoneOffset.UTC);
    System.out.println("a data informada em formato UTC é: " + dataHoraUTC);
}
private void menu(){
    System.out.println("eescolha uma opção:");
    System.out.println("1, saber se o número positivo é par ou ímpar");
    System.out.println("2, converter um número inteiro em data e hora ");
}

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

}