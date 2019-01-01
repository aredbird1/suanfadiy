package blogsuanfa.string;

/**
 * Created by manwei on 18/12/30
 */
public class StringMultiply {

    public static void main(String[] args) {
        String n1 = "25";
        String n2 = "15";
        String ret = multiply(n1, n2);
        System.out.println(ret);
    }

    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1=num1.length();
        int len2=num2.length();
        int product,carry,i,j;
        int[] num= new int[len1+len2];
        for(i=len1-1;i>=0;i--){
            carry=0;
            for(j=len2-1;j>=0;j--){
                product=carry+ (int)(num1.charAt(i)-'0')*(int)(num2.charAt(j)-'0')+num[i+j+1];
                num[i+j+1]=product%10;
                carry=product/10;
            }
            num[i+j+1]=carry;
        }
        i=0;
        while(i<len1+len2 && num[i]==0){
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(i<len1+len2){
            sb.append(num[i]);
            i++;
        }

        return sb.toString();
    }

}
