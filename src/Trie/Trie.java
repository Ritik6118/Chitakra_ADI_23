package Trie;

import java.util.*;

class Node{
	char val;
	HashMap<Character,Node> child=new HashMap<>();
	boolean isTerminal;
	int count=1;
}

public class Trie {
	private Node root;
	Trie(){
		Node nn=new Node();
		nn.val='*';
		this.root=nn;
	}
	public void insert(String s) {
		Node temp=root;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(temp.child.containsKey(ch)) {
				temp=temp.child.get(ch);
				temp.count++;
			}
			else {
				Node nn=new Node();
				nn.val=ch;
				temp.child.put(ch, nn);
				temp=nn;
			}
		}
		temp.isTerminal=true;
	}
	public boolean search(String s) {
		Node temp=root;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(temp.child.containsKey(ch)) {
				temp=temp.child.get(ch);
			}
			else {
				return false;
			}
		}
		return temp.isTerminal;
	}
	public boolean startsWith(String s) {
		Node temp=root;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(temp.child.containsKey(ch)) {
				temp=temp.child.get(ch);
			}
			else {
				return false;
			}
		}
		return true;
	}
	public int count(String s) {
		Node temp=root;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(temp.child.containsKey(ch)) {
				temp=temp.child.get(ch);
			}
			else {
				return 0;
			}
		}
		return temp.count;
	}
}
