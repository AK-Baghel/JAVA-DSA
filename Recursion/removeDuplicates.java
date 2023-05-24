public class removeDuplicates{
    public static void remove(String str,int i,StringBuilder newStr,boolean map[]){
        if(i==str.length()){
            System.out.println(newStr.toString());
            return;
        }
        char ch=str.charAt(i);
        if(map[ch-'a']==true)
            remove(str,i+1,newStr,map);
        else{
            map[ch-'a']=true;
            remove(str,i+1,newStr.append(ch),map);
        }
    }
    public static void main(String[] args) {
        String str="aabcbccdad";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
}
