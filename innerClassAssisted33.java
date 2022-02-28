package com.phase.project;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class innerClassAssisted33 {
	public static void main(String[] args) {
		AnonymousInnerClass a = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      a.display();
		   }
		}


