import java.util.*;
import au.com.bytecode.opencsv.CSVReader;

public class JobDetails {
    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsExp;
    private String country;
    public JobDetails(String title, String company, String location, String type, String level, String yearsExp, String country) {
        this.title=title;
        this.company=company;
        this.location=location;
        this.type=type;
        this.level=level;
        this.yearsExp=yearsExp;
        this.country=country;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;

    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;

    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getLevel(){
        return level;
    }
    public void setLevel(String level){
        this.level=level;
    }
    public String getYearsExp(){
        return yearsExp;
    }
    public void setYearsExp(String yearsExp){
        this.yearsExp=yearsExp;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

    @Override
    public String toString(){
        return "JobDetails \n" +
                "Title:" + title + "\n" +
                "Company:" + company + "\n" +
                "Location:" + location + "\n" +
                "Type:" +type+"\n" +
                "Level:" + level+ "\n" +
                "Years of Experience:"+yearsExp+"\n" +
                "Country:"+country+"\n==========================\n";
    }

}