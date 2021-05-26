package benchmark;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Developed as class project for CSS553 at University of Washington (Bothell)
 * 
 * @author Gucci Team *
 */
public class StatsManager {

	//key should be reference to instantiated / injected object: Name of object (class)
	private Map<String,StatsObject> data;
	private TimingObj timer;
	

	/**
	 * Starts timing
	 * 
	 * @param <T>
	 * @param type
	 * @return
	 */
	public <T> TimingObj startTiming(Class<T> type) {
		TimingObj timer = new TimingObj(System.currentTimeMillis(),type.getTypeName());
		return timer;
	}

	/**
	 * Converts map of data to list 
	 * 
	 * Jason
	 * 
	 * @return
	 */

	public List<StatsObject> getData (){
		List<StatsObject> stats = new ArrayList<StatsObject>(data.values);
		return stats;

	}

	/**
	 * Update data with new object info 
	 * 
	 * Jason
	 * 
	 * @param timingObj
	 */
	public void updateData(TimingObj timingObj) {

		
		StatsObject statsObj = data.get(timingObj.getClassName());
		
		if(statsObj == null) {
			statsObj = new StatsObject(timingObj.getClassName());
      stats.add(statsObj);	
		}		
		statsObj.addTiming(timingObj.duration());
	}
}
