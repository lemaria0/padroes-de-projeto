package interfaces;

public interface PlaylistIterator {
    boolean hasNext();
    boolean hasPrevious();
    Musica next();
    Musica previous();
    void reset();
}