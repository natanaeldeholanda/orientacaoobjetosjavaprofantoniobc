package unidade04;

public class App2 implements APIServidorPublico {

    public static void verificarTipoServidorPublico(ServidorPublico servidor) {
        if (servidor instanceof Estatutario)
            System.out.println("Estatutario");
        else if (servidor instanceof Comissionado) {
            System.out.println("Comissionado");
        } else if (servidor instanceof Temporario) {
            System.out.println("Temporário");
        } else {
            System.out.println("Não é servidor público");
        }

    }

    public static void main(String[] args) {
        ServidorPublico isabella = new Comissionado(5_000, 3_000, 1, "Isabella Sampaio");
        isabella = new Estatutario(0, 15_000, 1, "Isabella Sampaio");
        System.out.println(isabella);
        System.out.println(((Estatutario) isabella).getTempoServico());
        System.out.println(((Estatutario) isabella).getSalarioBase());
        verificarTipoServidorPublico(isabella);
        ServidorPublico pedro = new Temporario("1 ano", 7500, 2, "Pedro Oliveira");
        System.out.println(pedro.calcularSalarioHorasExtras(40));
        System.out.println(pedro);
        isabella.exibirInformacoes();
    }

    @Override
    public void adicionarServidorPublico() {

    }

    @Override
    public void listarServidoresPublicos() {

    }

    @Override
    public void listarServidorPublico(int matricula) {

    }

    @Override
    public void alterarServidorPublico(com.abctreinamentos.siscapacit.ServidorPublico servidorAlterado) {

    }

    @Override
    public void listarServidoresPublicos(int matricula) {

    }

    @Override
    public void alterarServidorPublico(ServidorPublico servidorAlterado) {

    }

    @Override
    public void excluirServidorPublico(int matricula) {

    }
}
