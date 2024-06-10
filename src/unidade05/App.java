package unidade05;

public class App {
    public static void main(String[] args) {
        // Utiliza RECORD, quando estamos buscando dados em Banco.
        System.out.println("Exibindo valores, com o Record 'Curso'. ");
        Curso curso = new Curso(1, "Curso de Java", "Presencial", "ABC Treinamentos", 199.99);
        System.out.println(curso);
    }
}
