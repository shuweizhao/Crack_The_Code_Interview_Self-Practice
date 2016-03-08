/**
 * Created by shuweizhao on 2/25/16.
 */
import java.util.*;
public class UnDirectedGraphNode {
    int label;
    ArrayList<UnDirectedGraphNode> neighbor;
    int state;//0,1,2(unvisited, visiting, visited)
    public UnDirectedGraphNode(int label) {
        this.label = label;
        neighbor = new ArrayList<>();
        state = 0;
    }

}
