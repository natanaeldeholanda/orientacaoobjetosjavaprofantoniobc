package unidade04;

public class App {

    public static void main(String[] args) {
        ServidorPublico servidor = new ServidorPublico(5, "Jairo Amorim", "RFB", "Auditor", "COTIC", "jairoamorim@sps.gov", 9000);
        Curso curso = new Curso(6, "ADS", "Presencial", "CDL", 499.00);
        servidor.setCursos(curso);
        servidor.setCursos(curso);
        servidor.getCursos();

        Dependente dependente = new Dependente("Jujubinha", "123.456.789-00", "Feminino", 14);
        servidor.setDependentes(dependente);
        servidor.getDependentes();

        Telefone telefoneResidencial = new Telefone("Residencial", "853333-4444");
        Telefone telefoneComercial = new Telefone("Whatsapp", "8599999-0000");
        servidor.setTelefones(telefoneResidencial);
        servidor.setTelefones(telefoneComercial);
        servidor.getTelefones();
        System.out.println("----------------------");

        Estatutario isabela = new Estatutario(2, 10_000, 1, "Isabela Sampaio");
        System.out.println(isabela);
        System.out.println(isabela.getSalarioBase());
        System.out.println("----------------------");
        Comissionado pedro = new Comissionado(6_000, 3_000, 6, "Pedro Pê");
        System.out.println(pedro);
        System.out.println("----------------------");
        Temporario rafael = new Temporario("6 meses", 8_000, 10, "Rafael Barbosa");
        System.out.println(rafael);
        System.out.println("----------------------");
        System.out.println(rafael.getContrato());
        System.out.println(rafael.getSalario());
        System.out.println(rafael.calcularSalarioHorasExtras(20) + rafael.getSalario());
        System.out.println(rafael.getMatricula());

    }
}
