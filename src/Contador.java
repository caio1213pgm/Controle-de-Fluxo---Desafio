import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o parâmetro 1");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o parâmetro 2");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametrosIvalidosException exception) {
            System.out.println("Erro de execução. O segundo parâmetro deve ser maior que o primeiro");
        }
    
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosIvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosIvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        System.out.printf("O número de ocorrências foi: %d ", contagem);
    }
}
