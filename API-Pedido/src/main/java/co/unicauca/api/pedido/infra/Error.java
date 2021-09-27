/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.api.pedido.infra;

import co.unicauca.api.pedido.domain.validators.ValidationError;

/**
 *
 * @author Beca98
 */
public class Error
{
      /**
     * Codigo de error. Ejemplos: EMPTY_FIELD, INVALID_FIELD
     */
    public final ValidationError code;
    /**
     * Campo del dominio que tiene el error
     */
    public final String field;
    /**
     * Descripción del error.
     */
    public final String description;

    /**
     * Constructor parametrizado
     *
     * @param code codigo de error
     * @param field campo
     * @param description descripción
     */
    public Error(ValidationError code, String field, String description) {
        this.code = code;
        this.field = field;
        this.description = description;
    }
    
}
