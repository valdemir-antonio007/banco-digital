import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(new Cliente("Valdemir Antonio", "123.456.789-55", "77 5555-1234"));
        ContaPoupanca cp2 = new ContaPoupanca(new Cliente("Joao da Silva", "789.456.123.44", "77 7412-8523"));

        cp.depositar(1500);
        System.out.println(cp.toString());
        cp.transferir(500, cp2);
        System.out.println(cp.toString());
        System.out.println("----");
        System.out.println(cp2.toString());
        cp.imprimeExtrato();

        ContaCorrente cc = new ContaCorrente(new Cliente("Veronica rosa", "741.852.963-22", "77 9632-7418"));
        cc.depositar(750);
        cc.imprimeExtrato();




    }
    }