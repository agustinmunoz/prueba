package com.sanitas.prueba.business.impl;


import com.sanitas.prueba.business.ICalculadora;

import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements ICalculadora {



    @Override
    public double Sumar(double sumando1, double sumando2) {

        double resultado=sumando1+sumando2;
        printResult(resultado);
        return resultado;
    }

    @Override
    public double Restar(double minuendo, double sustraendo) {
        double resultado=minuendo-sustraendo;
        printResult(resultado);
        return resultado;
    }


    private void printResult(double resultado){

        TracerImpl tracer = new TracerImpl();
        tracer.trace(resultado);

    }
}
