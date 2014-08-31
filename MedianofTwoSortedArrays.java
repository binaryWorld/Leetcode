
public class MedianofTwoSortedArrays {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-27 下午6:56:48 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2};
		int[] B={3};
		System.out.println(findMedianSortedArrays(A,B));
	}

	/** 
	 * @ClassName: MedianofTwoSortedArrays 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @author shf
	 * @date 2014-8-27 下午6:56:48 
	 */
	
	
	
	 public static double findMedianSortedArrays(int A[], int B[]) {
		 
		double result=0.0;
		int m=A.length;
		int n=B.length;
		int k=(m+n)>>1;
		int total=m+n;
		//奇数
		if((total & 0x1)==1){
			result=findKth(A,0,m-1,B,0,n-1,k+1);
		}else{
			System.out.println(findKth(A,0,m-1,B,0,n-1,k+1));
			System.out.println(findKth(A,0,m-1,B,0,n-1,k));
			
			result=(findKth(A,0,m-1,B,0,n-1,k+1)+findKth(A,0,m-1,B,0,n-1,k))/2.0;
		}

		return result;
	        
	    }
	 
	 private static double findKth(int A[],int s1,int e1,int B[],int s2,int e2,int k){
		 int m=e1-s1+1;
		 int n=e2-s2+1;
		 if(m<0||n<0) return -1;
		 if(m>n) return findKth(B,s2,e2,A,s1,e1,k);
		 if(s1>e1) return B[s2+k-1];
		 if(s2>e2) return A[s1+k-1];
		 //not A[0] B[0]
		 if(k==1) return A[s1]<B[s2]?A[s1]:B[s2];
		 //得到第k/2个元素
		 int midA=(k>>1)<m?(k>>1):m;
		 int midB=k-midA;
		 //若A的midA值小于B的midA值，舍弃A的前midA个元素，在剩余中查找第K-midA大的元素
		 if (A[s1+midA-1]<B[s2+midB-1]){
			 return findKth(A,s1+midA,e1,B,s2,e2,k-midA);
		 }else if(A[s1+midA-1]>B[s2+midB-1]){
			 return findKth(A,s1,e1,B,s2+midB,e2,k-midB);
		 }else{
			 return A[s1+midA-1];
		 }		 
		 
	 }
	
}
