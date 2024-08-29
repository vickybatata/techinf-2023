package ExplorandoaClasseArrayListnoJava;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListExemplo {
    public static void main(String[] args) {
        
        ArrayList<Integer>Num = new ArrayList();
        Num.add(3);
        Num.add(7);
        Num.add(6);
        Num.add(4);
        
        JOptionPane.showMessageDialog(null,Num);
        
        Num.add(1,60);
        JOptionPane.showMessageDialog(null,Num);
        
        Num.remove(0);
        JOptionPane.showMessageDialog(null,Num);
        
        Num.set(0,3);
        JOptionPane.showMessageDialog(null,Num);
        
        JOptionPane.showMessageDialog(null, Num.get(2));
        
        JOptionPane.showMessageDialog(null, Num.isEmpty());
        
        JOptionPane.showMessageDialog(null, Num.size());
        
        JOptionPane.showMessageDialog(null, Num.indexOf(4));
        
        JOptionPane.showMessageDialog(null, Num.lastIndexOf(4));
        
    }    
}
