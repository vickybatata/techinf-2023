package ExMatrizEVetores;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

/*
05 - Fazer uma matriz 10x10 com desconto de inss, no final mostrar. 
*/

public class ex05 {
    public static void main(String[] args) {
        
     Map<Double, Double> tabelaINSS = new HashMap<>();
        tabelaINSS.put(1659.53, 8.0);
        tabelaINSS.put(2764.31, 9.0);
        tabelaINSS.put(3823.09, 11.0);
        tabelaINSS.put(5607.22, 12.0);
        tabelaINSS.put(7646.02, 13.0);
        tabelaINSS.put(10194.53, 14.0);

        // Criar matriz de salários (valores aleatórios entre 1000 e 15000)
        double[][] salarios = new double[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                salarios[i][j] = random.nextInt(15001) + 1000;
            }
        }

        // Criar matriz para armazenar descontos
        double[][] descontos = new double[10][10];

        // Calcular e armazenar descontos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double salario = salarios[i][j];
                for (Map.Entry<Double, Double> faixaINSS : tabelaINSS.entrySet()) {
                    double limiteInferior = faixaINSS.getKey();
                    double limiteSuperior = faixaINSS.getValue();
                    if (limiteInferior <= salario && salario <= limiteSuperior) {
                        double aliquota = faixaINSS.getValue() / 100;
                        descontos[i][j] = salario * aliquota;
                        break;
                    }
                }
            }
        }

        // Exibir matriz de salários
        System.out.println("Matriz de Salários:");
        imprimeMatriz(salarios);

        System.out.println("\nMatriz de Descontos:");
        imprimeMatriz(descontos);
    }

    private static void imprimeMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.printf("%6.2f ", valor);
            }
            System.out.println();
        }
    }
}

/*
Explicação:

A classe "MatrizDescontoINSS" contém o método main para executar o programa.

Um "Map" chamado "tabelaINSS" é utilizado para armazenar as faixas salariais 
e as alíquotas de INSS correspondentes.

As matrizes "salarios" e "descontos" são criadas com dimensões 10x10 para 
armazenar os valores de salário e desconto, respectivamente.

Um loop "for" aninhado percorre as linhas e colunas das matrizes.

Para cada salário, a alíquota de INSS correspondente é encontrada na "tabelaINSS".

O desconto é calculado multiplicando o salário pela alíquota e armazenado na
matriz "descontos".

O método "imprimeMatriz" é utilizado para exibir as matrizes no console 
formatadas com duas casas decimais.
*/