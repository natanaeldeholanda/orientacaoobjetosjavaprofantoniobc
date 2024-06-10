package com.abctreinamentos.siscapacit2;

import unidade04.ServidorPublico;

public interface APIServidorPublico {

    public void adicionarServidorPublico();

    public void listarServidoresPublicos();

    public void listarServidoresPublicos(int matricula);

    public void alterarServidorPublico(ServidorPublico servidorAlterado);

    public void excluirServidorPublico(int matricula);

    public void calcularFolhaServidoresPublicos();

    public void adicionarCursoServidorPublico(int matricula, int idcurso);

    public void excluirCursoServidorPublico(int matricula, int idcurso);

    public void listarCursoServidorPublico(int matricula);

    void listarCurso();

    void excluirServidor(int idcurso, int matricula);
}
