// 1  - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class medidas {
    // 3.1 - Atributos - Caracteristicas


    // 3.2 - Metodos de Funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do java para ler a escolha do usuario no console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" M E N U    D E    O P Ç O E S");
        System.out.println("c - Calcula Area Modo curto ");
        System.out.println("d - Contar ate dez ");
        System.out.println("e - Calcula Area Modo extenso ");
        System.out.println("i - iF Simples: ");
        System.out.println("r - contagem regressiva de dez a zero ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Voce escolhe executar o metodo calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Voce escolhe executar o metodo contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Voce escolhe executar o metodo calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Voce escolheu executar o metodo ifSimples");
                contagemRegressiva();
                break;
            case "r":
            case "R":
                System.out.println("Voce escolheu executar o metodo contagem regressiva");
                ifSimples();
                contagemRegressiva();
                break;


            default:
                System.out.println("Voce escolhe outro valor que não tem uma ação associada");
                calcularAreaModoExtenso();
                break;


        }

    }

    public static void ifSimples() {
        //Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto() {

        System.out.println("Calculo de Areas Modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso() {

        System.out.println("Calculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void contarAteDez() {

        // Loops ou Repetições
        // for = repetição incondicional - vai repetir quantas vezes vc mandar
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);

        }
    }

    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
}








