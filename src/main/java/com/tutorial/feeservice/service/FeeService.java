package com.tutorial.feeservice.service;

import com.tutorial.feeservice.entity.FeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class FeeService {

    public FeeEntity getFee(Integer optionFee){

        //Creamos nuestro objeto tarifa
        FeeEntity feeEntity = new FeeEntity();

        // Vamos a conseguir los valores de cada opción de tarifa, la duración y las vueltas posibles
        int tarifaBase = 0;
        int duracionReservaMin = 0;
        int vueltas = 0;

        //Aquí aplicamos una tarifa
        switch (optionFee) {
            case 1:
                tarifaBase = 15000;
                duracionReservaMin = 30;
                vueltas = 10;
                break;
            case 2:
                tarifaBase = 20000;
                duracionReservaMin = 35;
                vueltas = 15;
                break;
            case 3:
                tarifaBase = 25000;
                duracionReservaMin = 40;
                vueltas = 20;
                break;
            default:
                throw new RuntimeException("Opción de tarifa inválida.");
        }

        //Ahora vamos a setear nuestra tarifa
        feeEntity.setFeeBase(tarifaBase);
        feeEntity.setBookingReservationMin(duracionReservaMin);
        feeEntity.setRound(vueltas);

        return feeEntity;
    }
}
