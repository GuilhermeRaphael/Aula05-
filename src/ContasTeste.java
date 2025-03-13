public class ContasTeste {
     public static void main(String[] args) {

         Conta cc = new Conta(1000); //Ja foi definido que a conta por padrão é corrente e nao precisa declarar
         Conta cp = new Conta(5000 , TipoContaEnum.POUPANCA);

         cc.Depositar(1500);
         System.out.println(cc.saldo);
         cp.Depositar(1500);
         System.out.println(cp.saldo);
         cp.Depositar(98.52);
         System.out.println(cp.saldo);
         cp.sacar(100);
         System.out.println(cp.saldo);
         cc.transferir(500, cp);
         System.out.println(cc.saldo);
         System.out.println(cp.saldo);



    }
}
