import java.util.ArrayList;


public class ReverseString {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-27 下午12:16:44 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "  cwdvr   asdvw";
		/*for(int i=0;i<a.length();i++){
			System.out.println(a.charAt(i));
		}*/
		
		
		System.out.println("开始："+reverseWords2(a));
	}
	
	public static String reverseWords(String s) {
		StringBuilder stringBuilder=new StringBuilder();
		int length=s.length();
		s=s.trim();
		
		int cnt=0;
		for(int i=length-1;i>=0;i--){
			cnt++;
			//if((s.charAt(i)==' ')||(i==0)){
			if((s.charAt(i) == ' ') || (i == 0)){
				int tmp=i;
				if(i==0){
					stringBuilder.append(' ');
				}
				for(int j=0;j<cnt;j++){
					stringBuilder.append(s.charAt(tmp+j));
				}
				cnt=0;
			}else{
				continue;
			}

		}
		return stringBuilder.toString().trim();

    }

	
	
	public static String reverseWords2(String s) {
		StringBuilder stringBuilder=new StringBuilder();
		s=s.trim();
		String[] tmp=s.split(" ");
		for(int i=tmp.length-1;i>=0;i--){
			stringBuilder.append(tmp[i]);
			stringBuilder=new StringBuilder(stringBuilder.toString().trim());
			stringBuilder.append(" ");
		}
		
		return stringBuilder.toString().trim();

    }
	/** 
	 * @ClassName: ReverseString 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-27 下午12:16:44 
	 */
}
