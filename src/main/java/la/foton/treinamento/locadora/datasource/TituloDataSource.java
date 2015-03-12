package la.foton.treinamento.locadora.datasource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import la.foton.treinamento.locadora.dto.TituloDTO;

public class TituloDataSource {
	
	
	public static List<TituloDTO> constroiListaTitulos()
	{
		String[] nomesTitulos = new String[]{"The Wizard of Oz (1939)",
				"Citizen Kane (1941)",
				"All About Eve (1950)",
				"The Third Man (1949)",
				"A Hard Day's Night (1964)",
				"Modern Times (1936)",
				"The Godfather (1972)",
				"Selma (2015)",
				"Metropolis (1927)",
				"Das Cabinet des Dr. Caligari. (The Cabinet of Dr. Caligari) (1920)",
				"Singin' in the Rain (1952)",
				"Laura (1944)",
				"The Adventures of Robin Hood (1938)",
				"Repulsion (1965)",
				"It Happened One Night (1934)",
				"E.T. The Extra-Terrestrial (1982)",
				"North by Northwest (1959)",
				"King Kong (1933)",
				"Sunset Boulevard (1950)",
				"Boyhood (2014)",
				"Rear Window (1954)",
				"La Battaglia di Algeri (The Battle of Algiers) (1967)",
				"The Maltese Falcon (1941)",
				"The Philadelphia Story (1940)",
				"Toy Story 2 (1999)",
				"The Bride of Frankenstein (1935)",
				"Rashômon (Rashomon) (In the Woods) (1951)",
				"The Godfather, Part II (1974)",
				"Toy Story 3 (2010)",
				"The Bicycle Thief (1949)",
				"M (1931)",
				"The Treasure of the Sierra Madre (1948)",
				"The 400 Blows (Les Quatre cents coups) (1959)",
				"Seven Samurai (Shichinin no Samurai) (1954)",
				"On the Waterfront (1954)",
				"Lawrence of Arabia (1962)",
				"Up (2009)",
				"Rebecca (1940)",
				"12 Angry Men (Twelve Angry Men) (1957)",
				"Apocalypse Now (1979)",
				"The Night of the Hunter (1955)",
				"Vertigo (1958)",
				"Dr. Strangelove Or How I Learned to Stop Worrying and Love the Bomb (1964)",
				"Frankenstein (1931)",
				"The Artist (2011)",
				"L.A. Confidential (1997)",
				"The Wrestler (2008)",
				"A Streetcar Named Desire (1951)",
				"The Hurt Locker (2009)",
				"The Conformist (1970)",
				"The 39 Steps (1935)",
				"Finding Nemo (2003)",
				"The Last Picture Show (1971)",
				"The Grapes of Wrath (1940)",
				"Pinocchio (1940)",
				"The Wages of Fear (1953)",
				"Jaws (1975)",
				"Toy Story (1995)",
				"Chinatown (1974)",
				"Anatomy of a Murder (1959)",
				"Man on Wire (2008)",
				"Battleship Potemkin (1925)",
				"The Rules of the Game (1950)",
				"The Leopard (1963)",
				"Annie Hall (1977)",
				"Roman Holiday (1953)",
				"The Best Years of Our Lives (1946)",
				"Taxi Driver (1976)",
				"The Gold Rush (1925)",
				"The Searchers (1956)",
				"Cool Hand Luke (1967)",
				"Rosemary's Baby (1968)",
				"Sweet Smell of Success (1957)",
				"Mary Poppins (1964)",
				"Playtime (Play Time) (1967)",
				"Before Midnight (2013)",
				"Paddington (2015)",
				"Let the Right One In (2008)",
				"Short Term 12 (2013)",
				"The Terminator (1984)",
				"The French Connection (1971)",
				"Mr. Turner (2014)",
				"City Lights (1931)",
				"The Wild Bunch (1969)",
				"Raging Bull (1980)",
				"Mud (2013)",
				"Invasion of the Body Snatchers (1956)",
				"Badlands (1974)",
				"Kumonosu Jô (Throne of Blood) (Macbeth) (1957)",
				"The Babadook (2014)",
				"Airplane! (1980)",
				"Aliens (1986)",
				"The Discreet Charm Of The Bourgeoisie (Le Charme Discret de la Bourgeoisie) (1972)",
				"How to Train Your Dragon (2010)",
				"Mean Streets (1973)",
				"The Manchurian Candidate (1962)",
				"The Conversation (1974)",
				"Once Upon a Time in the West (1968)",
				"Eyes Without a Face (1962)",
				"Gloria (2014)"
		};
		
		List<TituloDTO> titulos = new ArrayList<>();
		for(String nomeTitulo :nomesTitulos)
		{
			titulos.add(new TituloDTO(nomeTitulo, new Random().nextDouble(), new Date(new Random().nextInt() - new Date().getTime())));
		}
		
		return titulos;
	}
}
