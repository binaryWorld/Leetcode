import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Anagrams {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-29 下午12:44:23 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"tea","and","ate","eat","den"};
		List list=anagrams( strs);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("jieshu");
	}

	/** 
	 * @ClassName: Anagrams 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-29 下午12:44:23 
	 */
	 public static List<String> anagrams(String[] strs) {
		 /**
		  * 注意char[].toString()  返回值getClass().getName() + '@' + Integer.toHexString(hashCode())
		  * 应该用String。valueof（）
		  */
	    List<String> list=new ArrayList<String>();
		Map<String,Integer> map =new HashMap<String,Integer>();
		for(int i=0;i<strs.length;i++){		
			char[] strArray=strs[i].toCharArray();
			Arrays.sort(strArray);
			String str=String.valueOf(strArray);
			if(map.containsKey(str) && map.get(str)!=-1 ){
				list.add(strs[map.get(str)]);
				list.add(strs[i]);
				map.put(str,-1);		
			}else if(map.containsKey(str) && map.get(str)==-1 ){
				list.add(strs[i]);
			}else{
			
				map.put(str, i);
			}
		}
		 return list;
	    
	 }
}
