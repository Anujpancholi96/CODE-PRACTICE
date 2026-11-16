public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }  
    
}

interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(1 step)");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }

    
}
