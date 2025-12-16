package player;

import interfaces.Musica;
import interfaces.PlaylistIterator;

public class Player {

    private PlaylistIterator iterator;

    public Player(PlaylistIterator iterator) {
        this.iterator = iterator;
    }
    
    public void listarTodas() {
        System.out.println("Músicas da playlist:\n");

        while (iterator.hasNext()) {
            Musica musica = iterator.next();
            System.out.println("- " + musica.getNome());
        }
        
        iterator.reset();
    }

    public void proxima() {
        if (iterator.hasNext()) {
            Musica musica = iterator.next();
            musica.tocar();
        }
    }

    public void anterior() {
        Musica musica = iterator.previous();
        if (musica != null) {
            musica.tocar();
        }
    }
}