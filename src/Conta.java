public class Conta {
    public double saldo;
    public String cliente;
    public TipoContaEnum tipoConta;

    public Conta (double saldo){
        this.saldo = saldo;
    }

    public Conta(double saldo, TipoContaEnum tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public boolean Depositar(double valor){
        if (tipoConta == TipoContaEnum.CORRENTE){
            if(valor<1000){
                saldo = saldo+valor;
                return true;
            }
            else
                return false;
        }
        else {
            saldo=saldo+valor;
        }

    }

    public boolean Sacar (double valor){
        if (valor>saldo){
            return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta contaDestino){
        if (tipoConta == TipoContaEnum.CORRENTE){
            if (contaDestino.tipoConta == TipoContaEnum.POUPANCA){
                contaDestino.saldo += valor;
                return true;
                if (saldo<0){
                    return false;
                }
            }
        } else {
            return false;
        }
    }


}
