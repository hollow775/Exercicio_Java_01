import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	//vamos usar 3 vetores para a execução do programa
	Scanner scan = new Scanner(System.in);
	String alunos[] = new String[5];
	double notas[][]= new double[5][3];
	String situation[] = new String[5];
	//primeiro for é usado para digitar o nome dos cinco alunos.
	for(int i = 0; i<5; i++){
	    System.out.println("Digite o nome dos alunos: ");
	    alunos[i] = scan.nextLine();
	}
	//segundo for, colocamos as notas dos alunos e dentro dele é colocado a nota na matriz notas[][] e a situação do
	//aluno no vetor situation[]
	//nesse for i são os alunos e J as posições das notas e média.
	for(int i = 0; i<5; i++){
	    for(int j = 0; j<3;j++){
	    	if(j<2){
				System.out.println("Digite a nota " + (j+1) + " do aluno " + alunos[i]);
				notas[i][j] = Integer.parseInt(scan.nextLine());
			}else{
	    		notas[i][j] = (notas[i][0] + notas[i][1])/2;
	    		if(notas[i][j]<7){
	                situation[i] = "RP";
                }else{
	                situation[i] = "AP";
                }
            }
	    }
	}
	//ultimo for para imprimir
	for(int i = 0; i<5; i++){
		System.out.println("Aluno: "+alunos[i]);
		for(int j = 0; j<3; j++){
			if(j<2){
				System.out.println("Nota " + (j+1) + " = " + notas[i][j]);
			}else{
				System.out.println("Média = "+notas[i][j]+"\nSituação do alunos = "+situation[i]);
				System.out.println("\n----------------------\n");
			}
		}
	}
	}
}

