
public class Pow {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-29 上午10:40:39 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow2(2, 3));
	}

	/** 
	 * @ClassName: Pow 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-29 上午10:40:39 
	 */
	
	 public static double pow(double x, int n) {
		 /**
		  * 1) x取值为0时，0的正数次幂是1，而负数次幂是没有意义的；判断x是否等于0不能直接用“==”。
		  * Math.abs(x-0)<0.000001
		  * 2) 对于n取值INT_MIN时，-n并不是INT_MAX，这时需要格外小心。
		  * 3) 尽量使用移位运算来代替除法运算，加快算法执行的速度。
		  */
	    if(n==0) return 1;
	    if(n<0) {
	    	if(n==Integer.MIN_VALUE){
	    		return  1.0/(pow(x,Integer.MAX_VALUE)*x);
	    	}else{
	    		return 1.0/pow(x,-n);
	    	}
	    }
	    double half=pow(x,n>>1);
	    
	    if((n & 0x1) ==1){
	    	//奇数
	    	return half*half*x;
	    }else{
	    	return half *half;
	    }
		 
	 }
	 
	 
	 public static double pow2(double x, int n) {
		 /**
		  * 1) x取值为0时，0的正数次幂是1，而负数次幂是没有意义的；判断x是否等于0不能直接用“==”。
		  * Math.abs(x-0)<0.000001
		  * 2) 对于n取值INT_MIN时，-n并不是INT_MAX，这时需要格外小心。
		  * 3) 尽量使用移位运算来代替除法运算，加快算法执行的速度。
		  */
	    if(n==0) return 1;
	    if(n<0) {
	    	if(n==Integer.MIN_VALUE){
	    		return  1.0/(pow(x,Integer.MAX_VALUE)*x);
	    	}else{
	    		return 1.0/pow(x,-n);
	    	}
	    }
	    double ans=1.0;
	    for(;n>0;n>>=1){
	    	
	    	if((n&0x1) ==1){//n的二进制中1的位数
	    		ans *=x;
	    	}
	    	x *=x;
	    }
	    
	    return ans;
		 
	 }
	 
	 
	 
}
