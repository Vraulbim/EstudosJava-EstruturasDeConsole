package modulo.classesemetodos.classe;

public class ProdutoMain {
    public static void main(String[] args){

        Produto produto1 = new Produto();
        produto1.nome = "Telefone";
        produto1.valor = 1990.45;
        produto1.oferta = 0.30;

        //É possível instânciar objetos utilizando o var
        var produto2 = new Produto();
        produto2.nome = "Notebook";
        produto2.valor = 3.800;
        produto2.oferta = 0.15;

        Produto produto3 = new Produto();
        produto3.nome = "smart Watch";
        produto3.valor = 190.00;
        produto3.oferta = 0.5;

        System.out.println(produto1.nome + " R$" + produto1.precoDesconto());
        System.out.println(produto2.nome + " R$" + produto2.precoDesconto());
        System.out.println(produto3.nome + " R$" + produto3.precoDesconto(0.6));
    }
}
