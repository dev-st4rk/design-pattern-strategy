package strategy;

public class media_aritmetica implements ICalcMedia,IMudaSituacao {


	@Override
	public void MudaSituacao(Disciplina d) 
	{
		if(d.getMedia() > 5)
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
		d.setMedia((d.getP1() + d.getP2())/2);
	}

}