package Produtos;

import ClassesEspeciais.DAO;
import Produtos.ProdutosDAO;
import Produtos.TabelaProdutos;
import java.util.ArrayList;


public class ProdutosControle implements DAO {
    
    ProdutosDAO pdao = new ProdutosDAO();
    
    
    @Override
    public void insert(Object o) {
        pdao.insert(o);
    }

    @Override
    public void update(Object o) {
        pdao.update(o);
    }

    
    public void delete(int cod) {
        pdao.delete(cod);
    }

    
    public void selectALL() {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaProdutos().ExibirTabela();
            }
        });
    }

}