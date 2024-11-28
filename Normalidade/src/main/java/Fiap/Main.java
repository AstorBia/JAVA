package Fiap;

import com.google.gson.Gson;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    var novaPessoa = new Pessoa("Astor", 20, new String[] {"12345678", "09876543"}, new ArrayList<>());

    var novoEndereco = new Endereco( "Rua 21", "234", "Bairro 45", "cidade 98", novaPessoa);


    novaPessoa.getEnderecos().add(novoEndereco);






//    //NORMALIZAÇÃO
//    var json = new Gson().toJson(novaPessoa);
//    System.out.println(json);
//
//    // DESNORMALIZAÇÃO
//    var obj = new Gson().fromJson(
//            json,
//            Pessoa.class);
//        System.out.println(obj.toString());

    }
}