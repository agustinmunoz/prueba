package com.sanitas.prueba.controller;

import com.sanitas.prueba.api.ResultadoDTO;
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
        @GetMapping(value="/operacion/suma/{sumando1}/{sumando2}",produces = { "application/json" })
        public ResultadoDTO Sumar(
                @PathVariable double sumando1,
                @PathVariable double sumando2
        ) {
            logger.info("Operacion Suma");
            double result= calculadora.Sumar(sumando1, sumando2);
            ResultadoDTO resultadoDTO = new ResultadoDTO();
            resultadoDTO.setResultado(result);
            return resultadoDTO;
        }

        @ApiOperation(value = "Operación Resta")
        @GetMapping(value = "/operacion/resta/{minuendo}/{sustraendo}", produces = { "application/json" })
        public ResultadoDTO Restar(
                @PathVariable double minuendo,
                @PathVariable double sustraendo
        ) {
            logger.info("Operacion Resta");
            double result= calculadora.Restar(minuendo,sustraendo);
            ResultadoDTO resultadoDTO = new ResultadoDTO();
            resultadoDTO.setResultado(result);
            return resultadoDTO;
        }


    }
