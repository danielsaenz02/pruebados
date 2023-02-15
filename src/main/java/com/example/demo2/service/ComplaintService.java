package com.example.demo2.service;

import com.example.demo2.entity.Complaint;
import com.example.demo2.repository.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    @Autowired
    private IComplaintService iComplaintService;

    public Complaint findById(Long idComplaint){
        return iComplaintService.findById(idComplaint).orElse(null);
    }

    public void updateComplaintById(Integer idComplaint){
         iComplaintService.updateComplaint(idComplaint);
    }
}
