import formatadores.FormataData;

import java.time.LocalDateTime;

public abstract class  Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double quantia) {
        if(quantia <= 0){
            throw new IllegalArgumentException("Valor Invalido");
        }else {
            this.setSaldo(this.getSaldo()+quantia);
        }
    }

    @Override
    public void sacar(double quantia) {
        if(this.getSaldo() >= quantia){
            this.setSaldo(this.getSaldo()-quantia);
        }else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }

    @Override
    public void transferir(double quantia, Conta contaDestino) {
        this.sacar(quantia);
        contaDestino.depositar(quantia);
    }


    public String pegaDataAtual(){
        LocalDateTime data = LocalDateTime.now();
        return FormataData.formataData(data);
    }

    @Override
    public void gerarRelatorioFinanceiro() {

    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
