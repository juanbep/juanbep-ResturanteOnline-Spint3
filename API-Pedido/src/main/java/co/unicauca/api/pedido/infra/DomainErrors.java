/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.infra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beca98
 */
public class DomainErrors 
{
    private static List<Error> errors = new ArrayList<>();

    public static List<Error> getErrors() {
        return errors;
    }

    public static void setErrors(List<Error> errors) {
       DomainErrors.errors = errors;
    }
    
}
