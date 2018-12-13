import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test1 extends JFrame{
	MyPanel mp=null;
	public static void main(String args []){
		Test1 test1=new Test1();
		
	}
	Test1(){
		mp=new MyPanel();
		this.add(mp);
		// mp是monitor,监听this这个事件源
		this.addMouseListener(mp);
		this.setSize(400,300);
		this.setVisible(true);
	}

}

// 1. MyPanel知道鼠标按下的消息,且知道点击的位置(x,y)
// 2. MyPanel 知道哪个键被按下
class MyPanel extends JPanel implements MouseListener{
	public void paint(Graphics g){

		super.paint(g);
	}

	public void mouseClicked(MouseEvent e){
		System.out.println("鼠标点击了　x="+e.getX()+" y="+e.getY());
	}
	public void mouseEntered(MouseEvent e){
		System.out.println("鼠标来了");
	}
	public void mouseExited(MouseEvent e){
		System.out.println("鼠标走了");
	}
	public void mouseReleased(MouseEvent e){
	}
	
	public void mousePressed(MouseEvent e){
	}




}
