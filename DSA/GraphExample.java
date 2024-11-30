import java.util.*;



public class GraphExample{

    static boolean isAquainted(Map<String, String[]> adajencyList, String name1, String name2 ){

        String[] friends = adajencyList.get(name1);
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(name1);
        visited.add(name1);
        while(!queue.isEmpty()){
            String current = queue.poll();
            if(current.equals(name2)){
                return true;
            }
            for(String friend : adajencyList.get(current)){
                if(!visited.contains(friend)){
                    queue.offer(friend);
                    visited.add(friend);
                }
            }
        }
        return false;

    }
    
    public static void main(String[] args) {
        //Graph
        Map<String, String[]> adajencyList = new HashMap<>();

        adajencyList.put("Ravi", new String[] {"Tanya", "John", "Soniya"});
        adajencyList.put("Tanya", new String[] {"Ravi"});
        adajencyList.put("John", new String[] {"Ravi"});
        adajencyList.put("Soniya", new String[] {"Ravi","Yasha"});
        adajencyList.put("Yasha", new String[] {"Soniya"});


    }
}