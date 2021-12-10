package leetcode;

public class wuchongfuzuichangzichuan {
    public static void main(String[] args) {
        int b = lengthOfLongestSubstring("fjwebooib");
        System.out.println(b);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        } else {
            char[] a = new char[s.length()];//定义存放最长不重复字符数组
            int[] b = new int[s.length()];//定义表示原字符串每个字符参与运算后数组a长度的数组
            int k = 0,l=0,g=1;
            a[0] = s.charAt(0);//将字符串的首位字符赋给a[0]
           while(k<s.length()-1){
                int u=1;//u作为变量条件用于判断数组a中是否存在元素与原字符串下一位相同
                k++;//k为在遇到重复字符前数组a已被赋值的元素个数
                for (int j = 0; j < k; j++) {
                    if (a[j] == s.charAt(k)) {//将原字符串下一位字符与数组a所有字符进行比对，如有相同将数组a现已赋值长度赋给数组b，并清空数组a
                        b[l] = g;
                        u=0;
                        l++;//l为数组b更新的辅助，数组b每填一个元素l自动加一
                        k=l;
                        a = new char[s.length()];//清空数组a
                        g=1;
                        a[0]=s.charAt(l);
                        break;
                    }
                }
                if(u==1){
                    a[g] = s.charAt(k);//若数组a中无与原字符串下一位相同的则自动将该字符添加至数组a
                    g++;//数组a填一个元素,g递增
                    b[l]=g;
                }
            }
            int max=b[0];
            for(int x=0; x<b.length;x++){//求数组b中元素的最大值
                if(b[x]>max){
                    max=b[x];
                }
            }
            return max;
        }
    }
}