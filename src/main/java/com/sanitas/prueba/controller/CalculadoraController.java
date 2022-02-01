package com.sanitas.prueba.controller;

import com.sanitas.prueba.business.ICalculadora;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @Api(description = "Prueba Sanitas")
    public class CalculadoraController {

        private static Logger logger = LoggerFactory.getLogger(CalculadoraController.class);

        @Autowired
        ICalculadora calculadora;

        @ApiOperation(value = "Operación Suma")
        @GetMapping("/operacion/suma/{sumando1}/{sumando2}")
        public double Sumar(
                @PathVariable double sumando1,
                @PathVariable double sumando2
        ) {
            logger.info("Operacion Suma");
            double result= calculadora.Sumar(sumando1, sumando2);
            return result;
        }


    }
