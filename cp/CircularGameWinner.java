import java.util.ArrayList;
import java.util.List;

public class CircularGameWinner {
    public static int findWinner(int n, int k) {
        List<Integer> players = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        
        int currentIndex = 0;
        
        while (players.size() > 1) {
            currentIndex = (currentIndex + k - 1) % players.size();
            players.remove(currentIndex);
        }
        return players.get(0);
    }
    
    public static void main(String[] args) {
        int n = 7;  
        int k = 3;  
        int winner = findWinner(n, k);
        System.out.println("Winner: Player " + winner);
    }
}