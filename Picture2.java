
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Klling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture2
{
    private Square sky;
    private Square ground;
    private Square trunk;
    private Square trunk2;
    private Square trunk3;
    private Square trunk4;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Triangle tree5;
    private Triangle tree6;
    private Triangle tree7;
    private Triangle tree8;
    private Triangle tree9;
    private Circle sun;
    private Circle cloud;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Person person;
    private Person person2;
    private Square blanket;

    /**
     * Constructor for objects of class Picture
     */
    public Picture2()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-400);
        sky.moveVertical(-500);
        sky.changeSize(600);
        sky.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveHorizontal(-320);
        ground.moveVertical(100);
        ground.changeSize(600);
        ground.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("brown");
        trunk.moveHorizontal(-90);
        trunk.moveVertical(85);
        trunk.changeSize(15);
        trunk.makeVisible();
               
        tree1 = new Triangle();  
        tree1.changeSize(40, 40);
        tree1.moveHorizontal(20);
        tree1.moveVertical(5);
        tree1.makeVisible();
        
        tree2 = new Triangle();  
        tree2.changeSize(40, 40);
        tree2.moveHorizontal(20);
        tree2.moveVertical(18);
        tree2.makeVisible();
        
        tree3 = new Triangle();  
        tree3.changeSize(40, 40);
        tree3.moveHorizontal(20);
        tree3.moveVertical(30);
        tree3.makeVisible();
        
        trunk2 = new Square();
        trunk2.changeColor("brown");
        trunk2.moveHorizontal(-150);
        trunk2.moveVertical(85);
        trunk2.changeSize(15);
        trunk2.makeVisible();
               
        tree4 = new Triangle();  
        tree4.changeSize(40, 40);
        tree4.moveHorizontal(-40);
        tree4.moveVertical(5);
        tree4.makeVisible();
        
        tree5 = new Triangle();  
        tree5.changeSize(40, 40);
        tree5.moveHorizontal(-40);
        tree5.moveVertical(18);
        tree5.makeVisible();
        
        tree6 = new Triangle();  
        tree6.changeSize(40, 40);
        tree6.moveHorizontal(-40);
        tree6.moveVertical(30);
        tree6.makeVisible();
        
        trunk3 = new Square();
        trunk3.changeColor("brown");
        trunk3.moveHorizontal(-210);
        trunk3.moveVertical(85);
        trunk3.changeSize(15);
        trunk3.makeVisible();
               
        tree7 = new Triangle();  
        tree7.changeSize(40, 40);
        tree7.moveHorizontal(-100);
        tree7.moveVertical(5);
        tree7.makeVisible();
        
        tree8 = new Triangle();  
        tree8.changeSize(40, 40);
        tree8.moveHorizontal(-100);
        tree8.moveVertical(18);
        tree8.makeVisible();
        
        tree9 = new Triangle();  
        tree9.changeSize(40, 40);
        tree9.moveHorizontal(-100);
        tree9.moveVertical(30);
        tree9.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-100);
        sun.changeSize(80);
        sun.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(-50);
        cloud.moveVertical(-50);
        cloud.changeSize(40);
        cloud.makeVisible();
        
        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveHorizontal(-35);
        cloud1.moveVertical(-40);
        cloud1.changeSize(40);
        cloud1.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(-35);
        cloud2.moveVertical(-70);
        cloud2.changeSize(50);
        cloud2.makeVisible();
        
        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(-70);
        cloud3.moveVertical(-60);
        cloud3.changeSize(45);
        cloud3.makeVisible();
        
        blanket = new Square();
        blanket.changeColor("red");
        blanket.moveHorizontal(-37);
        blanket.moveVertical(100);
        blanket.changeSize(35);
        blanket.makeVisible();
        
        person = new Person();
        person.moveHorizontal(20);
        person.moveVertical(40);
        person.changeSize(30, 20);
        person.makeVisible();
        
        person2 = new Person();
        person2.moveHorizontal(5);
        person2.moveVertical(40);
        person2.changeSize(30, 20);
        person2.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("black");
            ground.changeColor("white");
            tree1.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("blue");
            ground.changeColor("blue");
            tree1.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
