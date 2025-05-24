package com.vitordev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vitordev.dslist.dto.GameDTO;
import com.vitordev.dslist.dto.GameListDTO;
import com.vitordev.dslist.dto.GameMinDTO;
import com.vitordev.dslist.entities.Game;
import com.vitordev.dslist.entities.GameList;
import com.vitordev.dslist.repositories.GameListRepository;
import com.vitordev.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result =	gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}	
