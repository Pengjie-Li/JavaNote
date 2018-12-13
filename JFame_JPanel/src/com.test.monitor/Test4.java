import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test4 extends JFrame{
	MyPanel4 mp=null;
	public static void main(String args []){
		Test4 test1=new Test4();
		
	}
	Test4(){
		mp=new MyPanel4();
		this.add(mp);
		// mp是monitor,监听this这个事件源
		// 任何人都可以做监听
		// 随便定义一个类就可以做监听
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);

		this.setSize(400,400);
		this.setVisible(true);
	}

}

// 1. MyPanel4知道鼠标按下的消息,且知道点击的位置(x,y)
// 2. MyPanel4 知道哪个键被按下
// 
class MyPanel4 extends JPanel implements WindowListener,MouseListener,KeyListener,MouseMotionListener{
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
	public void windowActivated(WindowEvent e){

		System.out.println("窗口激活了");

	}

	public void windowClosed(WindowEvent e){
		System.out.println("窗口关闭了");

	}
	public void windowClosing(WindowEvent e){

		System.out.println("窗口将要关闭了");

	}
	public void windowIconified(WindowEvent e){

	}

	public void windowDeiconified(WindowEvent e){

	}
	public void windowOpened(WindowEvent e){
		
		System.out.println("窗口打开了");

	}



	public void windowDeactivated(WindowEvent e){

		System.out.println("窗口最小化");

	}












}
