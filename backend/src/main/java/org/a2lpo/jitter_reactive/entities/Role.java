package org.a2lpo.jitter_reactive.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, GUEST;

    @Override
    public String getAuthority() {
        return name();
    }
}
