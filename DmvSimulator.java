public class DmvSimulator {
    public static void main(String[] args) {
        // Welcomes the user to the DMV
        System.out.println("Welcome to the DMV!");

        // Gives the user a random number between 1 and 100 and tells them to wait until their number is called
        int randomNum = (int) (Math.random() * 200);
        System.out.println("Your number is: " + randomNum);
        System.out.println("Wait until your number is called!");

        // Call out each number one at a time, but be sure to start from the number directly after the one 
        // you gave to the user and then wrap around until the user’s number is finally called last
        int num;

        if (randomNum == 200) {
            // start from 0
            num = 0;
        }else{
            // add 1 so it starts after
            num = randomNum + 1;
        }

        do{
            System.out.println(num);
            num++;
        }while(num <= 200);

        num = 0;

        while(num <= randomNum){
            System.out.println(num);
            num++;
        }

        // Tell the user they don’t have the required paperwork
        System.out.println("Are you stupid or something? You don't have the right paperwork!");
    }
}