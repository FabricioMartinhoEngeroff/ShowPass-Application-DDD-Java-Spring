package com.DvFabricio.ShowPass.application.evento;

import com.DvFabricio.ShowPass.domain.evento.Categoria;
import com.DvFabricio.ShowPass.application.ingresso.DadosCadastroTipoIngresso;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
