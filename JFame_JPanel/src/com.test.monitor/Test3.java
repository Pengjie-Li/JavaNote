import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test3 extends JFrame{
	MyPanel3 mp=null;
	public static void main(String args []){
		Test3 test1=new Test3();
		
	}
	Test3(){
		mp=new MyPanel3();
		this.add(mp);
		// mp是monitor,监听this这个事件源
		// 任何人都可以做监听
		// 随便定义一个类就可以做监听
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);

		this.setSize(400,300);
		this.setVisible(true);
	}

}

// 1. MyPanel3知道鼠标按下的消息,且知道点击的位置(x,y)
// 2. MyPanel3 知道哪个键被按下
// 
class MyPanel3 extends JPanel implements MouseListener,KeyListener,MouseMotionListener{
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

	public void mouseDragged(MouseEvent e){
	}
	public void mouseMoved(MouseEvent e){
		System.out.println("鼠标在移动");
	}










}
