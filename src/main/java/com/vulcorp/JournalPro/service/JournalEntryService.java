package com.vulcorp.JournalPro.service;

import com.vulcorp.JournalPro.entity.JournalEntry;
import com.vulcorp.JournalPro.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

     @Autowired
    private JournalEntryRepo journalEntryRepo;

     public void saveEntry(JournalEntry journalEntry){

         journalEntryRepo.save(journalEntry);
     }
    public List<JournalEntry> getAll(){
         return journalEntryRepo.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId myId) {
         return journalEntryRepo.findById(myId);
    }
    public void deleteById(ObjectId myId) {
         journalEntryRepo.deleteById(myId);
    }
}
//controller -> service --> reporsitory