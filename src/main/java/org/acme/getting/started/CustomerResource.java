package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/customer")
public class CustomerResource {

    @Inject
    CustomerService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sales/{categorie}")
    public String disccount(@PathParam String categorie) {
        return service.disccount(categorie);
    }
}
