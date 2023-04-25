package br.com.cadastro.service;


import br.com.cadastro.model.Estado;
import br.com.cadastro.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstadoService {

    @Autowired
    EstadoRepository estadoRepository;

    public Estado salvar(Estado estado){
        return estadoRepository.save(estado);
    }

    public List<Estado> buscarTodos(){
        return estadoRepository.findAll();
    }

}
