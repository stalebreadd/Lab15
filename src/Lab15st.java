// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Me.jpg");
		picture2 = getImage(getDocumentBase(),"greetings-from-nj-1024x656.jpg");
		picture3 = getImage(getDocumentBase(),"teaching.jpg");
		picture4 = getImage(getDocumentBase(),"images.jpg");
		picture5 = getImage(getDocumentBase(),"hobbies-for-man.jpg");
		picture6 = getImage(getDocumentBase(),"PrincessSakura.jpg");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		tracker.addImage(picture6,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
		Expo.setColor(g,Expo.yellow);
		Expo.drawThickPreciseSpiral(g,410,470,375,150,115);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,405,255,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Shane Staley.  That is me on the inside. ",20,150);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 2",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture2,105,255,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in New Jersey.",100,200);
		Expo.drawString(g,"Click once to continue.",750,250);
	}

	public void page3(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 3",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,360,240,1460,850,50);
		g.drawImage(picture3,405,255,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I teach nothing at all.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page4(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 4",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,110,200,710,670,50);
		g.drawImage(picture5,150,225,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I don't have hobbies.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	public void page5(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 5",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,60,120,660,165,50);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g, Expo.black);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I enjoy playing videogames.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	public void page6(Graphics g)
	{
		Expo.setBackground(g,Expo.white);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 6",200,100);
		g.drawImage(picture6,200,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I like to watch anime and on occasion hentai",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}




}