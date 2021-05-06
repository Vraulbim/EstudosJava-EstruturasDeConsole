package modulo.classesemetodos.classe;

public class Produto {
    String nome;
    double valor;
    double oferta;

     double precoDesconto(){
         return valor * (1-oferta);
     }
     double precoDesconto(double descontoGerente){
         return valor * (1- descontoGerente);
     }
}
