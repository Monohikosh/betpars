package ru.project.betpars.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParsDto extends GenericDto {

    private String status;
    private String bkName;
    private String gameName;
    private String tourName;
    private String team1;
    private String team2;
    private LocalDateTime dateMatch;
    private String params;
    private String betName;
    private String kofs;
    private LocalDateTime dateRequest;

}
