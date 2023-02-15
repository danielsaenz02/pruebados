package com.example.demo2.service;


import com.example.demo2.repository.IAnexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnexoService {
    @Autowired
    private IAnexoService iAnexoService;

    public void saveAnexo(Integer idComplaint, String name){
         iAnexoService.saveAnexo(idComplaint,name);
    }


}
