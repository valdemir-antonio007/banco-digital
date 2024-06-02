import formatadores.FormataData;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void imprimeExtrato() {
        System.out.println("Extrato de Conta Poupança: ");
        System.out.println("Data: "+ super.pegaDataAtual());
        System.out.println("------------");
        System.out.println("Cliente: "+this.cliente.getNome());
        System.out.println("CPF: "+this.cliente.getCpf());
        System.out.println("Celular: "+this.cliente.getCelular());
        System.out.println("Saldo: "+this.getSaldo());
    }


}
