
public class ReverseInteger {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-28 下午2:49:48 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/** 
	 * @ClassName: ReverseInteger 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-28 下午2:49:48 
	 */
	
	public int reverse(int x) {
        int flag=x>0?1:-1;
        x=Math.abs(x);
        int result=0;
        while(x!=0){
        	result=result*10+x%10;
        	x=x/10;
        }
        return flag*result;
    }
}
