package com.weg.locacaoVeiculos.controller;

import com.weg.locacaoVeiculos.mapper.LocacaoMapping;
import com.weg.locacaoVeiculos.service.LocacaoService;

public class LocacaoController {

    private final LocacaoMapping locacaoMapping;

    private final LocacaoService locacaoService;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((locacaoMapping == null) ? 0 : locacaoMapping.hashCode());
        result = prime * result + ((locacaoService == null) ? 0 : locacaoService.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LocacaoController other = (LocacaoController) obj;
        if (locacaoMapping == null) {
            if (other.locacaoMapping != null)
                return false;
        } else if (!locacaoMapping.equals(other.locacaoMapping))
            return false;
        if (locacaoService == null) {
            if (other.locacaoService != null)
                return false;
        } else if (!locacaoService.equals(other.locacaoService))
            return false;
        return true;
    }

    

}
