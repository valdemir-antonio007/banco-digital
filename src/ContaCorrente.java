public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato de Conta Corrente: ");
        System.out.println("Data: "+ super.pegaDataAtual());
        System.out.println("------------");
        System.out.println("Cliente: "+this.cliente.getNome());
        System.out.println("CPF: "+this.cliente.getCpf());
        System.out.println("Celular: "+this.cliente.getCelular());
        System.out.println("Saldo: "+this.getSaldo());
    }
}
