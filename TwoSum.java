import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-27 下午6:37:47 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @ClassName: TwoSum 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-27 下午6:37:47 
	 */
	
	
	
	public int[] twoSum(int[] numbers, int target) {
		int result[]=new int[2];
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<numbers.length;i++){	
			if(map.containsKey(target-numbers[i])){
				result[1]=i+1;
				result[0]=map.get(target-numbers[i]);
				return  result;
			}
			map.put(numbers[i], i+1);
		}
		
		return result;
        
    }
	
}
