package unidade04;

public interface APIServidorPublico {

    public void adicionarServidorPublico();

    public void listarServidoresPublicos();

    public void listarServidoresPublicos(int matricula);

    public void alterarServidorPublico(ServidorPublico servidorAlterado);

    public void excluirServidorPublico(int matricula);

}
