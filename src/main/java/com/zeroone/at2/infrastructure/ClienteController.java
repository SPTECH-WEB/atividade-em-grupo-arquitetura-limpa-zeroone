package com.zeroone.at2.infrastructure;

import com.zeroone.at2.adapters.dtos.ClienteEntityRequestDto;
import com.zeroone.at2.adapters.dtos.ClienteEntityResponseDto;
import com.zeroone.at2.application.usecase.BuscarClientePorIdUseCase;
import com.zeroone.at2.application.usecase.CadastrarClienteUseCase;
import com.zeroone.at2.domain.Cliente;
import com.zeroone.at2.infrastructure.persistance.ClienteMapper;
import com.zeroone.at2.infrastructure.persistance.ClienteRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepositoryImpl repository;

    @Autowired
    private CadastrarClienteUseCase cadastrarClienteUseCase;

    @Autowired
    private BuscarClientePorIdUseCase buscarClientePorIdUseCase;

    @PostMapping
    public ResponseEntity<ClienteEntityResponseDto> cadastrarCliente(@RequestBody ClienteEntityRequestDto requestDto){
        Cliente cliente = cadastrarClienteUseCase.executar(ClienteMapper.toRawCliente(requestDto));
        ClienteEntityResponseDto responseDto = ClienteMapper.toResponseDto(cliente);
        return ResponseEntity.status(201).body(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteEntityResponseDto> buscarClientePorId(@PathVariable String id) {
        Cliente cliente = buscarClientePorIdUseCase.executa(id);
        ClienteEntityResponseDto responseDto = ClienteMapper.toResponseDto(cliente);
        return ResponseEntity.ok(responseDto);
    }
}
