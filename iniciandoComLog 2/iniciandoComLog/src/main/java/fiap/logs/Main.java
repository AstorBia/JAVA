package fiap.logs;

import com.google.gson.Gson;
import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//                            // Para obter um Objeto essa "resposta" foi alterada
//        HttpResponse<String> response =
//                            // AQUI PRECISA PEGAR OUTRO LINK rsrs ESSA ESTA ACUSANDO ERRO, PORÉM O CÓGICO RODA
//                Unirest.get("https://api.openweathermap.org/data/2.5/weather?q=Madri&appid=5e7014977e90cf7a2cc5f38cd825c6cd")
//            .asString();


        // a CONVERSÃO - de Json para JAVA para manipular os dados

        var currentData =
                Unirest.get("https://api.openweathermap.org/data/2.5/weather?q=Madri&appid=5e7014977e90cf7a2cc5f38cd825c6cd")
                    .asObject(CurrentWeatherDataDTOs.Main.class).getBody();



        System.out.println(currentData.main().temp());


        // para isso foi feito uma conversão de String para Objeto

        // lembrando que as temperaturas estão em Kelvin
        if(currentData.main().temp() > 293){
            System.out.println("Está quente");
        }
        else{
            System.out.println("Está frio");
        }
        // aqui é apenas uma regra de exemplo de manipulação de API
        // o MAIN está acusando erro, mas não sei por que

    }
}



// ==== códio da aula passada - 28/08 =====

//public static Logger logger = LogManager.getLogger(Main.class);
//
//    public static void main(String[] args) {
//
//        var novaPessoa = new Pessoa("Fernanda", 19,new String[]{"1166776", "2366"},new ArrayList<>());
//
//        var novoEndereco = new Endereco("Rua 1","12","Bairro 1", "Cidade 1", novaPessoa);
//
//        novaPessoa.getEndereco().add(novoEndereco);
//
//        var json = new Gson().toJson(novaPessoa);
//        System.out.println(json);
//
//        var obj = new Gson().fromJson(
//                json,
//                Pessoa.class);
//        System.out.println(obj.toString());