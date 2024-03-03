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

    @GetMapping("/live/cs")
    public String viewLiveCS(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLiveCS(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/live/gameLive";
        return "gameLive";
    }

    @GetMapping("/live/dota")
    public String viewLiveDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLiveDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/live/gameLive";
        return "gameLive";
    }

    @GetMapping("/live/valorant")
    public String viewLiveValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLiveValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/live/gameLive";
        return "gameLive";
    }

    @GetMapping("/live/lol")
    public String viewLiveLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLiveLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/live/gameLive";
        return "gameLive";
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

    @GetMapping("/line/cs")
    public String viewLineCS(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLineCS(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/line/gameLine";
        return "gameLine";
    }

    @GetMapping("/line/dota")
    public String viewLineDota(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLineDota(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/line/gameLine";
        return "gameLine";
    }

    @GetMapping("/line/valorant")
    public String viewLineValorant(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLineValorant(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/line/gameLine";
        return "gameLine";
    }

    @GetMapping("/line/lol")
    public String viewLineLol(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int pageSize,
            Model model
    ) {
        PageRequest pageRequest = PageRequest.of(page-1, pageSize, Sort.by(Sort.Direction.ASC, "dateMatch"));
        Page<Pars> parsPage = service.getLineLol(pageRequest);
        List<ParsDto> parsDtos = parsPage
                .stream()
                .map(mapper::toDto)
                .toList();
        model.addAttribute("parses", new PageImpl<>(parsDtos, pageRequest, parsPage.getTotalElements()));
//        return "/line/gameLine";
        return "gameLine";
    }

}
