package com.DvFabricio.ShowPass.application.venda;

import com.DvFabricio.ShowPass.application.ingresso.DadosTipoIngresso;
import com.DvFabricio.ShowPass.application.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
