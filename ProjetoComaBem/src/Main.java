public class Main {
    public static void main(String[] args) {

        System.out.println("Meu primeiro app JAVA");

        Produtos p1 = new Produtos();
        Unidade u1 = new Unidade();

        p1.setProd_cod(2);
        p1.setProd_nome("Carne");
        p1.setProd_quantidade(2.0);
        p1.setProd_valor(30.0);
        p1.setUni_cod(1);

        u1.setUni_cod(1);
        u1.setUni_medida("Kilo");

        System.out.println("Produto cadastrado");
        System.out.println("O codigo é:" + p1.getProd_cod());
        System.out.println("O nome é:" + p1.getProd_nome());
        System.out.println("A quantidade é:" + p1.getProd_quantidade());
        System.out.println("O valor é:" + p1.getProd_valor());
        System.out.println("O codigo da unidade é:" + p1.getUni_cod());




    }
}