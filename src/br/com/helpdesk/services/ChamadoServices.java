package br.com.helpdesk.services;

import br.com.helpdesk.enums.StatusChamado;
import br.com.helpdesk.models.Chamado;

public class ChamadoServices {

    public void alterarStatus(Chamado chamado, StatusChamado novoStatus){
        chamado.setStatusChamado(novoStatus);
    }
}
