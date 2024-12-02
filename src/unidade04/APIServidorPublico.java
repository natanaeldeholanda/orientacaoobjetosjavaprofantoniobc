package unidade04;

import com.abctreinamentos.siscapacit.ServidorPublico;

/***********************************/
public interface APIServidorPublico {
    /***********************************/

    void adicionarServidorPublico();

    void listarServidoresPublicos();

    void listarServidorPublico(int matricula);

    void alterarServidorPublico(ServidorPublico servidorAlterado);

    void listarServidoresPublicos(int matricula);

    void alterarServidorPublico(unidade04.ServidorPublico servidorAlterado);

    void excluirServidorPublico(int matricula);
}