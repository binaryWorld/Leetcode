
public class Btree {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-29 下午8:25:04 
	 * @version V1.0
	 */
	public static int max=Integer.MIN_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree1=new Tree(1,null,null);
		Tree tree2=new Tree(4,null,null);
		Tree tree4=new Tree(6,null,null);
		Tree tree5=new Tree(7,tree1,tree2);
		Tree tree3=new Tree(5,tree4,tree5);
		
		getMaxMin( tree3);
		
		System.out.println(max-min);
		
	}

	/** 
	 * @ClassName: Btree 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-29 下午8:25:04 
	 */

	public static void getMaxMin(Tree tree){

		if(tree !=null){
			if(max<tree.value){
				max=tree.value;
			}
			
			if(tree.value<min){
				min=tree.value;
			}
			
			getMaxMin(tree.lnext);
			getMaxMin(tree.rnext);
		}
	}
	
	
	
}

class Tree{
	int value;
	Tree lnext;
	Tree rnext;
	
	public Tree(int value,Tree lnext,Tree rnext){
		this.value=value;
		this.rnext=rnext;
		this.lnext=lnext;
	}

}
