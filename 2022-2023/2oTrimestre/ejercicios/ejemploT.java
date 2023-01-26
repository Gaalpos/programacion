import java.util.StringTokenizer;

public class ejemploT {
    
    public static void main(String[] args) {
        

        StringTokenizer str;

        str = new StringTokenizer("UNO DS TRES PERICO JUANICO Y ANDRES");
        System.out.println(" la cadena str tiene  "+str.countTokens()+" elementos");

        while(str.hasMoreTokens()) System.out.println(str.nextToken());
    }
}
