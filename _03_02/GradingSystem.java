package _03_02;

public class GradingSystem {

  // Return true if the percentage is higher than or equal to 60.
  // Otherwise return false.
  public boolean isAPass(int percentage) {

    if (percentage >= 60) {
      return true;
    } else {
      return false;
    }
  }

  // If the percentage is 90 or above, return 'A'.
  // If it's 80-89, return 'B'.
  // If it's 70-79, return 'C'.
  // If it's 60-69, return 'D'.
  // If it's less than 60, return 'F'.
  public char getGrade(int percentage) {
    if (percentage >= 90) {
      return 'A';
    } else if (percentage <= 89 & percentage >= 80) {
      return 'B';
    } else if (percentage <= 79 & percentage >= 70) {
      return 'C';
    } else if (percentage <= 69 & percentage >= 60) {
      return 'D';
    } else {
      return 'F';
    }
  }

  // If percentage is less than 60 and allowedToRetake is true, return a String
  // that says "The student has been entered for a retake."
  // If percentage is less than 60 and allowedToRetake is false, return a String
  // that says "The student is not allowed to retake this exam."
  // If percentage is 60 or higher, return a String that says "A retake is not
  // required."
  public String retakeMessage(int percentage, boolean allowedToRetake) {

    if (percentage < 60 && allowedToRetake) {
      return "The student has been entered for a retake.";
    }

    else if (percentage <= 60 && !allowedToRetake) {
      return "The student is not allowed to retake this exam";
    }
    else {
      return "A retake is not required.";
    }
  }
}
