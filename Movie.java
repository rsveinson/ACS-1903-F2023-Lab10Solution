/**
 * ACS-1903 Lab 10 Q8
 * @author (your name and student number here);
 */
public class Movie{
    // fields
    private String title;       // title of movie
    private int year;           // year released
    
    // constructors
    public Movie(){
        title = "unknown";
    }
    
    public Movie(String t, int y){
        title = t;
        year = y;
    }
    
    // getters
    
    public String getTitle(){
        return this.title;
    }
    
    public int getYear(){
        return this.year;
    }
    
    // Setters
    public void setTitle(String t){
        this.title = t;
    }
    
    public void setYear(int y){
        this.year = y;
    }    
  

}
