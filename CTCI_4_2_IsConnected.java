/**
 * Created by shuweizhao on 2/25/16.
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class CTCI_4_2_IsConnected {
    public boolean isConnected(ArrayList<UnDirectedGraphNode> graph, UnDirectedGraphNode node1,
                               UnDirectedGraphNode node2) {
        if (graph == null || graph.size() == 0) {
            return false;
        }
        for (UnDirectedGraphNode n : graph) {
            n.state = 0;
        }
        Queue<UnDirectedGraphNode> q = new LinkedList<>();
        q.offer(node1);
        while (!q.isEmpty()) {
            UnDirectedGraphNode node = q.poll();
            for (UnDirectedGraphNode neighbor : node.neighbor) {
                if (neighbor.state == 0) {
                    if (neighbor == node2) {
                        return true;
                    } else {
                        neighbor.state = 1;
                        q.offer(neighbor);
                    }
                }
            }
            node.state = 2;
        }
        return false;
    }

}
