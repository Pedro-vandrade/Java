package entities;

public class Student {
    public String name;
    public double firstTest;
    public double secondTest;
    public double thirdTest;

    public double finalGrade(){
        return firstTest+secondTest+thirdTest;
    }
    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }else {
            return 0.0;
        }
    }

}
