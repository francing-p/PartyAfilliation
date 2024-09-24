import java.util.Objects;
import java.util.Scanner;

public class Party {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);

       String party =""; // define variables

        System.out.print("Please enter your party affiliation using R, D, or I: ");

        // no verification was done to ensure it was a string because 'Other' is a valid choice
        // and 'Other' could be anything

            party = in.nextLine();
            if (Objects.equals(party, "R")){     //if input is 'R'
                System.out.println("You get a Republican Elephant! ");
            }
            else if(Objects.equals(party, "D")){  //if input is 'D'
                System.out.println("You get a Democratic Donkey! ");
            }
            else if(Objects.equals(party, "I")){  //if input is 'I'
                System.out.println("You get an Independent Man! ");
            }
            else{ //if input is anything else
                System.out.println("You chose: Other");
            }
        }



    }

