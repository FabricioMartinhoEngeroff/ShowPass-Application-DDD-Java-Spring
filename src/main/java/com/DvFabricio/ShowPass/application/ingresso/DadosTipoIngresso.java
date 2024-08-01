package com.DvFabricio.ShowPass.application.ingresso;

import com.DvFabricio.ShowPass.domain.ingresso.Definicao;
import com.DvFabricio.ShowPass.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
