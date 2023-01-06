package Utils;

import TestAutomation.glue.Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;

public class ConfigReader {

    public static Properties getPropertyObject() throws IOException {
        FileInputStream fp = new FileInputStream("Config/Configuration.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }

    public static String getSuperAdminUserName() throws IOException {
        return getPropertyObject().getProperty("SuperAdminUserName");
    }


    public static String getSuperAdminPassword() throws IOException {
        return getPropertyObject().getProperty("SuperAdminPassword");
    }

    public static String OrgName() throws IOException {

        String orgname = getPropertyObject().getProperty("Orgname");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy-hh-mm");
        String strDate = formatter.format(date);

        orgname = orgname+"-"+strDate;
        System.out.println(orgname);

        Hooks.setOrgName(orgname);

        return orgname;
    }

    public static String getUsername() throws IOException {
         //String Maild = "@mailinator.com";
        String username = getPropertyObject().getProperty("username");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
        String strDate = formatter.format(date);
        username = username+"-"+strDate;
        System.out.println(username);
        Hooks.setUsername(username);
        return username;

//        return getPropertyObject().getProperty("username");
    }


    public static String getPassword() throws IOException {
        return getPropertyObject().getProperty("password");
    }

    public static String getSpecialityandService() throws IOException {
        return getPropertyObject().getProperty("SpecialityandServices");
    }

    public static String getUsername2() throws IOException {
        String username1 = getPropertyObject().getProperty("username2");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
        String strDate = formatter.format(date);
        username1 = username1+"-"+strDate;
        System.out.println(username1);
        Hooks.setUsername1(username1);
        return username1;

//        return getPropertyObject().getProperty("username1");
    }

    public static String patientname() throws IOException {
        String patientfirstname = getPropertyObject().getProperty("Patientfirstname");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
        String strDate = formatter.format(date);
        patientfirstname=patientfirstname+'-'+strDate;
        System.out.println(patientfirstname);
        Hooks.setpatientname1(patientfirstname);
        return patientfirstname;

    }

    public static String patientlastname() throws IOException {
        String Plastname = getPropertyObject().getProperty("Patientlastname");
        Hooks.Setlastname1(Plastname);
        return Plastname;
    }

    public static String getPassword2() throws IOException {
        return getPropertyObject().getProperty("password2");
    }

    public static String patientno() throws IOException {
        return getPropertyObject().getProperty("Patientmobileno");
    }
    public static String patientemailid() throws IOException {
        return getPropertyObject().getProperty("Patientemailid");
    }

    public static String vreason() throws IOException{
        return  getPropertyObject().getProperty("Visitreason");
    }

    public static String provideremailid() throws IOException {
        return getPropertyObject().getProperty("Provideremailid");
    }

    public static String maemailid() throws IOException{
        return getPropertyObject().getProperty("MAemailid");
    }

}