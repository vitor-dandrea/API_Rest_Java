package com.vitordev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitordev.dslist.entities.Game;
import com.vitordev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
