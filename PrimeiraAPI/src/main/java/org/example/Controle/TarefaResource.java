package org.example.Controle;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.Modelos.Tarefa;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("tarefa")
public class TarefaResource {

    public static List<Tarefa> tarefas = new ArrayList<->(Arrays.asList(
            new Tarefa(1, "Estudar Java para melhorar minhas habilidades"),
            new Tarefa(2, "Estudar Python para melhorar minhas habilidades"),
            new Tarefa(3, "Estudar JavaScript para melhorar minhas habilidades")
    ));

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("page/{pages}")
    public List<Tarefa> getTarefasPaginadas(
            @PathParam("pages") int pages,
            @QueryParam("pageSize") int pageSize)
    {}



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("search")
    public List<Tarefa> searchTarefas(
            @QueryParam("Descricao") String descricao,
            @QueryParam("orderBy") String orderBy)
    {}


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")public Response getTarefa(@PathParam("id") int id){
        Tarefa t = tarefas.stream()
                .filter(tarefa -> tarefa.getId() == id)
                .findFirst()
                .orElse(null);

        if(t == null) {
            return Response.status(Response.Status.OK)
                    .header ("Access-Control-Allow-Origin", "*")
                    .header ("Access-Control-Allow-Credentials", "true")
                    .header ("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                    .header ("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
                    .entity(t).build();


        }
       return Response.status(Response.Status.NOT_FOUND)
                .header ("Access-Control-Allow-Origin", "*")
                .header ("Access-Control-Allow-Credentials", "true")
                .header ("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header ("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
                .build();
    }

    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTarefa(Tarefa novaTarefa){}

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTarefa(@PathParam("id") int id, Tarefa tarefaAtualizada){}


    @DELETE
    @Path("{id}")
    public void deleteTarefa(@PathParam("id") int id){
        tarefas.remove(terefa -> tarefa.getId() == id);

    }

    @OPTIONS
    public Response options(){
        return Response.ok()
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();}

}
