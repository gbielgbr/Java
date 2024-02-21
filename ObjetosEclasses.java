public class Pessoa {
    //Atributos
    
    String nome;
    int idade;
    String profissao;

    //Métodos para exibir informações
    public void exibirInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade + "anos");
        System.out.println("Profissão:" + profissao);
        
    }
    
    //Método principal (main) para testar
    
    public static void main (String[]args){
        //Criando um objeto da classe pessoa
        Pessoa pessoa1 = new Pessoa();
        
        
    //Inicializando atributos diretamente
    
    
pessoa1.nome = "Maria";
pessoa1.idade = 30;
pessoa1.profissao = "Engenehira";

pessoa1.exibirInformacoes();
        
        
    }
}
