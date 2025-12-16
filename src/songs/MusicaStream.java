package songs;
import interfaces.Musica;

public class MusicaStream implements Musica {

    private String url;

    public MusicaStream(String url) {
        this.url = url;
    }

    @Override
    public void tocar() {
        System.out.println("Transmitindo música de: " + url);
    }

    @Override
    public String getNome() {
        return url;
    }
}