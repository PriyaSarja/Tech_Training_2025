package vvce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Football {
    private List<Integer> players;
    private Map<Integer, Integer> jerseyToSeat;

    public Football(List<Integer> players) {
        this.players = new ArrayList<>(players);
        this.jerseyToSeat = new HashMap<>();
  
        for (int i = 0; i < players.size(); i++) {
            jerseyToSeat.put(players.get(i), i + 1);
        }
    }

    public void shiftRight(int n) {
        if (players.isEmpty()) return;
        
        n = n % players.size(); 
        if (n == 0) return; 
        
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(players.subList(players.size() - n, players.size()));
        rotated.addAll(players.subList(0, players.size() - n));
        players = rotated;
   
        for (int i = 0; i < players.size(); i++) {
            jerseyToSeat.put(players.get(i), i + 1);
        }
    }

    public List<Integer> getSeatingArrangement() {
        return new ArrayList<>(players);
    }

    public int getSeatNumber(int jerseyNumber) {
        return jerseyToSeat.getOrDefault(jerseyNumber, -1);
    }

    public static void main(String[] args) {
        List<Integer> players = List.of(10, 20, 30, 40, 50);
        Football fp = new Football(players);
        
        System.out.println("Original: " + fp.getSeatingArrangement());
        
        fp.shiftRight(1);
        System.out.println("After shift 1: " + fp.getSeatingArrangement());
        System.out.println("Seat for jersey 50: " + fp.getSeatNumber(50));
        
        fp.shiftRight(2);
        System.out.println("After shift 2: " + fp.getSeatingArrangement());
        System.out.println("Seat for jersey 10: " + fp.getSeatNumber(10));
    }
}
