package ru.project.betpars.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.project.betpars.model.Pars;
import ru.project.betpars.model.User;
import ru.project.betpars.repository.ParsRepository;

import java.util.List;

@Service
public class ParsService {

    private final ParsRepository repository;

    public ParsService(ParsRepository repository) {
        this.repository = repository;
    }

    public List<Pars> getAll() {
        return repository.findAll();
    }

    public Pars getOne(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

//    public Page<Pars> getLiveFonbetCs(Pageable pageable) {
//        return repository.findAllByStatusAndGameName/*AndBetName*/("live", "Counter-Strike",/*
//                "Fonbet", */pageable);
//    }

    public Page<Pars> getLiveFonbetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("live",
                "Fonbet", "Counter-Strike", pageable);
    }

    public Page<Pars> getLiveFonbetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("live",
                "Fonbet", "Dota 2", pageable);
    }

    public Page<Pars> getLiveFonbetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("live",
                "Fonbet", "LoL", pageable);
    }

    public Page<Pars> getLiveFonbetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("live",
                "Fonbet", "Valorant", pageable);
    }

    public Page<Pars> getLineFonbetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("line",
                "Fonbet", "Counter-Strike", pageable);
    }

    public Page<Pars> getLineFonbetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("line",
                "Fonbet", "Dota 2", pageable);
    }

    public Page<Pars> getLineFonbetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName("line",
                "Fonbet", "LoL", pageable);
    }

    public Page<Pars> getLineFonbetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "Fonbet", "Valorant",/*
                "Fonbet", */pageable);
    }

    public Page<Pars> getLiveCloudbetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "Cloudbet", "Counter-Strike",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLiveCloudbetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "Cloudbet", "Dota 2",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLiveCloudbetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "Cloudbet", "LoL",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLiveCloudbetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "Cloudbet", "Valorant",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLineCloudbetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "Cloudbet", "Counter-Strike",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLineCloudbetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "Cloudbet", "Dota 2",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLineCloudbetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "Cloudbet", "LoL",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLineCloudbetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "Cloudbet", "Valorant",/*
                "Cloudbet", */pageable);
    }

    public Page<Pars> getLiveCsgopositiveCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "csgopositive", "Counter-Strike",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLiveCsgopositiveDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "csgopositive", "Dota 2",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLiveCsgopositiveLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "csgopositive", "LoL",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLiveCsgopositiveValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "csgopositive", "Valorant",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLineCsgopositiveCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "csgopositive", "Counter-Strike",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLineCsgopositiveDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "csgopositive", "Dota 2",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLineCsgopositiveLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "csgopositive", "LoL",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLineCsgopositiveValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "csgopositive", "Valorant",/*
                "csgopositive", */pageable);
    }

    public Page<Pars> getLive1xCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "1x", "Counter-Strike",/*
                "1x", */pageable);
    }

    public Page<Pars> getLive1xDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "1x", "Dota 2",/*
                "1x", */pageable);
    }

    public Page<Pars> getLive1xLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "1x", "LoL",/*
                "1x", */pageable);
    }

    public Page<Pars> getLive1xValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "1x", "Valorant",/*
                "1x", */pageable);
    }

    public Page<Pars> getLine1xCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "1x", "Counter-Strike",/*
                "1x", */pageable);
    }

    public Page<Pars> getLine1xDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "1x", "Dota 2",/*
                "1x", */pageable);
    }

    public Page<Pars> getLine1xLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "1x", "LoL",/*
                "1x", */pageable);
    }

    public Page<Pars> getLine1xValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "1x", "Valorant",/*
                "1x", */pageable);
    }

    public Page<Pars> getLiveRaybetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "raybet", "Counter-Strike",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLiveRaybetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "raybet", "Dota 2",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLiveRaybetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "raybet", "LoL",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLiveRaybetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "raybet", "Valorant",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLineRaybetCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "raybet", "Counter-Strike",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLineRaybetDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "raybet", "Dota 2",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLineRaybetLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "raybet", "LoL",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLineRaybetValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "raybet", "Valorant",/*
                "raybet", */pageable);
    }

    public Page<Pars> getLiveTFCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "TF", "Counter-Strike",/*
                "TF", */pageable);
    }

    public Page<Pars> getLiveTFDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "TF", "Dota 2",/*
                "TF", */pageable);
    }

    public Page<Pars> getLiveTFLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "TF", "LoL",/*
                "TF", */pageable);
    }

    public Page<Pars> getLiveTFValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("live", "TF", "Valorant",/*
                "TF", */pageable);
    }

    public Page<Pars> getLineTFCs(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "TF", "Counter-Strike",/*
                "TF", */pageable);
    }

    public Page<Pars> getLineTFDota(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "TF", "Dota 2",/*
                "TF", */pageable);
    }

    public Page<Pars> getLineTFLol(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "TF", "LoL",/*
                "TF", */pageable);
    }

    public Page<Pars> getLineTFValorant(Pageable pageable) {
        return repository.findAllByStatusAndBkNameAndGameName/*AndBetName*/("line", "TF", "Valorant",/*
                "TF", */pageable);
    }


//    public Page<Pars> getLiveCS(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("live", "Counter-Strike", pageable);
//    }
//
//    public Page<Pars> getLiveDota(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("live", "Dota 2", pageable);
//    }
//
//    public Page<Pars> getLiveValorant(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("live", "Valorant", pageable);
//    }
//
//    public Page<Pars> getLiveLol(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("live", "LoL", pageable);
//    }
//
//    public Page<Pars> getLineCS(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("line", "Counter-Strike", pageable);
//    }
//
//    public Page<Pars> getLineDota(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("line", "Dota2", pageable);
//    }
//
//    public Page<Pars> getLineValorant(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("line", "Valorant", pageable);
//    }
//    public Page<Pars> getLineLol(Pageable pageable) {
//        return repository.findAllByStatusAndGameName("line", "LoL", pageable);
//    }

}
