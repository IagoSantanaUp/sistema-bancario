package sistemaBancario;

import javax.lang.model.element.NestingKind;

public class Cadastro {
    //Atributos
    private int numeroConta;
    private double saldo;
    private double depositoInicial;
    private String nomeTitular;

    private double deposito;
    private double saque;
    private double taxaBancoSaque = 5.00;

    public Cadastro(int numeroConta, double depositoInicial, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.depositoInicial = depositoInicial;
        this.nomeTitular = nomeTitular;
    }

    public void exibirInformacoes(int numeroConta, double saldo, String nomeTitular) {
        System.out.println("O titular da conta é: " + nomeTitular + ". Meu saldo é " + saldo + ". Meu número da conta é " + numeroConta);
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta != 0) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("Incorreto o número da conta!");
        }
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular != null) {
            this.nomeTitular = nomeTitular;
        } else {
            throw new IllegalArgumentException("Incorreto nome do titular!");
        }
    }


    public void setDepositoInicial(int depositoInicial) {
        if (depositoInicial > 0) {
            saldo += depositoInicial;
        } else {
            throw new IllegalArgumentException("Valor de deposito incorreto!");
        }
    }

    public void depositar(int deposito) {
        if (deposito > 0) {
            saldo += deposito;;
        } else {
            throw new IllegalArgumentException("Valor de deposito incorreto!");
        }
    }

    public void sacar(double saque) {
        if (saque > 0) {
            double novoSaldo = (taxaBancoSaque + saque) - saldo;
            saldo = novoSaldo;
        } else {
            throw new IllegalArgumentException("Valor de saque incorreto!");
        }
    }


}
