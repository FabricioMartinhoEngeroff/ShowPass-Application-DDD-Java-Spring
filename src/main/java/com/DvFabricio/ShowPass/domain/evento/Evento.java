package com.DvFabricio.ShowPass.domain.evento;

import com.DvFabricio.ShowPass.Infra.evento.Endereco;
import com.DvFabricio.ShowPass.application.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private Long id;

    private Categoria categoria;

    private String descricao;

    private Endereco endereco;

    private LocalDateTime data;

    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

    public boolean isEventoProximo() {
        return data.isBefore(LocalDateTime.now().plusDays(7));
    }

    public List<TipoIngresso> listarTiposDeIngressoDisponiveis() {
        List<TipoIngresso> ingressosDisponiveis = new ArrayList<>();
        for (TipoIngresso tipo : tipoIngressos) {
            if (tipo.getTotalDisponivel() > 0) {
                ingressosDisponiveis.add(tipo);
            }
        }
        return ingressosDisponiveis;
    }

    public int getQuantidadeTotalIngressosDisponiveis() {
        int total = 0;
        for (TipoIngresso tipo : tipoIngressos) {
            total += tipo.getTotalDisponivel();
        }
        return total;
    }


    public Long getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }
}
