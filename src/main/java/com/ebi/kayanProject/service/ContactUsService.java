package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.ContactUsEntity;
import com.ebi.kayanProject.model.ContactUsDto;
import com.ebi.kayanProject.repo.ContactUsRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService implements ContactUsServiceInt{

    private  final ContactUsRepoInt contactUsRepo;
    private final ModelMapper modelMapper =new ModelMapper();
    @Autowired
    public ContactUsService(ContactUsRepoInt contactUsRepo) {
        this.contactUsRepo = contactUsRepo;
    }

    @Override
    public void SendMessage(ContactUsDto contactUsDto) {


        contactUsRepo.save(modelMapper.map(contactUsDto, ContactUsEntity.class));

    }



}
