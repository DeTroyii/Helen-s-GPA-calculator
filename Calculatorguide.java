public class Calculatorguide {
    public double overallfunction(Gpaguide [] courses ) {
        double totalgradepoint = 0;
        double totalgradeunit = 0;
        int i = 0;
        while (i < courses.length) {
            totalgradepoint += courses[i].getCoursegradeunit() * courses[i].getCourseunit();
            totalgradeunit += courses[i].getCourseunit();
            i++;
        }
        return totalgradepoint / totalgradeunit;
    }
}

