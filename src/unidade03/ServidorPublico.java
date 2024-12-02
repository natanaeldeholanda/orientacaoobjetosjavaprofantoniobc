package unidade03;

public class ServidorPublico {

    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico(1, "Isabela Sampaio", "Auditor Fiscal", "123.456.789-00", 30, 15000, Avaliacao.EXCELENTE);
        totalServidores++;
        ServidorPublico heila = new ServidorPublico(2, "Heila Ghassan", "Estagiária", "123.456.789-01", 20, 10000, Avaliacao.BOM);
        totalServidores++;
        ServidorPublico maria = new ServidorPublico(3, "Maria Fontenele", "Analista de Sistemas", "123.456.789-02", 50, 9000, Avaliacao.REGULAR);
        totalServidores++;
        ServidorPublico caio = new ServidorPublico(4, "Caio Santos", "Analista Triubutário", "123.456.789-03", 60, 12000, Avaliacao.INSATISFATORIO);
        totalServidores++;
        System.out.println(isabela);
        System.out.println("Horas Extras: " + isabela.calcularHoraExtra(10, 15, 20));
        System.out.println(heila);
        System.out.println("Horas Extras: " + heila.calcularHoraExtra(12, 8, 10));
        System.out.println(maria);
        System.out.println("Horas Extras: " + maria.calcularHoraExtra(13, 7, 4));
        System.out.println(caio);
        System.out.println("Total: (Salário + Horas Extras): " + caio.calcularHoraExtra(11, 20, 10));
        System.out.println("---***---");
        isabela.mostrarTamanhoNome();
        isabela.mostrarPreNome();
        isabela.mostrarSobrenome();
    }

    public double calcularHoraExtra(int... horasTrabalhadas) {
        double salarioMensal = 0;
        for (int horasExtras : horasTrabalhadas) {
            salarioMensal = salarioMensal + horasExtras *VALOR_HORA_EXTRA;
        }
        return (salario + salarioMensal);
    }

    @Override
    public String toString() {
        return "ServidorPublico{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", avaliação=" + avaliacao +
                '}';
    }

    // Construtor
    public ServidorPublico(int matricula, String nome, String cargo, String cpf, int idade, double salario, Avaliacao avaliacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
        this.avaliacao = avaliacao;
    }

    // Atributos
    private final int VALOR_HORA_EXTRA = 40;
    private Avaliacao avaliacao;
    private int matricula;
    private int idade;
    private int tempoContribuicao;
    private String nome;
    private String foto;
    private String orgao;
    private String vinculo;
    private Double salario;
    private String cargo;
    private String lotacao;
    private String exercicio;
    private String email;
    private String telefone;
    private String celular;
    private String cpf;
    private String naturalidade;
    private static int totalServidores;

    // Métodos Get e Set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(int tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void mostrarTamanhoNome() {
        System.out.println(this.nome.length());
    }
    public void mostrarPreNome() {
        System.out.println(this.nome.substring(0,nome.indexOf(" ")));
    }
    public void mostrarSobrenome() {
        System.out.println(this.nome.substring(nome.indexOf(" ")+1));
    }
}
