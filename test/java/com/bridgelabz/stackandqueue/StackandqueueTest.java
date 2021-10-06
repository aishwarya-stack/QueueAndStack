package com.bridgelabz.stackandqueue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class StackandqueueTest 
{
	@Test
	public void given3numbersWhenAddedToStackShouldHaveLastAddedNode()
	{
		MyStack mystack=new MyStack();
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
		mystack.push(myFirstNode);
		mystack.push(mySecondNode);
		mystack.push(myThirdNode);
		INode myNode=mystack.peak();
		mystack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
		}
	
	@Test
	public void given3numbersWhenPopedShouldMatchWithLastAddedNode()
	{
		MyStack mystack=new MyStack();
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
		mystack.push(myFirstNode);
		mystack.push(mySecondNode);
		mystack.push(myThirdNode);
		INode popedNode=mystack.pop();
		mystack.printStack();
		Assert.assertEquals(myThirdNode, popedNode);
		}
}
