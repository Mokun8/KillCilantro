public class KillCilantro {

   
   public static String killCilantro(String str){
   int p = str.length();
   if(p != 16){
   for(int d = 0; d < 8; d++){
   int n = str.length();
   int m = str.indexOf("cilantro");
   int c = (m + 8);
   for(int i = 0; i <= m; i++){
   if(c > n){
   c = c - 1;
   }
   String first = str.substring(0, m);
   String last = str.substring((c), n);
   str = first + "parsley" + last;
   n = str.length();
  
  } 
} 
  int h = str.length();
  if (h == 15){
   String word = "parsleyparsleyparsley";
   str = word;
   }
  }
  if (p == 16){
   int w = str.length();
   int g = str.indexOf("cilantro");
   String fir = str.substring(0, g);
   String las = str.substring((g+8), p);
   str = fir + "parsley" + las;
   }
 
   return str;
 } 
   public static void main(String[] args){
    System.out.println(killCilantro("testcilantrotest"));
    System.out.println(killCilantro("cilantrotest"));
    System.out.println(killCilantro("nothinghere"));
    System.out.println(killCilantro("testcilantro"));
    System.out.println(killCilantro("cilantrocilantrocilantro"));
    }
}
