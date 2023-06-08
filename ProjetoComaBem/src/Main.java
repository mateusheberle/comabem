import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Meu primeiro app JAVA");

//        Produtos p1 = new Produtos();
//        Unidade u1 = new Unidade();
//
//        p1.setProd_cod(2);
//        p1.setProd_nome("Carne");
//        p1.setProd_quantidade(2.0);
//        p1.setProd_valor(30.0);
//        p1.setUni_cod(1);
//
//        u1.setUni_cod(1);
//        u1.setUni_medida("Kilo");
//
//        System.out.println("Produto cadastrado");
//        System.out.println("O codigo é:" + p1.getProd_cod());
//        System.out.println("O nome é:" + p1.getProd_nome());
//        System.out.println("A quantidade é:" + p1.getProd_quantidade());
//        System.out.println("O valor é:" + p1.getProd_valor());
//        System.out.println("O codigo da unidade é:" + p1.getUni_cod());




//        Produtos p2 = new Produtos();
//        p2.setProd_cod(7);
//        p2.setProd_nome("Ovelha amarela");
//        p2.setProd_quantidade(5.0);
//        p2.setProd_valor(100.0);
//        p2.setUni_cod(1);
//
//        Unidade u2 = new Unidade();
//        u2.setUni_cod(10);
//        u2.setUni_medida("Ano-luz");



        DAO_Produtos dao_produtos = new DAO_Produtos();
//        dao_produtos.inserir(p2);
//        dao_produtos.alterar(p2);
//        dao_produtos.excluir(p2);
//        dao_produtos.consulta();


        DAO_Unidade dao_unidade = new DAO_Unidade();
//        dao_unidade.inserir(u2);
//        dao_unidade.alterar(u2);
//        dao_unidade.excluir(u2);
//        dao_unidade.consulta();

//        System.out.println("Deseja consultar? 1 - Produtos / 2 - Unidade");
//        Scanner teclado = new Scanner(System.in);
//        String opcao = teclado.next();
//        if(opcao.equals("1")){
//
//        }

    }
}