class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        int c = 0;
        
        for (int i=0; i<prerequisites.length; i++) {
            indegree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<indegree.length; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        
        while(!queue.isEmpty()){
            int course = queue.poll();
            c++;
            
            for (int i=0; i<numCourses; i++) {
                if (graph[course][i] != 0) {
                    if (--indegree[i] == 0)
                        queue.offer(i);
                }
            }
        }
        
        return c == numCourses;
    }
}
