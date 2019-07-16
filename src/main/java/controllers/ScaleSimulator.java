package controllers;

import java.util.Random;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.TextField;

public class ScaleSimulator extends Thread{
	
	public volatile boolean exit = false;
	public Random rand;
	private int min=5,max=10;
	public static int randomNum;
	public TextField weight;
	
	
	public ScaleSimulator (TextField weight) {
		this.weight = weight;
	  rand = new Random();
	}
	
	@Override
	public void run() {
		while(!exit) {
			randomNum =rand.nextInt((max-min)+1)+min;
			Platform.runLater(new Runnable() {
				
				@Override
				public void run() {
					try {
						weight.setText(randomNum+"");
						System.out.println(randomNum);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	
	public int getRandomNum() {
		return randomNum;
	}



		
	}
	
