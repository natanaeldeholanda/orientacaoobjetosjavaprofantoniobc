package unidade04;

import com.abctreinamentos.siscapacit.ServidorPublico;

/***********************************/
public interface APIServidorPublico {
    /***********************************/

    public void adicionarServidorPublico();

    public void listarServidoresPublicos();

    public void listarServidorPublico(int matricula);

    public void alterarServidorPublico(ServidorPublico servidorAlterado);

    void listarServidoresPublicos(int matricula);

    void alterarServidorPublico(unidade04.ServidorPublico servidorAlterado);

    public void excluirServidorPublico(int matricula);
}