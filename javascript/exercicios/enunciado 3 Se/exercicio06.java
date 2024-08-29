
package ExercicoLista3;

import javax.swing.JOptionPane;

/*
06) Utilizar Condicional composta:
Na verificação de uma determinada cor e fruta, só será verdadeira
se as duas condições serem verdadeira.
Cor = Vermelha
Fruta = Maçã
*/

public class exercicio06 {
    public static void main(String[] args) {
        
 final String Cor = "Vermelha";
        final String Fruta = "Maçã";
        
        String CorUsuario = JOptionPane.showInputDialog("Informe uma cor: ");
        String FrutaUsuario = JOptionPane.showInputDialog("Informe uma fruta: ");

        if (CorUsuario.equals(Cor) && FrutaUsuario.equals(Fruta)){
            JOptionPane.showMessageDialog(null,"Você acertou, era VERMELHA e MAÇÃ!");
        }else{
            JOptionPane.showMessageDialog(null,"Você errou era VERMELHA e MAÇÃ!");
        }

        String Situacao = CorUsuario.equals(Cor) && FrutaUsuario.equals(Fruta) ? "Você acertou, era VERMELHA e MAÇÃ!" :
                "Você errou era VERMELHA e MAÇÃ!";
        
        JOptionPane.showMessageDialog(null,Situacao);        

    }
    
}