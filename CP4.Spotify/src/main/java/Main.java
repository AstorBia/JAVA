import Entidades.Album;
import Entidades.AudioBook;
import Entidades.Autor;
import Entidades.Menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        Menu menu = new Menu();
        List<Album> albuns = new ArrayList<>();
        List<Autor> autores = new ArrayList<>();
        List<AudioBook> audioBooks = new ArrayList<>();

            try{
                logger.info(">> Sistema de AudioBook do Spotify Iniciado <<");

                menu.mostraMenu(new Scanner(System.in), albuns, autores, audioBooks);

            } catch (Exception e) {
                e.printStackTrace();
                logger.fatal("Erro fatal: "+ e.getMessage() + "-" + Arrays.toString(e.getStackTrace()));
            }


    }
}