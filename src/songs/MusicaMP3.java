package songs;
import interfaces.Musica;

public class MusicaMP3 implements Musica {

    private String nome;

    public MusicaMP3(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando MP3: " + nome);
    }

    @Override
    public String getNome() {
        return nome;
    }
}