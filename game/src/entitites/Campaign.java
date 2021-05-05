package entitites;
import java.util.Date;

import abstracts.Entity;

public class Campaign implements Entity {
	  private int id;
	    private String campaignCode;
	    private double discount;
	    private Date validityDate;

	    public Campaign(int id, String campaignCode, double discount, Date validityDate) {
	        this.id = id;
	        this.campaignCode = campaignCode;
	        this.discount = discount;
	        this.validityDate = validityDate;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getCampaignCode() {
	        return campaignCode;
	    }

	    public void setCampaignCode(String campaignCode) {
	        this.campaignCode = campaignCode;
	    }

	    public double getDiscount() {
	        return discount;
	    }

	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }

	    public Date getValidityDate() {
	        return validityDate;
	    }

	    public void setValidityDate(Date validityDate) {
	        this.validityDate = validityDate;
	    }
}
