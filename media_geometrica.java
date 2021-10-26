package strategy;

import java.lang.Math;

public class media_geometrica implements ICalcMedia,IMudaSituacao {

	@Override
	public void MudaSituacao(Disciplina d) 
	{
		if(d.getMedia() > 7)
		{
			System.out.println("aprovação");
		}

		else
		{
			System.out.println("reprovação");
		}
			
	}

	@Override
	public void CalculaMedia(Disciplina d) 
	{
		d.setMedia((float)Math.sqrt(d.getP1()+d.getP2()));
	}
	
}