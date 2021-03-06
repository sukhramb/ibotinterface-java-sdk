package com.bankofapis.core.model.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class OBReadAccountInformation {

    @JsonProperty("AccountId")
    private String accountId;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("AccountType")
    private String accountType;

    @JsonProperty("AccountSubType")
    private String accountSubType;

    @JsonProperty("Description")
    private String description;
    
    @JsonProperty("brand")
    private String brand;
    
    @JsonProperty("termInMonths")
    private String termInMonths;
    
    @JsonProperty("rateOfInterest")
    private String rateOfInterest;

    @JsonProperty("Nickname")
    private String nickname;

    @JsonProperty("Account")
    private List<OBReadAccount> account = null;
    
    @JsonProperty("balances")
    private List<OBReadBalance> balances = null;
    
    @JsonProperty("StandingOrder")
    private List<OBReadStandingOrder> standingOrderList = null;

  
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(String accountSubType) {
        this.accountSubType = accountSubType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTermInMonths() {
		return termInMonths;
	}

	public void setTermInMonths(String termInMonths) {
		this.termInMonths = termInMonths;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<OBReadAccount> getAccount() {
        return account;
    }

    public void setAccount(List<OBReadAccount> account) {
        this.account = account;
    }

	public List<OBReadBalance> getBalances() {
		return balances;
	}

	public void setBalances(List<OBReadBalance> balances) {
		this.balances = balances;
	}
	
	 public List<OBReadStandingOrder> getStandingOrderList() {
	        return standingOrderList;
    }

    public void setStandingOrderList(List<OBReadStandingOrder> standingOrderList) {
        this.standingOrderList = standingOrderList;
    }

}