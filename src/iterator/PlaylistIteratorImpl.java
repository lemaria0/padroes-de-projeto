package iterator;

import interfaces.Musica;
import interfaces.PlaylistIterator;
import java.util.List;

public class PlaylistIteratorImpl implements PlaylistIterator {

    private List<Musica> musicas;
    private int position = 0;

    public PlaylistIteratorImpl(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        return position < musicas.size();
    }

    @Override
    public Musica next() {
        return musicas.get(position++);
    }

    @Override
    public boolean hasPrevious() {
        return position > 0;
    }

    @Override
    public Musica previous() {
        return musicas.get(--position);
    }

    @Override
    public void reset() {
        position = 0;
    }
}