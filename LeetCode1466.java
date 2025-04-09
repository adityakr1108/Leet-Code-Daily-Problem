import java.util.*;  

class LeetCode1466 {
    // 1466. Reorder Routes to Make All Paths Lead to the City Zero
        int ans = 0;
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> forward = new ArrayList<>();
        for(int i = 0; i<n;i++){
            forward.add(new ArrayList<>());
        }
        ArrayList<ArrayList<Integer>> backward = new ArrayList<>();
        for(int i = 0; i<n;i++){
            backward.add(new ArrayList<>());
        }

        for(int [] a:connections){
            int a1 = a[0];
            int b1 = a[1];
            forward.get(a1).add(b1);
            backward.get(b1).add(a1);
            
        }
        boolean vis[] = new boolean[n];
        Arrays.fill(vis,false);
        dfs(0,forward,backward,vis);
        return ans;
    }
    public void dfs(int source, ArrayList<ArrayList<Integer>> forward, ArrayList<ArrayList<Integer>> backward,boolean [] vis){
        vis[source] = true;
        for(int a : forward.get(source)){
            if(!vis[a]){
                ans+=1;
                dfs(a,forward,backward,vis);
            }
        }
        for(int a : backward.get(source)){
            if(!vis[a]){
                dfs(a,forward,backward,vis);
            }
        }
    }
}

