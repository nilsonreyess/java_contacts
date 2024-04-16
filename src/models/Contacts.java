
package models;

public class Contacts {
    private int id;
    private String document;
    private String fullname;
    private String email;
    private String smartphone;

    public Contacts(String document, String fullname, String email, String smartphone) {
        this.document = document;
        this.fullname = fullname;
        this.email = email;
        this.smartphone = smartphone;
    }
    
    public Contacts(int id, String document, String fullname, String email, String smartphone) {
        this.id = id;
        this.document = document;
        this.fullname = fullname;
        this.email = email;
        this.smartphone = smartphone;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(String smartphone) {
        this.smartphone = smartphone;
    }
    
}
