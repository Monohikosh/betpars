package ru.project.betpars.model;

import jakarta.persistence.*;
import lombok.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Entity
@Table(name = "pars")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pars extends GenericModel {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Column(name = "status")
    private String status;

    @Column(name = "bk_name")
    private String bkName;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "tour_name")
    private String tourName;

    @Column(name = "team1")
    private String team1;

    @Column(name = "team2")
    private String team2;

    @Column(name = "date_match")
    private LocalDateTime dateMatch;

    @Column(name = "params")
    private String params;

    @Column(name = "bet_name")
    private String betName;

    @Column(name = "kofs")
    private String kofs;

    @Column(name = "date_request")
    private LocalDateTime dateRequest;

}
