
public class KMP {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-30 上午9:41:01 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		System.out.println(start); 
		String s="gdsaadfdgffccsdaabaccfdaddaabaccfaddddaabcga";
		System.out.println(s.length()); 
		String target="gdsxx";
		System.out.println(KMPMatch(s,target));
		long end=System.currentTimeMillis();
		System.out.println(end); 

	}

	/** 
	 * @ClassName: KMP 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-30 上午9:41:01 
	 */
	
	//暴力匹配
	public static int Match(String s,String target){
		int i,j;
		i=j=0;
		//注意条件
		while(i<s.length() && j<target.length() ){
		
				if(s.charAt(i)==target.charAt(j)){
					i++;
					j++;
				}else{
					i=i-j+1;
					j=0;
				}
		}
		if(j==target.length()){
			return i-j;
		}else{
			return -1;
		}

	}
	
	
	//KMP中的核心算法，获得记录跳转状态的next数组
	public static int[] next(String sub) {
		
		int[] next=new int[sub.length()];
		char[] subArray=sub.toCharArray();
		
		next[0]=-1;
		int i=0;
		int j;
		
		for(j=1;j<sub.length();j++){
			i=next[j-1];
			
			//通过地推进行计算
			while(i!=-1 && subArray[i+1]!=subArray[j]){
				//继续跳转找更小的 最长前缀后缀公共长度
				i=next[i];
			}
			
			if(subArray[i+1]==subArray[j]){
				next[j]=i+1;
			}else{
				next[j]=-1;
			}	
			
		}

		return next;
	}

	//KMP算法
	public static int KMPMatch(String s,String target){
		
		int[] next=next(target);
		
		int i,j;
		i=j=0;
		
		for(;i<s.length();){
			if(s.charAt(i)==target.charAt(j)){
				 if(j==target.length()-1) {
					 return i-j;
                 }
				i++;
				j++;
			}else if(j==0){
				i++;
			}else{
				j=next[j-1]+1;
			}
		}
		
		if(j==target.length()){
			return i-j;
		}else{
			return -1;
		}
		
	}
	
}
