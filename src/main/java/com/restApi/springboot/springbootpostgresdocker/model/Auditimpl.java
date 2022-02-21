package com.restApi.springboot.springbootpostgresdocker.model;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class Auditimpl implements AuditorAware {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("taqi");
    }
}
