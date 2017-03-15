package hello;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//note this is an ongoing project that stills needs to be work on.
public class adventure_program {
public static void main(String[] args)
{
	
	char array[][] = {
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'},
					 {'-','-','-','-','-','-','-','-'}
					 };
	int arraya[][] = {
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
			};
	
	List<knight> knight1 = new ArrayList();
	int knightp1 = 0;
	List<mage> mage1 = new ArrayList();
	int magep1 = 0;
	List<archer> archer1 = new ArrayList();
	
	int archerp1 = 0;

	
	List<knight> knight2 = new ArrayList();
	List<mage> mage2 = new ArrayList();
	List<archer> archer2 = new ArrayList();

	int knightp2 = 0;
	int magep2 = 0;
	int archerp2 = 0;

	int i,j;
	Scanner reader = new Scanner(System.in);
	System.out.println("How many players???");
	int players = reader.nextInt();
	int k;
	for(k=0;k<players;k++)
	{
		System.out.println("where is "+k+" castle???");
		j = reader.nextInt();
		i = reader.nextInt();
		array[j][i] = 'c';
	}
	int l;
	int p;
	p=0;
int action;
while(p!=1)
{
	//first person goes
	System.out.println("first person choose what you want to do??");
	System.out.println("1-place a person 2-attack");
	action = reader.nextInt();
	if(action ==1)
	{
		System.out.println("who do you want to place??? 1-archer,2-mage,3-knight");
		action = reader.nextInt();
	
		if(action==1)
		{
			System.out.println("where is the archer?");
			j = reader.nextInt();
			i = reader.nextInt();
			archer a = new archer();
			a.setx(i);
			a.sety(j);
			archerp1++;
			archer1.add(a);
			array[j][i]='a';
			
		}
		else if(action==2)
		{
			System.out.println("where is the mage?");
			j = reader.nextInt();
			i = reader.nextInt();
			array[j][i]='m';
			mage ma = new mage();
			magep1++;
			ma.setx(i);
			ma.sety(j);
			mage1.add(ma);
			array[j][i]='m';
		}
		else if(action==3)
		{
			System.out.println("where is the knight?");
			j = reader.nextInt();
			i = reader.nextInt();
			knight kn = new knight();
			knightp1++;
			array[j][i]='k';
			kn.setx(i);
			kn.sety(j);
			knight1.add(kn);
			
		}
	}
	else if(action == 2)
	{
		System.out.println("1-mage 2-archer");
		action = reader.nextInt();
		System.out.println(" pick the location of the person you want to attack");
		i = reader.nextInt();
		j = reader.nextInt();
		if(action==1)
		{
			//start here
			for(k=0;k<mage1.size();k++)
			{
				if(mage1.get(k).getx()==i)
				{
					if(mage1.get(k).gety()==j)
					{
						System.out.println("who do you want to attack??? pick a number??");
						mage1.get(k).magic(arraya, i, j);
					}
				}
			}
		}
		else if (action ==2)
		{
			
		}
	}
	for(k =0;k<array.length;k++)
	{
		for(l=0;l<array[0].length;l++)
		{
			System.out.print(array[k][l]);
		}
		System.out.println("");
	}
	
	
	
	System.out.println("second person choose what you want to do??");
	System.out.println("1-place a person 2-attack");
	action = reader.nextInt();
	if(action ==1)
	{
		System.out.println("who do you want to place??? 1-archer,2-mage,3-knight");
		action = reader.nextInt();
	
		if(action==1)
		{
			System.out.println("where is the archer?");
			j = reader.nextInt();
			i = reader.nextInt();
			archer a = new archer();
			a.x=i;
			a.y=j;
			archer2.add(a);
			array[j][i]='a';
			
		}
		else if(action==2)
		{
			System.out.println("where is the mage?");
			j = reader.nextInt();
			i = reader.nextInt();
			array[j][i]='m';
			mage ma = new mage();
			ma.x=i;
			ma.y=j;
			mage2.add(ma);
			array[j][i]='m';
		}
		else if(action==3)
		{
			System.out.println("where is the knight?");
			j = reader.nextInt();
			i = reader.nextInt();
			knight kn = new knight();
			array[j][i]='k';
			kn.x = i;
			kn.y = j;
			knight2.add(kn);
			
		}
	}
	for(k =0;k<array.length;k++)
	{
		for(l=0;l<array[0].length;l++)
		{
			System.out.print(array[k][l]);
		}
		System.out.println("");
	}
	
	
	for(k =0;k<array.length;k++)
	{
		for(l=0;l<array[0].length;l++)
		{
			System.out.print(arraya[k][l]);	System.out.println("1-place a person 2-attack");
			action = reader.nextInt();

		}
		System.out.println("");
	}
}
}
	
}
class character
{
	public int x,y;
	int health;
	int attack;
	String arrayattacks[] = {"attack","arrows","bomb","magic"};
	String arraydefend[]  = {"high block","shield","wall","force field"};
	int attackpower[]={5,10,25,35};
	int defendpower[]={3,2,3,5};
	int attackuses[]={100,30,10,5};
	int defenduses[]={100,30,10,5};
	   public void setx(int x) {
	       this.x = x;
	    }
	   public void sety(int y) {
	       this.y = y;
	    }	   
	   
	    public int getx() {
	        return x;
	     }
	    public int gety() {
	        return y;
	     }
	public int[][] bombo(int array[][],int i,int j)
	{
		
		if(j<2)
		{
			array[j+1][i]+=1;
		}
		if(2>j&&j>0)
		{
			array[j-1][i]+=1;
		}
		if(i<3)
		{
			array[j][i+1]+=1;
		}
		if(3>i&&i>0)
		{
			array[j][i-1]+=1;
		}
		return array;
	}
	public int[][] magic(int array[][],int i, int j)
	{
		if(j<2)
		{
			array[j+1][i]+=1;
		}
		if(2>j&&j>0)
		{
			array[j-1][i]+=1;
		}
		if(i<3)
		{
			array[j][i+1]+=1;
		}
		if(3>i&&i>0)
		{
			array[j][i-1]+=1;
		}
		return array;
	}
	;
}
class archer extends character
{
	int health = 30;
	int attackpower[] ={10,5,3,3}; 
}
class knight extends character
{
	int health = 50;
	int attackpower[] ={10,5,3,0};
}
class mage extends character
{
	int health = 30;
	int attackpower[] ={10,5,3,0};
}
