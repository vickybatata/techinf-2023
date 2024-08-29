
package ExMatrizEVetores;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
06 - Fazer uma matriz 10x10 com desconto de irrf, no final mostrar.
*/

public class ex06 {
    public static void main(String[] args) {
        
          // Tabela de deduções do IRRF (faixas de renda e deduções correspondentes)
        Map<Double, Double> tabelaDeducoesIRRF = new HashMap<>();
        tabelaDeducoesIRRF.put(2200.00, 0.00);
        tabelaDeducoesIRRF.put(2500.00, 500.00);
        tabelaDeducoesIRRF.put(3000.00, 800.00);
        tabelaDeducoesIRRF.put(3500.00, 1200.00);
        tabelaDeducoesIRRF.put(4000.00, 1600.00);
        tabelaDeducoesIRRF.put(4500.00, 2000.00);
        tabelaDeducoesIRRF.put(5000.00, 2400.00);

        // Alíquotas de IRRF (faixas de renda tributável e alíquotas correspondentes)
        Map<Double, Double> tabelaAliquotasIRRF = new HashMap<>();
        tabelaAliquotasIRRF.put(0.00, 7.5);
        tabelaAliquotasIRRF.put(2000.01, 15.0);
        tabelaAliquotasIRRF.put(3000.01, 22.5);
        tabelaAliquotasIRRF.put(3500.01, 27.5);
        tabelaAliquotasIRRF.put(4000.01, 32.5);

        // Criar matriz de salários (valores aleatórios entre 1000 e 15000)
        double[][] salarios = new double[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                salarios[i][j] = random.nextInt(15001) + 1000;
            }
        }

        // Criar matriz para armazenar descontos
        double[][] descontosIRRF = new double[10][10];

        // Calcular e armazenar descontos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double salario = salarios[i][j];
                double rendaTributável = salario - tabelaDeducoesIRRF.getOrDefault(salario, 0.0);

                // Encontrar alíquota de IRRF
                double aliquotaIRRF = 0.0;
                for (Map.Entry<Double, Double> faixaRendaTributável : tabelaAliquotasIRRF.entrySet()) {
                    double limiteInferior = faixaRendaTributável.getKey();
                    double limiteSuperior = faixaRendaTributável.getValue();
                    if (limiteInferior <= rendaTributável && rendaTributável <= limiteSuperior) {
                        aliquotaIRRF = faixaRendaTributável.getValue() / 100;
                        break;
                    }
                }

                // Calcular desconto de IRRF
                descontosIRRF[i][j] = rendaTributável * aliquotaIRRF;
            }
        }

        // Exibir matriz de salários
        System.out.println("Matriz de Salários:");
        imprimeMatriz(salarios);

        System.out.println("\nMatriz de Descontos de IRRF:");
        imprimeMatriz(descontosIRRF);
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

