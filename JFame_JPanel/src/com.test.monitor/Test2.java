import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test2 extends JFrame{
	MyPanel2 mp=null;
	public static void main(String args []){
		Test2 test1=new Test2();
		
	}
	Test2(){
		mp=new MyPanel2();
		this.add(mp);
		// mp是monitor,监听this这个事件源
		// 任何人都可以做监听
		// 随便定义一个类就可以做监听
		this.addMouseListener(mp);
		this.addKeyListener(mp);

		this.setSize(400,300);
		this.setVisible(true);
	}

}

// 1. MyPanel2知道鼠标按下的消息,且知道点击的位置(x,y)
// 2. MyPanel2 知道哪个键被按下
// 
class MyPanel2 extends JPanel implements MouseListener,KeyListener{
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

	public void keyPressed(KeyEvent e){
		System.out.println(e.getKeyChar()+"键被按下");
	}
	public void keyReleased(KeyEvent e){
	}
	public void keyTyped(KeyEvent e){
	}








}
