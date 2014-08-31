import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeatingCharacters {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-27 下午8:48:47 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="qopubjguxhxdipfzwswybgfylqvjzhar";
		System.out.println(lengthOfLongestSubstring(s));

	}

	/** 
	 * @ClassName: LongestSubstringWithoutRepeatingCharacters 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-27 下午8:48:47 
	 */
	
	public static int lengthOfLongestSubstring(String s) {
		int i=0,start=0;
		int max=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=start){
				start=map.get(s.charAt(i))+1;
			}
			if((i-start+1)>max){
				max=i-start+1;
			}
			map.put(s.charAt(i), i);
		}
		
        return max;
    }
	
	
	public static int lengthOfLongestSubstring2(String s) {
		int length=s.length();

		if(length==0) return 0;
		int[] table=new int[256];
		Arrays.fill(table, -1);
		int max=0;
		int i=0,start=0;
		for(i=0;i<length;i++){
			if(table[s.charAt(i)]>=start){
				start=table[s.charAt(i)]+1;
			}

			if((i-start+1)>max){
				max=i-start+1;
			}
			table[s.charAt(i)]=i;
		}
		
        return max;
    }
	
}
