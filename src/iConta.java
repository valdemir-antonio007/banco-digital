public interface iConta {

    void depositar(double quantia);
    void sacar(double quantia);
    void transferir(double quantia, Conta contaDestino);
    void imprimeExtrato();
    void gerarRelatorioFinanceiro();
}
