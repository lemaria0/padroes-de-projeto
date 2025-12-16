package app;

import collection.Playlist;
import interfaces.Musica;
import interfaces.PlaylistIterator;
import java.util.ArrayList;
import java.util.List;
import player.Player;
import songs.MusicaMP3;
import songs.MusicaStream;

public class Main {

    public static void main(String[] args) {

        // -------- PLAYLIST LOCAL --------
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new MusicaMP3("Shape of You"));
        musicas.add(new MusicaMP3("Bohemian Rhapsody"));
        musicas.add(new MusicaMP3("Waiting For The Night"));
        musicas.add(new MusicaMP3("Year Zero"));

        Playlist playlistLocal = new Playlist(musicas);
        PlaylistIterator iteratorLocal = playlistLocal.createIterator();

        System.out.println("Testando playlist local:");
        Player player1 = new Player(iteratorLocal);
        
        player1.listarTodas();
        System.out.println("\n");
        player1.proxima();
        player1.proxima();
        player1.proxima();


        // -------- PLAYLIST STREAM --------
        List<Musica> musicasStream = new ArrayList<>();
        musicasStream.add(new MusicaStream("https://flowers"));
        musicasStream.add(new MusicaStream("https://shivers"));

        Playlist playlistStream = new Playlist(musicasStream);
        PlaylistIterator iteratorStream = playlistStream.createIterator();

        System.out.println("\n Testando playlist streaming:");
        Player player2 = new Player(iteratorStream);
        
        player2.listarTodas();
        player2.proxima();
        player2.proxima();
        player2.proxima();
    }
}