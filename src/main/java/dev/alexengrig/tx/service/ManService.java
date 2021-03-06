package dev.alexengrig.tx.service;

import dev.alexengrig.tx.domain.Man;
import dev.alexengrig.tx.exception.NotFreeManException;

public interface ManService {
    Man create(String name);

    Man get(Long manId);

    Man update(Long manId, String name);

    void link(Long manId, Long anotherManId) throws NotFreeManException;
}
