package ru.project.betpars.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends GenericModel {

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "role_id",
            foreignKey = @ForeignKey(name = "FK_USER_ROLES")
    )
    private Role role;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "subscribe", nullable = false)
    private Boolean subscribe;

    @Column(name = "start_sub")
    private LocalDateTime startSub;

    @Column(name = "end_sub")
    private LocalDateTime endSub;

}
