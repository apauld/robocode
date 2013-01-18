package small.wonder;

import robocode.*;
import java.awt.Color;

public class Vicki extends Robot
{
	/**
	 * run: Vicki's default behavior test
	 */
	public void run() {
		//TODO Initialize robot here 

		setColors(Color.red,Color.white,Color.white); // body,gun,radar 

		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			while(true){
				
				if(getHeading()>180){
					turnRight(360-getHeading());
				}
				else{
					turnLeft(getHeading());
				}
				
				back(getY()+10);
				turnLeft(90);
				ahead(getX()-10);
				turnRight(90);
				ahead(getBattleFieldHeight()-10);
				turnRight(90);
				ahead(getBattleFieldHeight()-10);
				turnRight(90);
			}
			
		}
	}
	
	public void turnToDegree(Double degree){
		if(getHeading()>180){
			turnRight(360-getHeading());
		}
		else{
			turnLeft(getHeading());
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//back(10);
	}

	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		if(e.getBearing() < 0){
			out.println("Wall Bearing:"+e.getBearing());
			turnRight(90);
			ahead(20);
		}
		else{
			out.println("Wall Bearing:"+e.getBearing());
			turnLeft(90);
			ahead(20);
		}
			
	}	

	public void onBulletHit(BulletHitEvent event) {
		
	}
	
	public void onHitRobot(HitRobotEvent event) {
		
	}

}
