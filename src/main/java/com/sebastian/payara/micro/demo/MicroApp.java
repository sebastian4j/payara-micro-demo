package com.sebastian.payara.micro.demo;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Sebastian Avila A.
 */
@ApplicationPath("/")
public class MicroApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> clases = new HashSet<>();
        clases.add(MicroRecursos.class);
        return clases;
    }    
}
