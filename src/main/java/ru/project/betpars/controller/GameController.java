package ru.project.betpars.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.betpars.dto.ParsDto;
import ru.project.betpars.mapper.ParsMapper;
import ru.project.betpars.model.Pars;
import ru.project.betpars.service.ParsService;

import java.util.List;

@Controller
public class GameController {

    private final ParsService service;
    private final ParsMapper mapper;

    public GameController(ParsService service, ParsMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/live")
    public String viewLive() {
//        return "/live/live";
        return "live";
    }

    @GetMapping("/line")
    public String viewLine() {
//        return "/line/line";
        return "line";
    }

    @GetMapping("/live/fonbet")
    public String viewLiveFonbet() {
        return "liveFonbet";
    }

    @GetMapping("/line/fonbet")
    public String viewLineFonbet() {
        return "lineFonbet";
    }

    @GetMapping("/live/cloudbet")
    public String viewLiveCloudbet() {
        return "liveCloudbet";
    }

    @GetMapping("/line/cloudbet")
    public String viewLineCloudbet() {
        return "lineCloudbet";
    }

    @GetMapping("/live/tf")
    public String viewLiveTF() {
        return "liveTF";
    }

    @GetMapping("/line/tf")
    public String viewLineTF() {
        return "lineTF";
    }

    @GetMapping("/live/1x")
    public String viewLive1x() {
        return "live1x";
    }

    @GetMapping("/line/1x")
    public String viewLine1x() {
        return "line1x";
    }

    @GetMapping("/live/raybet")
    public String viewLiveRaybet() {
        return "liveRaybet";
    }

    @GetMapping("/line/raybet")
    public String viewLineRaybet() {
        return "lineRaybet";
    }

    @GetMapping("/live/csgopositive")
    public String viewLiveCsgopositive() {
        return "liveCsgopositive";
    }

    @GetMapping("/line/csgopositive")
    public String viewLineCsgopositive() {
        return "lineCsgopositive";
    }

    @GetMapping("/live/fonbet/cs")
    public String viewLiveFonbetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveFonbetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveFonbetCs";
    }

