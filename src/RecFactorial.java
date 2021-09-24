//factorial with recusion
public class RecFactorial {
    static  int fact = 1;

    public static void main(String[] args) {
        int no = 5;            //number pass in method line no 13
        RecFactorial f = new RecFactorial();
        f.calFact(no);
        System.out.println("factorial of "+no+" is "+fact);

    }

    void  calFact(int no) {       //call to itself  pass the number
        if (no >= 1) {            //check the condn  like 5>1
            fact = fact * no;     //print the fact
             calFact(no-1);   //call to  itself
        }

    }
}
