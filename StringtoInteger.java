
public class StringtoInteger {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-28 下午2:56:37 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2147483648";
		String s2="-2147483649";
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(atoi(s));
	}

	/** 
	 * @ClassName: StringtoInteger 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-28 下午2:56:37 
	 */
	
	 public static int atoi(String str) {
	    if(str==null) return 0;
		str=str.trim();
		if(str.length()==0) return 0;
		boolean isNeg=false;
		int i=0;
		if(str.charAt(0)=='-'|| str.charAt(0) =='+'){
			i++;
			if(str.charAt(0)=='-') isNeg=true;
		}
		int result=0;
		for(;i<str.length();i++){
			if(str.charAt(i)>'9'||str.charAt(i)<'0') break;
			int digit=str.charAt(i)-'0';
			//条件的判断
			if(!isNeg && result>(Integer.MAX_VALUE-digit)/10){
				return Integer.MAX_VALUE;
			}else if(isNeg && result>-((Integer.MIN_VALUE+digit)/10)) {
				return Integer.MIN_VALUE;
			}
			
			result=result*10+digit;
		}
		return isNeg?-result:result;		

	   }
}
