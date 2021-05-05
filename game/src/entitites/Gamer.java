package entitites;

import abstracts.Entity;


import java.util.Date;
public class Gamer implements Entity {
	private int id;
    private String userName;
    private Date dateOfBirth;
    private String nationalityId;

    public Gamer(int id, String userName, Date dateOfBirth, String nationalityId) {
        this.id = id;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String userName) {
        this.userName = userName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
