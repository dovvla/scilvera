/**
    Use this file to implement business logic. This file will be preserved
    during next compilations.

    Generated by: silvera
    Date: 2022-05-22 03:03:00
*/

package com.silvera.Scipaper.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.silvera.Scipaper.domain.model.*;
import com.silvera.Scipaper.service.base.*;
import com.silvera.Scipaper.repository.*;
import com.silvera.Scipaper.messages.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;


@Service
public class ScipaperService implements IScipaperService {

    

    

    @Autowired
    KafkaTemplate<String, com.silvera.Scipaper.messages.papermsggroup.PaperPublished> papermsggroupPaperPublishedKafkaTemplate;
    

    // Auto-generated CRUD methods
    


    
    @Override
    public Paper publishPaper(java.lang.Integer id){
        /*
            TODO: Implement this function!!!
        */
        // Uncomment to publish the message
        //com.silvera.Scipaper.messages.papermsggroup.PaperPublished msg = new com.silvera.Scipaper.messages.papermsggroup.PaperPublished();
        // Here set values to the message attributes:
        // ------------------------------------------

        // ------------------------------------------
        //papermsggroupPaperPublishedKafkaTemplate.send("EV_PAPER_PUBLISHED_CHANNEL", msg);
        

        throw new java.lang.UnsupportedOperationException("Not implemented yet.");
    }
    

    

}