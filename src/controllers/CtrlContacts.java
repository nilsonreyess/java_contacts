
package controllers;

import java.util.ArrayList;
import models.Contacts;
import models.MdlContacts;

public class CtrlContacts {
    MdlContacts mdlContact = new MdlContacts();
    
    public ArrayList<Contacts> getContacts() {
        ArrayList<Contacts> contacts = mdlContact.getContacts();
        
        return contacts;
    }
    
    public boolean saveContact(Contacts contact) {
        boolean save = false;
        int rs = mdlContact.saveContact(contact);
        if (rs > 0) {
            save = true;
        }
        
        return save;
    }
    
    public boolean updateContact(Contacts contact, int id) {
        boolean update = false;
        int rs = mdlContact.updateContact(contact, id);
        if (rs > 0) {
            update = true;
        }
        
        return update;
    }
    
    public boolean deleteContact(int id) {
        boolean update = false;
        int rs = mdlContact.deleteContact(id);
        if (rs > 0) {
            update = true;
        }
        
        return update;
    }
}
