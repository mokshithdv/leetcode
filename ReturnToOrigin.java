class ReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int i=0,j=0;
        for(char a:moves.toCharArray())
        {
            if(a=='L'){
                i--;
            }
            if(a=='R'){
                i++;
            }
            if(a=='U'){
                j++;
            }
            if(a=='D'){
                j--;
            }
        }
        if(i==0&&j==0){
            return true;
        }
        else 
            return false;
    }
}
