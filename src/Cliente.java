public class Cliente {
    public String nome;
    public String Cpf;
    public String telefone;
    public String email;

    public String exibirCliente(){
        return "Dados do cliente" +
                "\n====================" +
                "\nNome: " + this.nome +
                "\nCpf: " + this.Cpf +
                "\nTelefone: " + this.telefone +
                "\nEmail: " + this.email;
                //THIS fala que so pertence a essa classe
    }
}
