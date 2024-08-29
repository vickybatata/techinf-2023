package ExercicoLista3;

import javax.swing.JOptionPane;

/*
13)Faça um programa de uma folha de pagamento onde deverá ser informado nome, salário 
base, descontos diversos, horas extras e gratificação, e o algoritmo deve calcular o desconto 
do INSS e IRRF, e no final mostrar todos os dados informados assim como o INSS e também o 
salário Líquido.
salário bruto é salário base mais horas extras e mais gratificação.
salário liquido é salário base menos os descontos.

IRRF
*/

public class exercicio13DescIRRF {
    public static void main(String[] args) {
        
       float salabruto = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: "));
        float descirrf;

        final float lim1 = 2259.20f;
        final float lim2 = 2826.65f;
        final float lim3 = 3751.05f;
        final float lim4 = 4664.68f;
        final float Tx1 = 0.075f;
        final float Tx2 = 0.15f;
        final float Tx3 = 0.225f;
        final float Tx4 = 0.275f;
        final float Ded1 = 169.44f;
        final float Ded2 = 381.44f;
        final float Ded3 = 662.77f;
        final float Ded4 = 896f;    

        if (salabruto <= lim1){
            descirrf = 0;
        }else if (salabruto <= lim2){
            descirrf = salabruto *  Tx1 - Ded1;
        }else if (salabruto <= lim3){
            descirrf = salabruto *  Tx2 - Ded2;
        }else if (salabruto <= lim4){
            descirrf = salabruto * Tx3 - Ded3;
        }else{
            descirrf = salabruto * Tx4 - Ded4;
        }

        JOptionPane.showMessageDialog(null,"Salário: "+salabruto+
                "\nDesconto: "+descirrf);
        
    }
}
