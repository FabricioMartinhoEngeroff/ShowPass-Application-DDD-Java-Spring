package com.DvFabricio.ShowPass.evento;

import br.com.alura.codechella.Categoria;
import br.com.alura.codechella.DadosTipoIngresso;
import br.com.alura.codechella.Endereco;
import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.List;

public class Evento {
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos;
}
