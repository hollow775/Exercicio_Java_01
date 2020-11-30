import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //criando o objeto scan e as variaveis necessarias
	    Scanner scan = new Scanner(System.in);
	    int num[] = new int[15];
        String par = "";
        String impar = "";
        String num_max = "";
        String num_min = "";
        int aux = 0;
        int soma = 0;
        int produto = 1;
        //primeiro for que irá recolher os 15 numeros
        System.out.println("Digite 15 números.");
	    for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(scan.nextLine());
        }
	    //segundo for que irá colocar o vetor em ordem crescente
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                if (num[i] < num[j])
                {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        //terceiro for para imprimir o vetor em ordem crescente
        for(int i = 0; i< num.length; i++){
            num_max += ","+num[i]+", ";
        }
        //quarto for para imprimir os números pares e sua soma e, também, os números impares e seu produto.
	    for(int i = 0; i < num.length; i++){
	        if(num[i]%2==0){
	            par += "," + num[i] + ", ";
                soma += num[i];
            }else if(num[i]%2!=0){
                impar += "," + num[i] + ", ";
                produto *= num[i];
            }
	    }
	    //quinto for para colocar o vetor em ordem decrescente
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                if (num[i] > num[j])
                {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        //sexto e ultimo for para imprimir o vetor em ordem decrescente
        for(int i = 0; i< num.length; i++){
            num_min += ","+num[i]+", ";
        }
	    System.out.println("Crescente: "+num_max+"\n"+"Decrescente: "+num_min+"\n"+"Pares: "+par+"\nSoma dos pares: "+soma+"\nImpares: "
        +impar+"\nProduto dos impares: "+produto);
    }
}

