package objeto;



public class Produto {
    
     private String Descricao;
     private String nomeProduto;
     private String Quantidade;
     private float CodBarras;
     private float ValorUnitario;
     
     public Produto(String Descricao,String nomeProduto, String Quantidade, float CodBarras, float ValorUnitario) {
        
         this.Descricao = Descricao;
         this.nomeProduto = nomeProduto;
         this.Quantidade = Quantidade;
         this.CodBarras = CodBarras;
         this.ValorUnitario = ValorUnitario;
   
    }
}
