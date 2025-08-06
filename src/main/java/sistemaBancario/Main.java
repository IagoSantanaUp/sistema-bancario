package sistemaBancario;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro1 = new Cadastro(123, 0, "Iago");

        cadastro1.setDepositoInicial(200);
        cadastro1.depositar(200);

        cadastro1.sacar(200.00);

        System.out.println(cadastro1.getNomeTitular() + cadastro1.getNumeroConta() + cadastro1.getSaldo());
    }
}
