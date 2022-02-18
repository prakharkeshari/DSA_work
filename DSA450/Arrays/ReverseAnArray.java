package Arrays;

class DSA{
    public static void main(String[] args) {
       String s = "GEEKS";
       char[] c = s.toCharArray();
       int i=0;
       int j =c.length-1;
       while (i<j){
           char temp = c[i];
           c[i] = c[j];
           c[j]  = temp;
           i++;
           j--;
       }
       String res = "";
       for (char k :c){
           res = res+k;
       }
       System.out.println(res);

    }
}
