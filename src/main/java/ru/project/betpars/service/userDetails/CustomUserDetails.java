package ru.project.betpars.service.userDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Builder
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {

    private Collection<? extends GrantedAuthority> authorities;
    private String password;
    private String username;
    private Integer id;
    private Boolean enabled;
    private Boolean accountNotExpired;
    private Boolean accountNotLocked;
    private Boolean credentialsNotExpired;

    public CustomUserDetails(final Integer id,
                             final String username,
                             final String password,
                             final Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountNotExpired = true;
        this.accountNotLocked = true;
        this.credentialsNotExpired = true;
        this.enabled = true;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNotExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNotLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNotExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Integer getUserId() {
        return id;
    }

    @Override
    public String toString() {
        return "{\"user_id\":\"" + id + "\"," +
                "\"username\":\"" + username + "\"," +
                "\"user_role\":\"" + authorities + "\"," +
                "\"user_password\":\"" + password + "\"}";
    }
}
