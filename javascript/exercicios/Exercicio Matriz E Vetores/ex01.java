package ExMatrizEVetores;

import javax.swing.JOptionPane;

/*
01 - Fazer uma matriz 2X2 para guardar nomes. Mostrar os nomes.
*/

public class ex01 {
    public static void main(String[] args) {
        
          String Nome[][] = new String[2][2];
        
        for (int Lin = 0; Lin < Nome.length; Lin++) {
            for (int Col = 0; Col < Nome[0].length; Col++) {
                Nome[Lin][Col] = JOptionPane.showInputDialog("Informe o nome: ");
            }
        }
        
        for (int Lin = 0; Lin < Nome.length; Lin++) {
            for (int Col = 0; Col < Nome[0].length; Col++) {
                System.out.print(Nome[Lin][Col]+" ");
            }
            System.out.println("");
        }        
        // Usando o StringBuilder;
        StringBuilder Resultado = new StringBuilder();
        for (int Lin = 0; Lin < Nome.length; Lin++) {
            for (int Col = 0; Col < Nome[0].length; Col++) {
                Resultado.append(Nome[Lin][Col]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null,Resultado); 
    }
}
    
