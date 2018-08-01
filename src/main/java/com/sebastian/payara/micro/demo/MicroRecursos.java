package com.sebastian.payara.micro.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Sebastian Avila A.
 */
@Path("/")
public class MicroRecursos {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String microEndpoint() {
        return "micro-endpoint";
    }
}
