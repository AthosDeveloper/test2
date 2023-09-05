import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static java.util.Collections.sort;
import static java.util.Collections.reverse;
public class Logic {
    private Scanner entrada;
    private List<Integer> impar;
    private List<Integer> par;
    public Logic(){
        entrada = new Scanner(System.in);
        impar = new ArrayList<>();
par= new ArrayList<>();
    }
    public void run (){
imparOuParPositivo();
    }
    private void imparOuParPositivo(){
        System.out.println("informe 10 números ");
        for (int i = 0; i <= 10; i ++){

        var numeros = entrada.nextInt();
        if ( numeros%2 == 0&& numeros > 0) {
            par.add(numeros);
        } else {
            impar.add(numeros);
        }
        sort(par);
        reverse(impar);
            for (Integer numero: par){
                System.out.println(numero);
            }
            for (Integer impares: impar){
                System.out.println(impares);
            }

            }

    }
   // private  void conversaoData(){
        //System.out.println("informe um número");
       // Integer numero = entrada.nextInt();
        //SimpleDateFormat original = new SimpleDateFormat("yyyyMMdd");
        //Date date = original.parse  (numero.toString());
    }

}
