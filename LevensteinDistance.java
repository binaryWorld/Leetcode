
public class LevensteinDistance {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-29 下午6:28:50 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="abcde"; String B="a";
		System.out.println(caculateStringDistance(A,0,A.length()-1,B,0,B.length()-1));
	}

	/** 
	 * @ClassName: LevensteinDistance 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-29 下午6:28:50 
	 */
	
	
	/**
	 * 
	* @Title: caculateStringDistance 
	* @Description: 计算编辑距离
	* @param @param A
	* @param @param s1
	* @param @param e1
	* @param @param B
	* @param @param s2
	* @param @param e2
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws 
	* @author shf  
	* @date 2014-8-29 下午6:44:34 
	* @version V1.0
	 */
	 public static int caculateStringDistance(String A,int s1,int e1,String B,int s2,int e2){

		 if(s1>e1){
			 if(s2>e2){
				 return 0;
			 }else{
				 return e2-s2+1;
			 } 
		 }
		 
		 if(s2>e2){
			 if(s1>e1){
				 return 0;
			 }else{
				 return e1-s1+1;
			 } 
		 }
		 
		 if (A.charAt(s1)==B.charAt(s2)){
			 return caculateStringDistance( A, s1+1,e1, B,s2+1, e2);
		 }else{
			 //3种情况
			 int a=caculateStringDistance( A, s1,e1, B,s2+1, e2);
			 int b=caculateStringDistance( A, s1+1,e1, B,s2, e2);
			 int c=caculateStringDistance( A, s1+1,e1, B,s2+1, e2);
			 
			 int tmp=a<b?a:b;
			 int tmp2=tmp<c?tmp:c;
			 
			 return tmp2+1;
		 }
		 
	 }
}
