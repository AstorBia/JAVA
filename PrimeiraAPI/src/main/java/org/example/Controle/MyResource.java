package org.example.Controle;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.Modelos.JsonTest;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonTest getIt() {

        return  new JsonTest (0, "Go it!");
    }
                        /// NAO SEI PQ INVERTEU AQUI

    @GET
    @Path("novaRota")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonTest novaRota() {
        return new JsonTest(1, "Nova Rota");
    }
}
