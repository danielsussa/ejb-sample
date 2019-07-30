package br.com.example.exception;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * BaseExceptionMapper
 */
@Provider
public class BaseExceptionMapper implements ExceptionMapper<Exception>{

    @Override
    public Response toResponse(Exception exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage())
                .type(MediaType.APPLICATION_JSON).build();
    }
}