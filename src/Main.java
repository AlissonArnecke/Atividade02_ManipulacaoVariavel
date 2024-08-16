public class Main {
    public static void main(String[] args) {

        //Criaçao de variáveis
        String nome = "Alisson";
        int idade = 20;
        double salario = 1412.00;
        int mesesTrabalho = 12;
        int produtosComprados = 50;

        //Operaçoes
        double salarioBruto = salario * mesesTrabalho;
        double salarioLiquido = salarioBruto - 1500d;
        double valorTotalCompras = 230.00 * mesesTrabalho;
        double mediaValorProduto = valorTotalCompras / produtosComprados;
        String saudacao = "Nome é: " + nome + " e sonho de Salário: " + salarioLiquido;

        System.out.println("Nome é: " + nome);
        System.out.println("Idade é: " + idade);
        System.out.println("Salário é: " + salario);
        System.out.println("Meses de trabalho: " + mesesTrabalho);
        System.out.println("Produtos comprados: " + produtosComprados);

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário liquido: "+ salarioLiquido);
        System.out.println("Valor das compras é: " + valorTotalCompras);
        System.out.println("Média do valor dos produtos: " + mediaValorProduto);
        System.out.println(saudacao);
    }
}