    @GetMapping("/live/fonbet/dota")
    public String viewLiveFonbetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveFonbetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveFonbetDota";
    }

    @GetMapping("/live/fonbet/lol")
    public String viewLiveFonbetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveFonbetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveFonbetLol";
    }

    @GetMapping("/live/fonbet/valorant")
    public String viewLiveFonbetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveFonbetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveFonbetValorant";
    }

    @GetMapping("/line/fonbet/cs")
    public String viewLineFonbetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineFonbetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineFonbetCs";
    }

    @GetMapping("/line/fonbet/dota")
    public String viewLineFonbetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineFonbetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineFonbetDota";
    }

    @GetMapping("/line/fonbet/lol")
    public String viewLineFonbetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineFonbetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineFonbetLol";
    }

    @GetMapping("/line/fonbet/valorant")
    public String viewLineFonbetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineFonbetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineFonbetValorant";
    }

    @GetMapping("/live/1x/cs")
    public String viewLive1xCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLive1xCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLive1xCs";
    }

    @GetMapping("/live/1x/dota")
    public String viewLive1xDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLive1xDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLive1xDota";
    }

    @GetMapping("/live/1x/lol")
    public String viewLive1xLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLive1xLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLive1xLol";
    }

    @GetMapping("/live/1x/valorant")
    public String viewLive1xValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLive1xValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLive1xValorant";
    }

    @GetMapping("/line/1x/cs")
    public String viewLine1xCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLine1xCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLine1xCs";
    }

    @GetMapping("/line/1x/dota")
    public String viewLine1xDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLine1xDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLine1xDota";
    }

    @GetMapping("/line/1x/lol")
    public String viewLine1xLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLine1xLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLine1xLol";
    }

    @GetMapping("/line/1x/valorant")
    public String viewLine1xValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLine1xValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLine1xValorant";
    }

    @GetMapping("/live/cloudbet/cs")
    public String viewLiveCloudbetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCloudbetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCloudbetCs";
    }

    @GetMapping("/live/cloudbet/dota")
    public String viewLiveCloudbetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCloudbetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCloudbetDota";
    }

    @GetMapping("/live/cloudbet/lol")
    public String viewLiveCloudbetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCloudbetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCloudbetLol";
    }

    @GetMapping("/live/cloudbet/valorant")
    public String viewLiveCloudbetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCloudbetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCloudbetValorant";
    }

    @GetMapping("/line/cloudbet/cs")
    public String viewLineCloudbetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCloudbetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCloudbetCs";
    }

    @GetMapping("/line/cloudbet/dota")
    public String viewLineCloudbetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCloudbetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCloudbetDota";
    }

    @GetMapping("/line/cloudbet/lol")
    public String viewLineCloudbetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCloudbetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCloudbetLol";
    }

    @GetMapping("/line/cloudbet/valorant")
    public String viewLineCloudbetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCloudbetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCloudbetValorant";
    }

    @GetMapping("/live/csgopositive/cs")
    public String viewLiveCsgopositiveCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCsgopositiveCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCsgopositiveCs";
    }

    @GetMapping("/live/csgopositive/dota")
    public String viewLiveCsgopositiveDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCsgopositiveDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCsgopositiveDota";
    }

    @GetMapping("/live/csgopositive/lol")
    public String viewLiveCsgopositiveLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCsgopositiveLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCsgopositiveLol";
    }

    @GetMapping("/live/csgopositive/valorant")
    public String viewLiveCsgopositiveValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveCsgopositiveValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveCsgopositiveValorant";
    }

    @GetMapping("/line/csgopositive/cs")
    public String viewLineCsgopositiveCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCsgopositiveCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCsgopositiveCs";
    }

    @GetMapping("/line/csgopositive/dota")
    public String viewLineCsgopositiveDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCsgopositiveDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCsgopositiveDota";
    }

    @GetMapping("/line/csgopositive/lol")
    public String viewLineCsgopositiveLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCsgopositiveLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCsgopositiveLol";
    }

    @GetMapping("/line/csgopositive/valorant")
    public String viewLineCsgopositiveValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineCsgopositiveValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineCsgopositiveValorant";
    }

    @GetMapping("/live/raybet/cs")
    public String viewLiveRaybetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveRaybetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveRaybetValorant";
    }

    @GetMapping("/live/raybet/dota")
    public String viewLiveRaybetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveRaybetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveRaybetDota";
    }

    @GetMapping("/live/raybet/lol")
    public String viewLiveRaybetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveRaybetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveRaybetLol";
    }

    @GetMapping("/live/raybet/valorant")
    public String viewLiveRaybetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveRaybetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveRaybetValorant";
    }

    @GetMapping("/line/raybet/cs")
    public String viewLineRaybetCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineRaybetCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineRaybetCs";
    }

    @GetMapping("/line/raybet/dota")
    public String viewLineRaybetDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineRaybetDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineRaybetDota";
    }

    @GetMapping("/line/raybet/lol")
    public String viewLineRaybetLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineRaybetLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineRaybetLol";
    }

    @GetMapping("/line/raybet/valorant")
    public String viewLineRaybetValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineRaybetValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineRaybetValorant";
    }

    @GetMapping("/live/tf/cs")
    public String viewLiveTFCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveTFCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveTFCs";
    }

    @GetMapping("/live/tf/dota")
    public String viewLiveTFDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveTFDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveTFDota";
    }

    @GetMapping("/live/tf/lol")
    public String viewLiveTFLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveTFLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveTFLol";
    }

    @GetMapping("/live/tf/valorant")
    public String viewLiveTFValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLiveTFValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLiveTFValorant";
    }

    @GetMapping("/line/tf/cs")
    public String viewLineTFCs(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineTFCs(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineTFCs";
    }

    @GetMapping("/line/tf/dota")
    public String viewLineTFDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineTFDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineTFDota";
    }

    @GetMapping("/line/tf/lol")
    public String viewLineTFLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineTFLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineTFLol";
    }

    @GetMapping("/line/tf/valorant")
    public String viewLineTFValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "100") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.DESC,
                "team1", "team2", "params",
                "bet_name", "date_request"));
        Page<Pars> parsPage = service.getLineTFValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
        return "gameLineTFValorant";
    }

//    @GetMapping("/live/cs")
//    public String viewLiveCS(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLiveCS(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/live/gameLive";
//        return "gameLive";
//    }
//
//    @GetMapping("/live/dota")
//    public String viewLiveDota(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLiveDota(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/live/gameLive";
//        return "gameLive";
//    }
//
//    @GetMapping("/live/valorant")
//    public String viewLiveValorant(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLiveValorant(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/live/gameLive";
//        return "gameLive";
//    }
//
//    @GetMapping("/live/lol")
//    public String viewLiveLol(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLiveLol(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/live/gameLive";
//        return "gameLive";
//    }

//    @GetMapping("/line/cs")
//    public String viewLineCS(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLineCS(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/line/gameLine";
//        return "gameLine";
//    }
//
//    @GetMapping("/line/dota")
//    public String viewLineDota(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLineDota(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/line/gameLine";
//        return "gameLine";
//    }
//
//    @GetMapping("/line/valorant")
//    public String viewLineValorant(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLineValorant(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/line/gameLine";
//        return "gameLine";
//    }
//
//    @GetMapping("/line/lol")
//    public String viewLineLol(
//            @RequestParam(value = "page", defaultValue = "1") int page,
//            @RequestParam(value = "size", defaultValue = "10") int pageSize,
//            Model model
//    ) {
//        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
//        Page<Pars> parsPage = service.getLineLol(pageRequest);
//        List<ParsDto> parsDtos = parsPage
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
////        return "/line/gameLine";
//        return "gameLine";
//    }

}
