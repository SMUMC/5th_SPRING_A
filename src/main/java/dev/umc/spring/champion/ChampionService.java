package dev.umc.spring.champion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChampionService {

    private final ChampionRepository championRepository;

    public Long save(Champion champion) {
        Champion save = championRepository.save(champion);
        return save.getId();
    }
}
