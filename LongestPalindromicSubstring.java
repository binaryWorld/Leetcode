	/** 
	 * @ClassName: LongestPalindromicSubstring 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-28 下午12:03:42 
	 * 所谓回文字符串，就是一个字符串，从左到右读和从右到左读是完全一样的
	 */
public class LongestPalindromicSubstring {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-28 下午12:03:42 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="babbacde";

		System.out.println(longestPalindrome(s));
				
	}

	//中心扩展法
	public static String longestPalindrome(String s) {
        int max=0;
        int length=s.length();
        int start=0;
        for(int i=0;i<length;i++){
        	//回文字串长度为奇数
        	for(int j=0;(i-j>=0) && (i+j<length);j++){
        		if(s.charAt(i-j) != s.charAt(i+j)){
        			break;
        		}
        		if(j*2+1>max) {
        			max=j*2+1;
        			start=i-j;
        		}
        	}
        	////回文字串长度为偶数
        	for(int k=0;(i-k>=0)&&(i+k+1<length);k++){
        		if(s.charAt(i-k) != s.charAt(i+k+1)){
        			break;
        		}
        		if(k*2+2>max) {
        			max=k*2+2;
        			start=i-k;
        		}
        		
        	}
      
        }
        	
		return s.substring(start, start+max);
    }
}
