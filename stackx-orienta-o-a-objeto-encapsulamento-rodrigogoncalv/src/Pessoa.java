public class Pessoa{
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;

    public void primeiroNome(String nome){
        this.nome = nome;
   }

   public String getNome() {
        return nome;
    }

    public void sobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void idade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void sexo(String sexo){
        if (sexo == "F"){
            this.sexo = "Feminino";
        }
        else{
            this.sexo = "Masculino";
        }

    }

       public String getSexo() {
        return sexo;
    }


    public void imprimirPessoa(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }

   
}