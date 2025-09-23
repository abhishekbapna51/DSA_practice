package BFS-DFS;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean visited[] = new boolean[n];
        dfs(0, visited, rooms);
        for(boolean v : visited){
            if(!v) return false;
        }
        return true;
    }

    public void dfs(int node, boolean[] visited, List<List<Integer>> rooms){
        if(visited[node]) return;
        visited[node] = true;
        for(int naad : rooms.get(node)){
            if(!visited[naad]){
                dfs(naad, visited, rooms);
            }
        }
    }
}