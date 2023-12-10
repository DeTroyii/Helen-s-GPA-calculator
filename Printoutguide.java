public class Printoutguide {
    public void printfiletable(Gpaguide [] courses){
        System.out.println("\n Breakdown of Ingress");
        System.out.println("|-----------------|-----------------|--------|------------| \n");
        System.out.printf("| %15s | %13s | %7s | %10s |\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
        System.out.println("|-----------------|-----------------|-------|------------|\n");
        for(Gpaguide courselist: courses){
            System.out.printf("| %-15s | %-13d | %-7s | %-12d |\n ", courselist.getCoursecode(), courselist.getCourseunit(), courselist.getCoursegrade(), courselist.getCoursegradeunit());
        }
        System.out.println("|------------------------------------------------------------------------|\n");
        Calculatorguide calculate = new Calculatorguide();
        System.out.printf("Your GPA = %.2f", calculate.overallfunction(courses) );
    }
}

