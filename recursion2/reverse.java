public class reverse {
    public static void rev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
    }
    public static void main(String[] args) {
        String str="abcde";
        rev(str,str.length()-1);
    }
}
