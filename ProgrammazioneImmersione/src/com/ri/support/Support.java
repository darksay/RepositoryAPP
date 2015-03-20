package com.ri.support;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import com.ri.main.Launcher;

public class Support {
	
	public static void calcConsumi(){
		Double consumoLitriMedi = Double.parseDouble(Launcher.inputConsumoLitriMedi.getText());
		
		Double fondoRealeProf = Double.parseDouble(Launcher.inputFondoRealeProf.getText());
		Double fondoRealeTempo = Double.parseDouble(Launcher.inputFondoRealeTempo.getText());
		
		Double sostaProfondaProf = Double.parseDouble(Launcher.inputSostaProfondaProf.getText());
		Double sostaProfondaTempo = Double.parseDouble(Launcher.inputSostaProfondaTempo.getText());
		
		Double risalitaProf = Double.parseDouble(Launcher.inputRisalitaProf.getText());
		Double risalitaTempo = Double.parseDouble(Launcher.inputRisalitaTempo.getText());
		
		Double sostaSicurezzaProf = Double.parseDouble(Launcher.inputSostaSicEmersioneProf.getText());
		Double sostaSicurezzaTempo = Double.parseDouble(Launcher.inputSostaSicEmersioneTempo.getText());
		
		fondoRealeProf = fondoRealeProf/10+1;
		sostaProfondaProf = sostaProfondaProf/10+1;
		risalitaProf = risalitaProf/10+1;
		sostaSicurezzaProf = sostaSicurezzaProf/10+1;
		
		Double fondoRealeConsumo = fondoRealeProf*fondoRealeTempo*consumoLitriMedi;
		Double sostaProfondaConsumo = sostaProfondaProf*sostaProfondaTempo*consumoLitriMedi;
		Double risalitaConsumo = risalitaProf*risalitaTempo*consumoLitriMedi;
		Double sostaSicurezzaConsumo = sostaSicurezzaProf*sostaSicurezzaTempo*consumoLitriMedi;
		Double consumoTotale =  fondoRealeConsumo+sostaProfondaConsumo+risalitaConsumo+sostaSicurezzaConsumo;
		
		Launcher.inputFondoRealeConsumo.setText(fondoRealeConsumo.toString());
		Launcher.inputSostaProfondaConsumo.setText(sostaProfondaConsumo.toString());
		Launcher.inputRisalitaConsumo.setText(risalitaConsumo.toString());
		Launcher.inputSostaSicEmersioneConsumo.setText(sostaSicurezzaConsumo.toString());
		Launcher.inputConsumoTotale.setText(consumoTotale.toString());
		
		
	}
	
	public static void calcRisalita(){
		Double fondoRealeProf = Double.parseDouble(Launcher.inputFondoRealeProf.getText());
		if(fondoRealeProf > 6){
			Double risalitaProf = 0D;
			Double risalitaTemp = 0D;
			risalitaProf = (fondoRealeProf-6)/2+6;
			risalitaTemp = ((fondoRealeProf - 6)* (60/9))/60;
			BigDecimal risalitaTempRound = new BigDecimal(risalitaTemp);
			BigDecimal roundOff = risalitaTempRound.setScale(0, BigDecimal.ROUND_UP);
			Launcher.inputRisalitaProf.setText(risalitaProf.toString());
			Launcher.inputRisalitaTempo.setText(roundOff.toString());
			calcConsumi();
		}
	}
	
	public static void calcDeepStop(){
		Double fondoRealeProf = Double.parseDouble(Launcher.inputFondoRealeProf.getText());
		Double deepStopProf = 0D;
		Double deepStopTemp = 3D;
		if(fondoRealeProf > 18){
			deepStopProf = (fondoRealeProf)/2;
			Launcher.inputSostaProfondaProf.setText(deepStopProf.toString());
			Launcher.inputSostaProfondaTempo.setText(deepStopTemp.toString());
			calcConsumi();
		}else{
			JOptionPane.showMessageDialog(null, "Il deep stop si effettua oltre i 18 metri");
		}
		
	}

}
