
public class PalindromeNumber {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-28 下午3:59:57 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @ClassName: PalindromeNumber 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-28 下午3:59:57 
	 */
	
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x==0) return true;
        int bit=1;
        while((x/10)>10){
        	bit *=10;
        }
        while(x>0){
        	int left=x/bit;
        	int right=x%10;

        	if(left!=right) return false;
        	
        	x -=bit*left;//去除右位
        	x /=10;//去除左位
        	bit /=100;
        }

		return true;
    }
	
	//反向计算
	public boolean isPalindrome2(int x) {
        if(x<0) return false;
        if(x==0) return true;  
        int target=x;
        int reverse=0;
        while(x!=0){
        	reverse=reverse*10+x%10;
        	x=x/10;
        }

		return target==reverse;
    }
}
