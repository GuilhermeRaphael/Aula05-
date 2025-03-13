public class Conta {
    public double saldo;
    public Cliente cliente;
    public TipoContaEnum tipo;

    public Conta(double ValorInicial) {
        this.tipo=TipoContaEnum.CORRENTE;
        this.saldo = ValorInicial;
    }

    public Conta(double ValorInicial, String tipo) {
        this.saldo = ValorInicial;
        if (tipo.equalsIgnoreCase("corrente"))
            this.tipo = TipoContaEnum.CORRENTE;
        else
            this.tipo = TipoContaEnum.POUPANCA;
    }

    //OS 2 TIPOS ESTAO CERTOS
    public Conta(double saldo, TipoContaEnum tipoConta) {
        this.saldo = saldo;
        this.tipo = tipoConta;
    }

    public boolean Depositar(double valor) {
        if (this.tipo.equals(TipoContaEnum.CORRENTE) && valor > 1000) {
            return false;
        } else {
            this.saldo += valor; //Saldo = saldo + Valor
            return true;
        }
    }

    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.tipo.equals(TipoContaEnum.CORRENTE) &&
                contaDestino.tipo.equals(TipoContaEnum.POUPANCA) &&
                this.saldo >= (this.saldo - valor)) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
        return false;
    }
}

        /*{
            if (contaDestino.tipo == TipoContaEnum.POUPANCA) {
                contaDestino.saldo += valor;
                return true;
            }
                if (saldo<0){
                    return false;

                }
                else {
                    return false;
                }

            }
             return false;
    }
    */