import java.io.PrintWriter;
import java.io.StringWriter;
public class Zadanie1 {
    public static void main(String[] args){
        dane z=null;
        StringWriter SW=new StringWriter();
        PrintWriter PW=new PrintWriter(SW);

        try {
            z.getJeden();
        }
        catch(NullPointerException e){
            //System.out.println("z is null");
            e.printStackTrace(PW);
            String StackTrace=SW.toString();
            System.out.print(StackTrace);
        }

    }

    public static class dane {
        private String jeden;

        public String getJeden() {
            return jeden;
        }

        public void setJeden(String jeden) {
            this.jeden = jeden;
        }
    }
}
