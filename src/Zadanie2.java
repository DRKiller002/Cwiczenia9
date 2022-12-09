public class Zadanie2 {
    public static void main(String[] args){
        int dzielna[]={2,4,8,16,32,64};
        int dzielnik[]={1,0,8};
        for(int i=0;i<dzielna.length;i++){
            try{
                System.out.println(dzielna[i]+"/"+dzielnik[i]+"="+dzielna[i]/dzielnik[i]);
            }
            catch(ArithmeticException e){
                System.out.println("Nie dziel przez zero");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Poza zakresem tablicy");
            }
            finally{
               System.out.println("Wykonuje sie");
            }
        }
    }
}
