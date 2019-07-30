package br.com.example.bean;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * SimpleRest
 */

@Path("/")
public class SimpleRest {

    @Inject
    private MyBean myBean;

    @GET
    @Path("/find")
    @Produces(MediaType.TEXT_PLAIN)
    public String check() {
        return myBean.getCount().toString();
    }

    @GET
    @Path("/add")
    public void add() throws Exception{
        myBean.add();
        throw new Exception();
    }
    
}