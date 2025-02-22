package com.DvFabricio.ShowPass.application.venda;

import com.DvFabricio.ShowPass.application.ingresso.DadosCadastroIngresso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosCadastroVenda(
        @NotNull(message = "O id do usuário é obrigatório!")
        Long usuario_id,
        @NotNull(message = "Os dados do ingresso devem ser informados")
        @Valid
        List<DadosCadastroIngresso> ingressos

) {

}
