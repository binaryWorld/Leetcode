
public class SortList {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author shf  
	 * @date 2014-8-31 下午8:31:24 
	 * @version V1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	
	/**
	 * 对一个链表进行归并排序。
	 */
	/**
	 * 知识点1：归并排序的整体思想
	 * 知识点2：找到一个链表的中间节点的方法
	 * 知识点3：合并两个已排好序的链表为一个新的有序链表
	 */
	
	public ListNode sortList(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}
		ListNode middle=getMiddleofList(head);
		ListNode next=middle.next;
		middle.next=null;
		return mergeList(sortList(head),sortList(next));
        
    }
	/**
	 * 找到一个链表的中间节点的方法  fast-low方法
	 */
	public ListNode getMiddleofList(ListNode head){
		ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	/**
	 * 合并两个排好序的链表
	* @Title: mergeList 
	 */
	public ListNode mergeList(ListNode a,ListNode b){
		
		ListNode tmpHead=new ListNode(-1);
		ListNode curr=tmpHead;
		
		while(a!=null && b!=null){
			if(a.val<b.val){
				curr.next=a;
				a=a.next;
			}else{
				curr.next=b;
				b=b.next;
			}
			curr=curr.next;
		}	
		if(a!=null){
			curr.next=a;	
		}
		if(b!=null){
			curr.next=b;	
		}
		
		return tmpHead.next;
	}
	
}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
}
