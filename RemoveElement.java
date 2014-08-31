
public class RemoveElement {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-29 上午11:37:03 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1 2 3; 4 // No occurence 
			2 2 2 2 2; 2 // Remove all 
			1 2 3; 2 // General 
			1 2 3 2 4 5; 2 // Multiple  
			1 3 3 2 4 5 
			1 3 4 5 
		 */
		
		int[] A={2,2,2,2,2};
		System.out.println(removeElement(A,2));
	}

	/** 
	 * @ClassName: RemoveElement 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-29 上午11:37:03 
	 */
	
	public static int removeElement(int[] A, int elem) {
		int cnt=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==elem){
				cnt++;
			}else{
				A[i-cnt]=A[i];
			}
		}
		
		return A.length-cnt;
        
    }
}
