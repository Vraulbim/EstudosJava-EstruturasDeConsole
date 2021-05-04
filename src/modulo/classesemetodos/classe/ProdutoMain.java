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

        System.out.println(produto1.nome);
        System.out.println(produto2.nome);
    }
}
