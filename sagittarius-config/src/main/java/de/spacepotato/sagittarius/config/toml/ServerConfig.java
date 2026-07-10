package de.spacepotato.sagittarius.config.toml;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerConfig {
	
	private String motd = "A Sagittarius Limbo Server";
	private int maxPlayers = 1;

}
