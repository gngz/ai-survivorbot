import java.util.Comparator;

public class TurnStruct implements Comparable<TurnStruct>{

	
	enum Objects {VOID,ZOMBIE_PART,ZOMBIE,PART,BULLET}
	
	
	public Position p;
	public Navigation.Direction dir;
	public Objects obj;
	public int heuristic;
	public int smell;
	
	public TurnStruct() {
		// TODO Auto-generated constructor stub
	}
	
	public TurnStruct(Position pos,Navigation.Direction dir, Objects obj, int heur, int smell)
	{
		this.p = pos;
		this.dir = dir;
		this.obj = obj;
		this.heuristic = heur;
		this.smell = smell;
	}
	
	public int getHeuristic()
    {
        return heuristic;
    }

    public int compareTo(TurnStruct t) {
        return (this.getHeuristic() - t.getHeuristic());
    }

	
}
