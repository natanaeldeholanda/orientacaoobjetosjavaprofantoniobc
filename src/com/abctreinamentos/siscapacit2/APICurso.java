package com.abctreinamentos.siscapacit2;

import unidade04.ServidorPublico;

public interface APICurso {

    public void adicionarCurso();

    public void listarCurso();

    public void listarCurso(int matricula);

    public void alterarCurso(Curso servidorAlterado);

    public void excluirCurso(int matricula);

    public void adicionarServidorCurso(int idcurso, int matricula);

    public void excluirServidor(int idcurso, int matricula);

    public void listarServidorCurso(int idcurso);

}
