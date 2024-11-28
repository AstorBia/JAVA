import Entidades.T_Album;
import Entidades.T_AudioBook;
import Entidades.T_Autor;
import Operacional.Menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        List<T_Album> albuns = new ArrayList<>();
        List<T_Autor> autores = new ArrayList<>();
        List<T_AudioBook> audioBooks = new ArrayList<>();

            try{
                logger.info(">> Sistema de AudioBook do Spotify Iniciado <<");

                menu.mostraMenu(scanner);

            } catch (Exception e) {
                e.printStackTrace();
                logger.fatal("Erro fatal: "+ e.getMessage() + "-" + Arrays.toString(e.getStackTrace()));
            }
    }
}