public class Gpaguide {
    private String Coursecode;
    private int Courseunit;
    private String Coursegrade;
    private int Coursegradeunit;
    private int coursescore;

    public void setCoursecode(String coursecode) {this.Coursecode = coursecode;}
    public String getCoursecode() {return Coursecode;}
    public void setCourseunit(int courseunit) {this.Courseunit = courseunit;}
    public int getCourseunit() {return Courseunit;}

    public void setCoursescore(int score) {
        this.coursescore = score;
        if (this.coursescore >= 70) {
            this.Coursegradeunit = 5;
            this.Coursegrade = "A";
        } else if (this.coursescore >= 60) {
            this.Coursegradeunit = 4;
            this.Coursegrade = "B";
        } else if (this.coursescore >= 50) {
            this.Coursegradeunit = 3;
            this.Coursegrade = "C";
        } else if (this.coursescore >= 45) {
            this.Coursegradeunit = 2;
            this.Coursegrade = "D";
        } else if (this.coursescore >= 40) {
            this.Coursegradeunit = 1;
            this.Coursegrade = "E";
        } else if (this.coursescore >= 0) {
            this.Coursegradeunit = 0;
            this.Coursegrade = "F";
        }
    }

    public  String getCoursegrade() {
        return this.Coursegrade;
    }

    public int getCoursegradeunit() {
        return this.Coursegradeunit;
    }
}




