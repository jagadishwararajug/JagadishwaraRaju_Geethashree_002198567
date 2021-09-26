/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author geeth
 */
public class Profile {
    
    private String name;
    private String geoData;
    private String dob;
    private String telNum;
    private String faxNum;
    private String emailId;
    private String ssn;
    private String medRecNum;
    private String hlthPlnBenNum;
    private String bnkAccNum;
    private String crtLicNum;
    private String vclIdSlNumIncLicPl;
    private String devIdSlNum;
    private String linkedin;
    private String ipAdd;
    private String uniqueId;
    private File image;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(name == null || name.equals("")){
            return false;
        }
        if(name.matches("[a-zA-Z ]+")){
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public String getGeoData() {
        return geoData;
    }

    public boolean setGeoData(String geoData) {
        if (geoData==null || geoData.equals("")){
            return false;
        }
        if(geoData.matches("[a-zA-Z0-9.,#\\- ]+")){
            this.geoData = geoData;
            return true;
        }
        return false;
    }

    public String getDob() {
        return dob;
    }

    public boolean setDob(String dob) {
        if(dob == null || dob.equals("")){
            return false;
        }
        if(dob.matches("[0-9][0-9][/-][0-9][0-9][/-][0-9][0-9][0-9][0-9]")){
            int date = Integer.parseInt(dob.substring(0, 2));
            int month = Integer.parseInt(dob.substring(3, 5));
            int year = Integer.parseInt(dob.substring(6, 10));
            
            if (year > 2021) 
                return false;
            if (month > 12)
                return false;
            else if(month == 2) {
                if ((year % 4 == 0) && (date > 29)){
                    //leap year
                    return false;
                } else if (date > 28) {
                    return false;
                }
            } else if (((month == 1) || (month == 3) || (month == 5) || 
                    (month == 7) || (month == 8) || (month == 10) || (month == 12)) && date > 31 )
                return false;
            else if (date > 30) 
                return false;
                    
            this.dob = dob;
            return true; 
        }
        else{
            return false;
        }
    }

    public String getTelNum() {
        return telNum;
    }

    public boolean setTelNum(String telNum) {
        if(telNum==null || telNum.equals("")){
            return false;
        }
        if(telNum.matches("[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
            this.telNum = telNum;
            return true;
        }
        return false;
    }

    public String getFaxNum() {
        return faxNum;
    }

    public boolean setFaxNum(String faxNum) {
        if(faxNum == null || faxNum.equals("")){
            return false;
        }
        if(faxNum.matches("[0-9]+")){
            this.faxNum = faxNum;
            return true;
        }
       return false;
    }

    public String getEmailId() {
        return emailId;
    }

    public boolean setEmailId(String emailId) {
        if(emailId == null || emailId.equals("")){
            return false;
        }
        if(emailId.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+")){
            this.emailId = emailId;
            return true;
        }
        return false;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean setSsn(String ssn) {
        if(ssn==null || ssn.equals("")){
            return false;
        }
        if(ssn.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
            this.ssn = ssn;
            return true;
        }
        return false;
    }

    public String getMedRecNum() {
        return medRecNum;
    }

    public boolean setMedRecNum(String medRecNum) {
        if(medRecNum==null || medRecNum.equals("")){
            return false;
          
        }
        if(medRecNum.matches("[a-zA-Z0-9 ]+")){
            this.medRecNum = medRecNum;
            return true;
            
        }
        return false;
    }

    public String getHlthPlnBenNum() {
        return hlthPlnBenNum;
    }

    public boolean setHlthPlnBenNum(String hlthPlnBenNum) {
        if(hlthPlnBenNum==null || hlthPlnBenNum.equals("")){
            return false;          
        }
        if(hlthPlnBenNum.matches("[a-zA-Z0-9]+")){
            this.hlthPlnBenNum = hlthPlnBenNum;
            return true;
            
        }
        return false;
    }

    public String getBnkAccNum() {
        return bnkAccNum;
    }

    public boolean setBnkAccNum(String bnkAccNum) {
        if(bnkAccNum==null || bnkAccNum.equals("")){
            return false;          
        }
        if(bnkAccNum.matches("[0-9]+")){
            this.bnkAccNum = bnkAccNum;
            return true;
            
        }
        return false;
    }

    public String getCrtLicNum() {
        return crtLicNum;
    }

    public boolean setCrtLicNum(String crtLicNum) {
        if(crtLicNum==null || crtLicNum.equals("")){
            return false;          
        }
        if(crtLicNum.matches("[a-zA-Z0-9 ]+")){
            this.crtLicNum = crtLicNum;
            return true;
            
        }
        return false;
    }

    public String getVclIdSlNumIncLicPl() {
        return vclIdSlNumIncLicPl;
    }

    public boolean setVclIdSlNumIncLicPl(String vclIdSlNumIncLicPl) {
        if(vclIdSlNumIncLicPl==null || vclIdSlNumIncLicPl.equals("")){
            return false;          
        }
        if(vclIdSlNumIncLicPl.matches("[a-zA-Z0-9 ]+")){
            this.vclIdSlNumIncLicPl = vclIdSlNumIncLicPl;
            return true;
            
        }
        return false;
    }

    public String getDevIdSlNum() {
        return devIdSlNum;
    }

    public boolean setDevIdSlNum(String devIdSlNum) {
       if(devIdSlNum==null || devIdSlNum.equals("")){
            return false;          
        }
        if(devIdSlNum.matches("[a-zA-Z0-9 ]+")){
            this.devIdSlNum = devIdSlNum;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String getLinkedin() {
        return linkedin;
    }

    public boolean setLinkedin(String linkedin) {
        if(linkedin==null || linkedin.equals("")){
            return false;          
        }
        if(linkedin.matches("https://www.linkedin.com/in/[a-zA-Z0-9]+")){
            this.linkedin = linkedin;
            return true;
        }
        return false;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public boolean setIpAdd(String ipAdd) {
        if(ipAdd==null || ipAdd.equals("")){
            return false;          
        }
        if(ipAdd.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")){
            this.ipAdd = ipAdd;
            return true;
        }
        return false;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public boolean setUniqueId(String uniqueId) {
        if(uniqueId==null || uniqueId.equals("")){
            return false;          
        }
        if(uniqueId.matches("[a-zA-Z0-9 ]+")){
            this.uniqueId = uniqueId;
            return true;
        }
        return false;
    }

    public File getImage() {
        return image;
    }

    public boolean setImage(String imagePath) {
        if (imagePath == null || imagePath.trim().equals(""))
            return false;
        File image = new File(imagePath);
        if (Files.exists(image.toPath()) == false)
            return false;
        this.image = image;
        return true;
    }
    
}
