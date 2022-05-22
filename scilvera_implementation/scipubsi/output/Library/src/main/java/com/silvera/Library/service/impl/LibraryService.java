/**
    Use this file to implement business logic. This file will be preserved
    during next compilations.

    Generated by: silvera
    Date: 2022-05-22 03:03:00
*/

package com.silvera.Library.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.silvera.Library.domain.model.*;
import com.silvera.Library.service.base.*;
import com.silvera.Library.repository.*;
import com.silvera.Library.messages.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;


@Service
public class LibraryService implements ILibraryService {

    

    

    @Autowired
    PublishLogRepository publishLogRepository;
    // Auto-generated CRUD methods

    @Autowired
    PaperRepository paperRepository;
    


    
    @Override
    public java.util.List<PublishLog> listPublishLogs(){
        return publishLogRepository.findAll();


    }
    

    
    
    @Override
    public void paperPublished(com.silvera.Library.messages.papermsggroup.PaperPublished message){
        PublishLog publishLog = new PublishLog();
        publishLog.setPaperId(Integer.valueOf(message.getPaperId()));
        publishLog.setAuthor(message.getAuthor());
        publishLog.setTitle(message.getTitle());

        publishLogRepository.save(publishLog);

    }
    
    

}