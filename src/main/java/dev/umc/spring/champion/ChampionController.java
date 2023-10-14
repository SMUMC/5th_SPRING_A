package dev.umc.spring.champion;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ChampionController {

    private final ChampionService championService;

    @PostMapping("/api/champion")
    public Long save(Champion champion) {
        Long saveId = championService.save(champion);
        return saveId;
    }
}
