package collection;

import interfaces.Musica;
import interfaces.PlaylistIterator;
import iterator.PlaylistIteratorImpl;
import java.util.List;

public class Playlist {

    private List<Musica> musicas;

    public Playlist(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public PlaylistIterator createIterator() {
        return new PlaylistIteratorImpl(musicas);
    }
}