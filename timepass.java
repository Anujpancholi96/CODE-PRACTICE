public class timepass {
     int beautySum(String s) {
        
        int totalbeauty = 0;
        for(int  i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i,j+1);
                totalbeauty += calculatebeauty(sub);
            }
        }
       return totalbeauty;
    }

      int calculatebeauty(String sub){
      
        int highest = 0;
        int lowest = sub.length();
        for(int i = 0; i < sub.length(); i++){
            int count = 0;
            for(int j = 0; j < sub.length(); j++){
                if(sub.charAt(i) == sub.charAt(j)){
                    count++;
                }
            }
            if(count > highest){
                highest = count;
            }
            if(count < lowest){
                lowest = count;
            }
        }
        return (highest-lowest);
    }

    public static void main(String[] args) {
        String s = new String();
        timepass o1 = new timepass();

        s = "sqxaebtfecdpcjpzchznpwwxhafkuatcohuijxnlxqxqueldxkdvfinfwnsnlofmblamodqhwobsjfhrwsduaqzosqdeerbiyncwspqhjwlwqffkgyhiizpppodmglezzzamdzgafgabcarlmpffvxpchkyecmdvbbziemayrwhfuayrfwjsypagophyzyflpe";
       int n =  o1.beautySum(s);
       System.out.print(n);
    }
}
