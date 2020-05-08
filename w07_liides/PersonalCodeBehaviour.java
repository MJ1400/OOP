import java.util.Scanner;

/**
 * PersonalCodeBehaviour
 */
interface PersonalCodeBehaviour {

    public int getGender(String gender);
    public String getBirthday(String birthday);
    public int getYear(String[] birthdayArray);
    public String getMonth(String[] birthdayArray);
    public String getDay(String[] birthdayArray);
}

class EstonianID implements PersonalCodeBehaviour {
    public int getGender(String gender) {
        if(gender == "mees"){
            return 1;
        } else if(gender == "naine") {
            return 2;
        } else {
            return 0;
        }
    }

    public Array getBirthday(String birthday) {
        String[] birthdayArray = birthday.split("-", 3);
       
    }

    public int getYear(String[] birthdayArray) {
        String yearString = birthdayArray[2];
        int year = Integer.parseInt(yearString);
        return year;
    }

    public String getMonth() {
        String monthString = birthdayArray[1];
        int month = Integer.parseInt(monthString);
    }

    public String getDay() {
        String dayString = birthdayArray[0];
        int day = Integer.parseInt(dayString);
    }
    
}

//public class FinnishID implements PersonalCodeBehaviour {

//}




class Main {
  public static void main(String[] args) {
      int option;
      int genderNr;
      Scanner scanner = new Scanner(System.in);
      EstonianID estonian = new EstonianID();
      //FinnishID finnish = new FinnishID();
      System.out.println("Eesti ID - 1 | Soome ID - 2");
      option = scanner.nextInt();
      scanner.nextLine();
      if(option == 1){
          System.out.println("Sisesta sugu | naine/mees");
          String gender = scanner.nextLine();
          genderNr = estonian.getGender(gender);

          System.out.println("Sisesta synnikuupaev kujul d-m-y");
          String birthday = scanner.nextLine();

         String[] birthdayArray = estonian.getBirthday(birthday);



          
      } else if(option == 2){

      } else {
          System.out.println("Palun sisestage kas 1 voi 2!");
      }

  }
}