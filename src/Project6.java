public class Project6 {
    //Write a java program to check whether a given
    //number is prime or not?
    public static void main(String[] args) {
        int num=10;
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number " +num+ " is prime");
        }else{
            System.out.println("Number " +num+ " is not prime");
        }
    }
}
