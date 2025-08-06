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
