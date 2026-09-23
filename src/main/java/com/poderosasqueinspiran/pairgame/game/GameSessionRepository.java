package com.poderosasqueinspiran.pairgame.game;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GameSessionRepository extends JpaRepository<GameSession, Long>{
    List<GameSession> findByUserIdOrderByCreatedAtDesc(Long userId);
    List<GameSession> findByStatusOrderByScoreDesc(GameSessionStatus status);
}
