package com.zeroone.at2.infrastructure.config;

import com.zeroone.at2.application.usecase.BuscarClientePorIdUseCase;
import com.zeroone.at2.application.usecase.CadastrarClienteUseCase;
import com.zeroone.at2.infrastructure.persistance.ClienteJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteConfig {

    @Bean
    public CadastrarClienteUseCase cadastrarClienteUseCase(ClienteJpaAdapter adapter){
        return new CadastrarClienteUseCase(adapter);
    }

    @Bean
    public BuscarClientePorIdUseCase buscarClientePorIdUseCase(ClienteJpaAdapter adapter){
        return new BuscarClientePorIdUseCase(adapter);
    }
}
