package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
31. Crie um programa que leia um código de produto (de 1 a 5) e exiba sua descrição.
Utilize a seguinte tabela:
a) 1: "Produto A"
b) 2: "Produto B"
c) 3: "Produto C"
d) 4: "Produto D"
e) 5: "Produto E"
*/

public class ex31 {
    public static void main(String[] args) {
        
        String ProdutoA = "Nescau";
        String ProdutoB = "Arroz";
        String ProdutoC = "Feijão";
        String ProdutoD = "Bolacha";
        String ProdutoE = "Macarrão"; 
        
        int CodProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: "));
        
       
        switch (CodProd) {
            
            case 1:
                JOptionPane.showMessageDialog(null, ProdutoA);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, ProdutoB);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, ProdutoC);
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, ProdutoD);
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, ProdutoE);
                break;  
                
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        
    }
}
