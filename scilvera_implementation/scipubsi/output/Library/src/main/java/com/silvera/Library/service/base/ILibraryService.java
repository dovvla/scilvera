/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-22 12:12:03
*/

package com.silvera.Library.service.base;

import com.silvera.Library.dto.PublishLogWithPaperDto;
import org.springframework.stereotype.Service;
import com.silvera.Library.domain.model.*;
import com.silvera.Library.messages.*;
import org.springframework.beans.factory.annotation.Autowired;


public interface ILibraryService {

    // Auto-generated CRUD methods
    

    
    public java.util.List<PublishLogWithPaperDto> listPublishLogs();
    

    
    
    public void paperPublished(com.silvera.Library.messages.papermsggroup.PaperPublished message);
    
    

}