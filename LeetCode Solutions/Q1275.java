public class Q1275 {
    public String tictactoe(int[][] moves) {
        int[] arow=new int[3];
        int[] brow=new int[3];
        int[] acol=new int[3];
        int[] bcol=new int[3];
        int aD1=0,aD2=0,bD1=0,bD2=0;
        for(int i=0;i<moves.length;i++){
            int r=moves[i][0],c=moves[i][1];
            if(i%2==1){
                if(++brow[r]==3||++bcol[c]==3||r==c && ++bD1==3||r+c==2 && ++bD2==3) return "B";
            }
            else{
                if(++arow[r]==3||++acol[c]==3||r==c && ++aD1==3||r+c==2 && ++aD2==3) return "A";
            }
        }
        return moves.length==9?"Draw":"Pending";
    }
} 
