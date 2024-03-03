package ru.project.betpars.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends GenericDto {

  private RoleDto role;
  private String login;
  private String password;
  private String email;
  private boolean subscribe;
  private LocalDateTime startSub;
  private LocalDateTime endSub;

}
