package javaders.day43lambda;

public class Course {
/*
    Icinde
    i)private variable'lar
    ii)Parametreli ve parametresiz constructor'lar
    iii)getter'lar
    iv)setter'lar
    v)toString() method'u
    barindiran class'lara "POJO" Class denir.
    POJO: Plain Old Java Object
*/
    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}




