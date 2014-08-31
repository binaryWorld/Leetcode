import java.util.Stack;


public class EvaluateReversePolishNotation {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-27 下午2:27:53 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens={"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(tokens));
	}

	/** 
	 * @ClassName: EvaluateReversePolishNotation 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-27 下午2:27:53 
	 */
	
	

	    public static int evalRPN(String[] tokens) {
	        Stack<String> stack=new Stack<String>();
	        for(int i=0;i<tokens.length;i++){
	        	if(!isAnOperator(tokens[i])){
	        		stack.push(tokens[i]);
	        	}else{
	        		int result=0;
	        		int a=Integer.valueOf(stack.pop());
	        		int b=Integer.valueOf(stack.pop());
	        		
	        		if(tokens[i].equals("+")){
	        			result=a+b;
	        		}
	        		if(tokens[i].equals("-")){
	        			result=b-a;
	        		}
	        		if(tokens[i].equals("*")){
	        			result=b*a;
	        		}
	        		if(tokens[i].equals("/")){
	        			result=b/a;
	        		}
	        		stack.push(Integer.toString(result));
	        	}
	        }
	        
	    	return Integer.parseInt(stack.pop());
	    }
	    
	    private static boolean isAnOperator(String string) {
	        // TODO Auto-generated method stub
	        if(string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/"))
	            return true;
	        return false;
	    } 
}
