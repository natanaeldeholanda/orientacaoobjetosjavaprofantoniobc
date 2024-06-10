package com.abctreinamentos.siscapacit2;

import unidade04.ServidorPublico;

public interface APICurso {

    public void adicionarCurso();

    public void listarCursos();

    public void listarCurso(int matricula);

    public void alterarCurso(Curso servidorAlterado);

    public void excluirCurso(int matricula);

    public void adicionarServidorCurso(int matricula, int idcurso);

    public void excluirServidorCurso(int matricula, int idcurso);

    public void listarServidorCurso(int idcurso);

}
