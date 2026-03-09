class Main {
    public boolean isPalin(String s){
        int st=0;
        int en=s.length()-1;
        while(st < en){
            if(s.charAt(st) !=s.charAt(en))
                return false;
                st++;
                en--;
            }
            return true;
        }
    public String longestPalindrome(String s) {
        int n=s.length();
        String Longpalin="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String substr=s.substring(i,j);
                if(isPalin(substr)){
                    if(Longpalin.length() < substr.length()){
                        Longpalin = substr;
                    }
                }
            }
        }
        return Longpalin;
    }
}