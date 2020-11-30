import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //criando as variaves, objetos e vetores que serão usados no programa
        Scanner scan = new Scanner(System.in);
        String pessoas[] = new String[5];
        boolean name = false;
        //for para escrever o nome das cinco pessoas
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome de alguém");
            pessoas[i] = scan.nextLine();
        }
        //parte para procurar o nome desejado
        System.out.println("Digite um nome para ser encontrado");
        String search = scan.nextLine();
        for(int i=0; i<5; i++){
            if(pessoas[i].equals(search)){
                System.out.println("A posição do nome é = "+i);
                name = true;
            }
        }
        if(name == false){
            System.out.println("Nome não encontrado.");
        }
    }
}
