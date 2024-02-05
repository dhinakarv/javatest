public class FactorofN {
    public static void main(String[] args) {
        int n = 100;
        int count=0;
        for(int i =1; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Factor of "+n+" is:" +count);
    }
}
