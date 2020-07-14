package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        return score <= 100 && score >= 90;
    }
    
    public Boolean isGradeB(Double score) {
        return score <= 89 && score >= 80;
    }
    
    public Boolean isGradeC(Double score) {
        return score <= 79 && score >= 70;
    }
    
    public Boolean isGradeD(Double score) {
        return score <= 69 && score >= 65;
    }
    
    public Boolean isGradeF(Double score) {
        return score <= 64;
    }
    
    public Character getGrade(Double score) {
        char grade = 'M';
        if (isGradeA(score)) {
            grade = 'A';
        } else if (isGradeB(score)) {
            grade = 'B';
        } else if (isGradeC(score)) {
            grade = 'C';
        } else if (isGradeD(score)) {
            grade = 'D';
        } else if (isGradeF(score)) {//Check really isn't needed
            grade = 'F';
        }
        return grade;
    }
}
